package org.example.pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CartPage {
    public static WebDriver driver;

    public CartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//div[@class='cart_desc_label']")
    private WebElement displayCartPage;

    @FindBy(xpath = "//button[@id='checkout']")
    private  WebElement checkOut;

    public void checkOut2(){
        checkOut.click();
    }

    public boolean verifyCartPage() {
        return displayCartPage.isDisplayed();
    }
    public void product(String productNama){
        String productRmv = "//div[contains(text(),'" + productNama +"')]/ancestor:div[@class='cart_item_label']//*[contains(@id,'remove')]";
    }
}
