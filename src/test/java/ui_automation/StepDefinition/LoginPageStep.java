package ui_automation.StepDefinition;

import io.cucumber.java.en.*;
import ui_automation.Pages.LoginPage;

import java.sql.Driver;




public class LoginPageStep {

    LoginPage loginpage= new LoginPage();

    @Given("User is on the login webpage")
    public void user_on_the_login_webpage() {
       // I use driver.navigate to get the page.
    }

    @Then("User enter a valid email address")
    public void user_enter_a_valid_email_address() {
        loginpage.username.sendKeys();

    }

    @Then("User enter a valid password")
    public void user_enter_a_valid_password() {
        loginpage.password.sendKeys();

    }

    @Then("User click on Login button")
    public void user_click_on_Login_button() {
        loginpage.loginbutton.click();
    }

    @Then("Verify User successfully logged in betting page")
    public void verify_User_successfully_logged_in_betting_page() {
        //I use assertion to verify successfully login
    }

    @Then("User be able to click the reset password button")
    public void user_be_able_to_click_the_reset_password_button() {
        loginpage.resetbutton.click();
    }

    @Then("User should enter the email address and birthdate")
    public void user_should_enter_the_email_address_and_birthdate() {
        // I write email address and add to birthdate
    }

    @Then("User reset the password and click on submit button")
    public void user_reset_the_password_and_click_on_submit_button() {
        //I reset the password and click submit button.
    }

    @Then("verify password reset")
    public void verify_password_reset() {
        // I use an assertion to verify the password reset.

    }

    @Then("User enter an invalid email address")
    public void user_enter_an_invalid_email_address() {
        // I enter an invalid email address
    }

    @Then("User click on the Login button")
    public void user_click_on_the_Login_button() {
        loginpage.loginbutton.click();
    }

    @Then("verify error message {string}")
    public void verify_error_message(String string) {
        // I use an assertion and assert actual, excepted result.
    }

    @Then("User enter an invalid password")
    public void user_enter_an_invalid_password() {
        // i send keys an invalid password
    }

    }

