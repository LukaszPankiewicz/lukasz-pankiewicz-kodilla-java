package com.kodilla.spring.stream.lambda;

public class ExecuteSaySomething implements Executor {

    @Override
    public void process() {
        System.out.println("This is an example text.");
    }
}
