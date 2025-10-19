package com.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class CartPage extends Base{
    By tableRowsLocator = By.cssSelector("#tbodyid tr");
    By placeOrderButtonLocator = By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button");
    By nameFormLocator = By.id("name");
    By countryFormLocator = By.id("country");
    By cityFormLocator = By.id("city");
    By creditCardFormLocator = By.id("card");
    By monthFormLocator = By.id("month");
    By yearFormLocator = By.id("year");
    By purchaseButtonLocator = By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]");
    By successMessageLocator = By.xpath("/html/body/div[10]/h2");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void fillCheckoutForm(String name, String country, String city, String creditCard, String month, String year) {
        type(name, nameFormLocator);
        type(country, countryFormLocator);
        type(city, cityFormLocator);
        type(creditCard, creditCardFormLocator);
        type(month, monthFormLocator);
        type(year,yearFormLocator);
    }


    public boolean elementsAreDisplayed(int elementsQuantity) {

        List<WebElement> rows = findElements(tableRowsLocator);
        return rows.size() == elementsQuantity;
    }

    public void placeOrder() {
        click(placeOrderButtonLocator);
    }

    public void purchase() {
        click(purchaseButtonLocator);
    }

    public boolean isPurchaseRejected() {
        WebElement successMessage = findElement(successMessageLocator);
        return (!successMessage.getText().equals("Thank you for your purchase!"));
    }
}
