package page;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

    WebDriver driver;
    public loginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

//===================================================================================================================================================================================================================================//

    @FindBy(css = "input[name='username']")
    private WebElement inputUsername;

    @FindBy(css = "input[name='password']")
    private WebElement inputPassword;

    @FindBy(css = "button")
    private WebElement buttonLogin;

    @FindBy(css = "[class=\"oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module\"]")
    private WebElement textDashboard;

    @FindBy(xpath = "//*[@class=\"oxd-form\"]/div[1]/div/span")
    private WebElement errorMessage_username;

    @FindBy(xpath = "//*[@class=\"oxd-form\"]/div[2]/div/span")
    private WebElement errorMessage_password;

    @FindBy(css = "p[class='oxd-text oxd-text--p oxd-alert-content-text']")
    public WebElement errorMessage_InvalidCredentials;

    //LOGOUT
    @FindBy(css = "[class=\"oxd-userdropdown-name\"]")
    public WebElement menu_profile;

    @FindBy(css = "[href=\"/web/index.php/auth/logout\"]")
    public WebElement menu_logout;

    @FindBy(css = "[class=\"oxd-text oxd-text--h5 orangehrm-login-title\"]")
    public WebElement image_orangeHrm;

//===================================================================================================================================================================================================================================//

    public void navigateLogin () {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    public void setInputUsername (String username) {
        inputUsername.sendKeys(username);
    }

    public void setInputPassword (String password) {
        inputPassword.sendKeys(password);
    }

    public void clickLoginPage () {
        buttonLogin.click();
    }

    public void theTextIsVisibleInThePageHeader () {
        String dashboardText = textDashboard.getText();
        Assert.assertEquals("Dashboard",dashboardText);
    }

    public void errorMessageIsDisplayedForInvalidState () {
        String invalidMessage = errorMessage_InvalidCredentials.getText();
        Assert.assertEquals("Invalid credentials",invalidMessage);
    }

    public void errorMessageIsDisplayedForEmptyState () {
        Assert.assertTrue(errorMessage_username.isDisplayed());
        Assert.assertTrue(errorMessage_password.isDisplayed());
    }

    public void clickTheProfile() {
        menu_profile.click();
    }

    public void clickTheLogoutbutton() {
        menu_logout.click();
    }

    public void theTextLoginIsVisibleInTheLoginPage() {
        Assert.assertTrue(image_orangeHrm.isDisplayed());
    }
}
