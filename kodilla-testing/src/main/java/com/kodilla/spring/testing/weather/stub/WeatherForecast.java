package com.kodilla.spring.testing.weather.stub;

import java.util.*;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverage() {
        double averageTemp = 0.0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            averageTemp += temperature.getValue();
        }
        return averageTemp / temperatures.getTemperatures().size();
    }

    public double calculateMedian() {
        Collection<Double> tempCollection = temperatures.getTemperatures().values();
        List<Double> tempList = new ArrayList<>(tempCollection);
        Collections.sort(tempList);

        int size = tempList.size();
        int index = 0;
        index = size / 2;
        if (size % 2 == 0) {
            return (tempList.get(index - 1) + tempList.get(index)) / 2;
        } else {
            return tempList.get(index);
        }
    }
}

