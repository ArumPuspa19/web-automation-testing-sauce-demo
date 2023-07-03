package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    private WebDriver driver;

    public CheckoutPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver =driver;
    }
    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstName;
    public void setFirstName(String user) {
        firstName.sendKeys(user);
    }

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastName;
    public void setLastName(String user) {
        lastName.sendKeys(user);
    }

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement posCode;
    public void setPosCode(String user) {
        posCode.sendKeys(user);
    }
    @FindBy(xpath = "//input[@id='continue']")
    private WebElement lanjut;
    public void btnLanjut(){
        lanjut.click();
    }
    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finish1;
    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    private WebElement subTotal;

    @FindBy(xpath = "//div[@class='summary_tax_label']")
    private WebElement taxTotal;

    @FindBy(xpath = "//div[@class='summary_info_label summary_total_label']")
    private WebElement totalOrder;
    public void verifyCheckoutOverview(){
        subTotal.isDisplayed();
        taxTotal.isDisplayed();
        totalOrder.isDisplayed();
    }
    public void clickFinish(){
        String buttonFinish = "//button[@id='finish']";
        driver.findElement(By.xpath(buttonFinish)).isDisplayed();
        Float subTotalValue = Float.valueOf(subTotal.getText().replace("Item total: $", ""));
        Float taxValue = Float.valueOf(taxTotal.getText().replace("Tax: $", ""));
        Float totalOrderValue = Float.valueOf(totalOrder.getText().replace("Total: $", ""));

        if(subTotalValue + taxValue == totalOrderValue){
            driver.findElement(By.xpath(buttonFinish)).click();
        }
    }
    @FindBy(xpath = "//div[@id='checkout_info_container']")
    private WebElement checkoutForm;

    public boolean verifyCheckoutForm(){
        return checkoutForm.isDisplayed();
    }

    @FindBy(xpath = "//div[@class='summary_info_label summary_total_label']")
    private WebElement priceOfGoodsVerification;
    public String verifyPriceOfGoods() {
        return priceOfGoodsVerification.getText().replace("Total: ", "");
    }
    @FindBy(xpath = "//span[@class='title']")
    private WebElement finishOrderVerification;
    public boolean verifyFinishOrder() {
        return finishOrderVerification.isDisplayed();
    }
}
