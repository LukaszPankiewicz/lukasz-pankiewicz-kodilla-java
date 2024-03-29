package com.kodilla.testing22.google;

import com.kodilla.testing22.config.WebDriverConfigs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTestingApps {

    public static final String SEARCHFIELD = "q";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfigs.getDriver(WebDriverConfigs.CHROME);
        driver.get("https://www.google.com");

        WebElement searchField = driver.findElement(By.name(SEARCHFIELD));      // [4]
        searchField.sendKeys("Kodilla");
        searchField.submit();
    }
}

