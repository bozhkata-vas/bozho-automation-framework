package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Base_Page;
import pageObjects.Contact_Us_Page;


public class Contact_Us_Steps extends Base_Page {

    private Contact_Us_Page contact_us_page;

    public Contact_Us_Steps(Contact_Us_Page contact_us_page) {
        this.contact_us_page = contact_us_page;
    }

    @Given("I access the webdriver university contact us page")
    public void i_access_the_webdriver_university_contact_us_page() {
        contact_us_page.navigateTo_WebDriverUniversity_Contact_Us_Page();
    }
    @When("I enter a unique first name")
    public void i_enter_a_unique_first_name() {
        contact_us_page.setUnique_FirstName();
    }
    @And("I enter a unique last name")
    public void i_enter_a_unique_last_name() {
        contact_us_page.setUnique_LastName();
    }
    @And("I enter a unique email address")
    public void i_enter_a_unique_email_address() {
//        driver.findElement(By.name("email")).sendKeys("jonh_doe@example.com");
//        sendKeys(By.name("email"), "jonh_doe@example.com");
        contact_us_page.setUnique_EmailAddress();
    }
    @And("I enter a unique comment")
    public void i_enter_a_unique_comment() {
//        driver.findElement(By.name("message")).sendKeys("Bozhkata Vasilev post this comment!" + generateRandomString(20));
//        sendKeys(By.name("message"), "Bozhkata Vasilev post this comment!" + generateRandomString(20));
        contact_us_page.setUnique_Comment();
    }

    @When("I enter a specific first name {word}")
    public void i_enter_a_specific_first_name(String firstName) {
        contact_us_page.setSpecific_FirstName(firstName);
    }
    @When("I enter a specific last name {word}")
    public void i_enter_a_specific_last_name(String lastName) {
        contact_us_page.setSpecific_LastName(lastName);
    }
    @When("I enter a specific email address {word}")
    public void i_enter_a_specific_email_address(String email) {
        contact_us_page.setSpecific_EmailAddress(email);
    }
    @When("I enter a specific comment {string}")
    public void i_enter_a_specific_comment(String comment) {
        contact_us_page.setSpecific_Comment(comment);
    }
    @And("I click on the submit button")
    public void i_click_on_the_submit_button() {
        contact_us_page.clickOn_Submit_Button();
    }
    @Then("I should be presented with a successful contact is submission message")
    public void i_should_be_presented_with_a_successful_contact_is_submission_message() {
        contact_us_page.validate_Successful_SubmissionMessage_Text();
    }
}

