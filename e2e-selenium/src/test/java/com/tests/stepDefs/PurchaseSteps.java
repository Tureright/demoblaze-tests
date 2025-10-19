package com.tests.stepDefs;

import com.tests.pages.CartPage;
import com.tests.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.tests.core.DriverManager;


public class PurchaseSteps {
    private WebDriver driver;
    private HomePage homePage;
    private CartPage cartPage;

    @Given("Estoy en el home de demoblaze")
    public void estoyEnElHomeDeDemoblaze() {
        driver = DriverManager.getDriver();
        homePage = new HomePage(driver);
        homePage.navigateToHome();
        DriverManager.screenShot("Estoy en el home de Demoblaze");
    }

    @When("Agrego los produtos {string} y {string} al carrito")
    public void agregoLosProdutosYAlCarrito(String product1, String product2) {

        homePage.addProduct(product1);
        homePage.addProduct(product2);
    }

    @And("Hago clic en el botón de Place Order dentro del carrito de compras")
    public void hagoClicEnElBotonDePlaceOrderDentroDelCarritoDeCompras() {
        homePage.goToCart();
        DriverManager.screenShot("Productos agregados");

        cartPage = new CartPage(driver);
        Assert.assertTrue("El carrito debe tener dos elementos agregados", cartPage.elementsAreDisplayed(2));
        cartPage.placeOrder();
        DriverManager.screenShot("Form abierto para realizar el pago");

    }

    @And("Completo el formulario de compra con los datos {string}, {string}, {string}, {string}, {string} y {string}")
    public void completoElFormularioDeCompraConLosDatosY(String name, String country, String city, String creditCard, String month, String year) {
        cartPage.fillCheckoutForm(name, country, city, creditCard, month, year);
        DriverManager.screenShot("Formulario lleno con datos inconsistentes");
    }

    @And("Finalizo la compra")
    public void finalizoLaCompra() {
        cartPage.purchase();
    }

    @Then("No me permite comprar productos con los datos proporcionados")
    public void noMePermiteComprarProductosConLosDatosProporcionados() {
        boolean isRejected = cartPage.isPurchaseRejected();
        DriverManager.screenShot("Mensaje posterior al checkout");
        Assert.assertTrue("La compra debería ser rechazada", isRejected);

    }

}
