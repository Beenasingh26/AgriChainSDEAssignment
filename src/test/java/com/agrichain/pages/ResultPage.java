package com.agrichain.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultPage {

    WebDriver driver;

    By resultElement = By.id("result");

    public ResultPage(WebDriver driver) {

        this.driver = driver;
    }

    public String getResult() {

        return driver.findElement(resultElement).getText();
    }
}