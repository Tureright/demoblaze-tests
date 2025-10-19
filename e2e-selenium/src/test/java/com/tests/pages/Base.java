package com.tests.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Base {
    private final WebDriver driver;
    protected WebDriverWait wait;
    private static final int DEFAULT_WAIT_SECONDS = 10;

    public Base(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_WAIT_SECONDS));
    }

    public WebElement findElement(By locator) {
        return waitForElementClickable(locator);
    }
    public List<WebElement> findElements(By locator) {
        return waitForElementsVisible(locator);
    }

    public void click(By locator) {
        WebElement element = waitForElementClickable(locator);
        element.click();
    }

    public void type(String inputText, By locator){
        WebElement element = waitForElementClickable(locator);
        element.sendKeys(inputText);
    }


    protected void acceptAlert() {
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    //-- Navigation --
    protected void navigateTo(String url) {
        driver.get(url);
    }



    //-- Explicit Waits --

    protected WebElement waitForElementClickable(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected List<WebElement> waitForElementsVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

}

