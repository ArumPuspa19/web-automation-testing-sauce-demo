package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {
    public static WebDriver driver;

    public ProductPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement SelectFilter;

    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement btncart1;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement btncart2;

    @FindBy(xpath = "//div[@id='shopping_cart_container']/a[1]")
    private WebElement buttonCart;
    public void pickProduct(String namaProduct){
        driver.findElement(By.xpath("//div[text()='"+ namaProduct +"']//ancestor::div[@class='inventory_item']/div[2]/div[2]/button")).click();
    }
    public void selectProductFilter(String sort){
        Select a = new Select(SelectFilter);
        a.selectByVisibleText(sort);
    }
    public void clickBasket(){
        btncart1.click();
    }
    public void clickBasket1(){
     btncart2.click();
    }
    public void clickCart() {
        buttonCart.click();
    }
}
