package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Global_Vars;

public class Login_Page extends Base_Page {
    private @FindBy(id = "text")
    WebElement username_TextField;

    private @FindBy(id = "password")
    WebElement password_TextField;

    private @FindBy(id = "login-button")
    WebElement login_Button;

    public Login_Page() {
        super();
    }

    public void navigateTo_WebDriverUniversity_Login_Page() {
        navigateTo_URL(Global_Vars.WEBDRIVER_UNIVERSITY_HOMEPAGE_URL + "/Login-Portal/index.html?");
    }

    public void setUsername(String username) {
        sendKeys(username_TextField, username);
    }

    public void setPassword(String password) {
        sendKeys(password_TextField, password);
    }

    public void click_On_Login_Button() {
        waitForWebElementAndClick(login_Button);
    }

    public void validate_SuccessfulLogin_Message() {
        waitForAlert_And_ValidateText("validation succeeded");
    }

    public void validate_UnsuccessfulLogin_Message() {
        waitForAlert_And_ValidateText("validation failed");
    }

}
