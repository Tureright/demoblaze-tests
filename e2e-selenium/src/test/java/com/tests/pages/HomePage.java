package com.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

public class HomePage extends Base {

    By samsungS6Locator = By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a");
    By nexus6Locator = By.xpath("//*[@id=\"tbodyid\"]/div[3]/div/div/h4/a");
    By addToCartButtonLocator = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");
    By homeLinkLocator = By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a");
    By cartLinkLocator = By.id("cartur");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void navigateToHome() {
        navigateTo("https://www.demoblaze.com");
    }


    public void addProduct(String product) {
        if (Objects.equals(product, "Samsung galaxy s6")) click(samsungS6Locator);
        if (Objects.equals(product, "Nexus 6")) click(nexus6Locator);

        click(addToCartButtonLocator);
        acceptAlert();
        click(homeLinkLocator);
    }

    public void goToCart() {
        click(cartLinkLocator);
    }
}
