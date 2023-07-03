package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.example.pageObject.CartPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CartSteps {
    private WebDriver webDriver;

    public CartSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("User already on cart page")
    public void verifyCartPage() {
        CartPage cartPage = new CartPage(webDriver);
        Assert.assertTrue(cartPage.verifyCartPage());
    }

    @And("User clicks remove product {string}")
    public void removeProduct(String rmvProduct) {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.product(rmvProduct);
    }

    @And("User click Checkout button")
    public void checkout() {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.checkOut2();

    }
}
