package ui_automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    LoginPage loginpage = new LoginPage();

    @FindBy(xpath = "")
    public WebElement login;

    @FindBy(id ="userId")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "")
    public WebElement loginbutton;


    @FindBy(xpath = "")
    public WebElement resetbutton;

public void loginPage(String emailadress, String Password) {
    loginpage.login.click();
    username.sendKeys(emailadress);
    password.sendKeys(Password);
    loginbutton.click();



}

}
