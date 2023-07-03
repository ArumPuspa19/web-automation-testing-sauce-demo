package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.CartPage;
import org.example.pageObject.ProductPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductSteps {
    private WebDriver webDriver;
    public ProductSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @When("User sort product list by {string}")
    public void selectProductSort(String sort) {
        ProductPage productPage = new ProductPage(webDriver);
        productPage.selectProductFilter(sort);
    }

    @And("User click item {string}")
    public void click1Product(String namProduct) {
        ProductPage productPage = new ProductPage(webDriver);
        productPage.pickProduct(namProduct);

    }
    @Then("User clicks cart button")
    public void clickCart(){
        ProductPage productPage = new ProductPage(webDriver);
        productPage.clickCart();

    }
}
