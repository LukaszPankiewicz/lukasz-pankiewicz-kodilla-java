package com.kodilla.testing22.ebay;

import com.kodilla.testing22.config.WebDriverConfigs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.kodilla.testing22.google.GoogleTestingApps.SEARCHFIELD;

public class EBayTestingApp {

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfigs.getDriver(WebDriverConfigs.CHROME);
        driver.get("https://www.ebay.com");

        WebElement searchField = driver.findElement(By.name(SEARCHFIELD));      // [4]
        searchField.sendKeys("Laptop");

    }
}

