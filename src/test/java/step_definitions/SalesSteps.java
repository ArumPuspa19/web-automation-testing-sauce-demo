package step_definitions;

import io.cucumber.java.en.And;
import org.example.pageObject.CartPage;
import org.openqa.selenium.WebDriver;

public class SalesSteps {
    private WebDriver webDriver;

    public SalesSteps(){
        super();
        this.webDriver = Hooks.webDriver;

    }

}
