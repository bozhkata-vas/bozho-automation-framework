package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Base_Page;
import pageObjects.Login_Page;


public class Login_Steps extends Base_Page {
    private Login_Page login_page;

    public Login_Steps(Login_Page login_page) {
        this.login_page = login_page;
    }

    @Given("I access the webdriver university login page")
    public void i_access_the_webdriver_university_login_page() {
//        navigateTo_URL("https://www.webdriveruniversity.com/Login-Portal/index.html?");
        login_page.navigateTo_WebDriverUniversity_Login_Page();
    }
    @When("I enter a username {}")
    public void i_enter_a_username(String username) {
        login_page.setUsername(username);
    }

    @And("I enter a password {}")
    public void i_enter_a_password(String password) {
        login_page.setPassword(password);
    }
    @And("I click on the login button")
    public void i_click_on_the_login_button() {
        login_page.click_On_Login_Button();
    }
    @Then("I should be presented with the successful login message")
    public void i_should_be_presented_with_the_successful_login_message() {
//        String login_Message = driver.switchTo().alert().getText();
//        Assert.assertEquals(login_Message, "validation succeeded");
        login_page.validate_SuccessfulLogin_Message();
    }

    @Then("I should be presented with the unsuccessful login message")
    public void i_should_be_presented_with_the_unsuccessful_login_message() {
        login_page.validate_UnsuccessfulLogin_Message();
    }
    @Then("I should be presented with the following login validation message {}")
    public void i_should_be_presented_with_the_following_login_validation_message_validation_message(String expectedMessage) {
        waitForAlert_And_ValidateText(expectedMessage);
    }
}
