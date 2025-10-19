package com.tests.stepDefs;

import com.tests.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static com.tests.core.DriverManager.getDriver;
import static com.tests.core.DriverManager.screenShot;

public class PurchaseStepdefs {
    private WebDriver driver;
    private HomePage homePage;
    @Given("Estoy en el home de demoblaze")
    public void estoyEnElHomeDeDemoblaze() {
        driver = getDriver();
        driver.get("https://demoblaze.com/");
        screenShot();
    }

    @When("Agrego los produtos {string} y {string} al carrito")
    public void agregoLosProdutosYAlCarrito(String arg0, String arg1) {
        homePage.addSamsungS6ToCart();
    }

    @And("Hago clic en el botón de {string} dentro del cerrito de compras")
    public void hagoClicEnElBotonDeDentroDelCerritoDeCompras(String arg0) {
    }

    @And("Completo el formulario de compra con los datos {string}, {string}, {string}, {string}, {string} y {string}")
    public void completoElFormularioDeCompraConLosDatosY(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) {
    }

    @And("Finalizo la compra")
    public void finalizoLaCompra() {
    }

    @Then("No me permite comprar productos con los datos proporcionados")
    public void noMePermiteComprarProductosConLosDatosProporcionados() {
    }


}
