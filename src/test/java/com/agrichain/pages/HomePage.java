package com.agrichain.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    By inputField = By.id("inputString");
    By submitButton = By.id("submitButton");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterInput(String input) {
        driver.findElement(inputField).clear();
        driver.findElement(inputField).sendKeys(input);
    }

    public void clickSubmit() {
        driver.findElement(submitButton).click();
    }

    public void submitInput(String input) {
        enterInput(input);
        clickSubmit();
    }
}