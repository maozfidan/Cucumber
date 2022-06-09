package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebPage {

    public WebPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

            @FindBy(xpath="//*[text()='LOGIN PORTAL']")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@placeholder='Username']")
    public  WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement password;

    @FindBy(xpath="//button[@id='login-button']")
    public WebElement login;

}
