package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.CheckoutPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckoutSteps {
    private WebDriver webDriver;

    public CheckoutSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }
    @Then("User already on Checkout Information Page")
    public void verifyCheckoutForm(){
        CheckoutPage checkoutPage = new CheckoutPage(webDriver);
        Assert.assertTrue(checkoutPage.verifyCheckoutForm());
    }
    @When("User input {string} as firstName , input {string} as lastName and input {string} as posCode")
    public void inputCredential(String firstName, String lastName, String posCode) {
        CheckoutPage checkoutPage = new CheckoutPage(webDriver);
        checkoutPage.setFirstName(firstName);
        checkoutPage.setLastName(lastName);
        checkoutPage.setPosCode(posCode);

    }
    @And("User click Continue Button")
    public void clickContinue(){
        CheckoutPage checkoutPage = new CheckoutPage(webDriver);
        checkoutPage.btnLanjut();
    }
    @Then("User already on Checkout Overview")
    public void verifyCheckoutOverview() {
        CheckoutPage checkoutPage = new CheckoutPage(webDriver);
        checkoutPage.verifyCheckoutOverview();
    }
    @Then("Verify button finish")
    public void clickFinish() {
        CheckoutPage checkoutPage = new CheckoutPage(webDriver);
        checkoutPage.clickFinish();
    }

    @Then("User already on Checkout: Complete! page")
    public void verifyCheckoutCompletePage() {
        CheckoutPage checkoutPage = new CheckoutPage(webDriver);
        Assert.assertTrue(checkoutPage.verifyFinishOrder());
    }
}

