package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public static WebDriver driver;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "/html/body//div/div//div[2]/div[1]/div/div/form/div[1]/input") //absolute
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement btnLogin;
    @FindBy(xpath = "//span[@class='title']")
    private WebElement verifyDashboard;

    @FindBy(xpath = "//h3")
    private WebElement erorText;
    public String textError(){
        return erorText.getText();
    }
    public void setUserName(String urName){
        userName.sendKeys(urName);
    }

    public void setPassword(String pssword){
        password.sendKeys(pssword);
    }

    public void clickLogin(){
        btnLogin.click();
    }
    public boolean verifyLandingPage(){
        return userName.isDisplayed();
    }
    public boolean verifyDshboard(){
        return verifyDashboard.isDisplayed();
    }
}
