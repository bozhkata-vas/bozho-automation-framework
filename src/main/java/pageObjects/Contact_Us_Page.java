package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import utils.Global_Vars;

public class Contact_Us_Page extends Base_Page {

    //All Selectors on Contact Us Page
    private @FindBy(how = How.NAME, using = "first_name")  //This is the another option to use FindBy
    WebElement firstName_TextField;

    private @FindBy(name = "last_name")
    WebElement lastName_TextField;

    private @FindBy(name = "email")
    WebElement emailAddress_TextField;

    private @FindBy(name = "message")
    WebElement comment_TextField;

    private @FindBy(xpath = "//input[@value='SUBMIT']")
    WebElement submit_Button;

    private @FindBy(xpath = "//div[@id='contact_reply']/h1")
    WebElement successfulSubmission_Message_Text;

    public Contact_Us_Page() {
        super();
    }

    //Custom Methods on Contact Us Page
    public void navigateTo_WebDriverUniversity_Contact_Us_Page() {
        navigateTo_URL(Global_Vars.WEBDRIVER_UNIVERSITY_HOMEPAGE_URL + "/Contact-Us/contactus.html");
    }

    public void setUnique_FirstName() {
        sendKeys(firstName_TextField, "John" + generateRandomNumber(5));
    }

    public void setUnique_LastName() {
        sendKeys(lastName_TextField, "Doe" + generateRandomNumber(5));
    }

    public void setUnique_EmailAddress() {
        sendKeys(emailAddress_TextField, "jonh_doe@example.com");
    }

    public void setUnique_Comment() {
        sendKeys(comment_TextField, "Bozhkata Vasilev post this comment!" + generateRandomString(20));
    }

    public void setSpecific_FirstName(String firstName) {
        sendKeys(firstName_TextField, firstName);
    }

    public void setSpecific_LastName(String lastName) {
        sendKeys(lastName_TextField, lastName);
    }

    public void setSpecific_EmailAddress(String emailAddress) {
        sendKeys(emailAddress_TextField, emailAddress);
    }

    public void setSpecific_Comment(String comment) {
        sendKeys(comment_TextField, comment);
    }

    public void clickOn_Submit_Button() {
        waitForWebElementAndClick(submit_Button);
    }

    public void validate_Successful_SubmissionMessage_Text() {
        waitFor(successfulSubmission_Message_Text);
        Assert.assertEquals(successfulSubmission_Message_Text.getText(), "Thank You for your Message!");
    }

}
