package step;

import config.base;
import data.loginData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import page.loginPage;

public class loginStep extends base {
    loginPage LoginPage = new loginPage(driver);

    @Given("Navigate to the website")
    public void navigateToTheWebsite() {
        getDriver();
        LoginPage = new loginPage(driver);
        LoginPage.navigateLogin();
    }

    @Given("Already login")
    public void alreadyLogin() {
        getDriver();
        LoginPage = new loginPage(driver);
        LoginPage.navigateLogin();
        LoginPage.setInputUsername(loginData.DATA_TRUE_USERNAME);
        LoginPage.setInputPassword(loginData.DATA_TRUE_PASSWORD);
        LoginPage.clickLoginPage();
    }

    @When("Input username field with valid username")
    public void inputUsernameFieldWithValidUsername() throws InterruptedException {
        Thread.sleep(750);
        LoginPage.setInputUsername(loginData.DATA_TRUE_USERNAME);
    }

    @And("Input password field with valid password")
    public void inputPasswordFieldWithValidPassword() throws InterruptedException {
        Thread.sleep(750);
        LoginPage.setInputPassword(loginData.DATA_TRUE_PASSWORD);
    }

    @And("Click the login button")
    public void clickTheLoginButton() throws InterruptedException {
        Thread.sleep(750);
        LoginPage.clickLoginPage();
    }

    @When("The text Dashboard is visible in the page header")
    public void theTextIsVisibleInThePageHeader() throws InterruptedException {
        Thread.sleep(750);
        LoginPage.theTextIsVisibleInThePageHeader();
    }

    @When("Input username field with invalid username")
    public void inputUsernameFieldWithInvalidUsername() throws InterruptedException {
        Thread.sleep(750);
        LoginPage.setInputUsername(loginData.DATA_FALSE_USERNAME);
    }

    @And("Input password field with invalid password")
    public void inputPasswordFieldWithInvalidPassword() throws InterruptedException {
        Thread.sleep(750);
        LoginPage.setInputPassword(loginData.DATA_FALSE_PASSWORD);
    }

    @Then("Error message is displayed for invalid state")
    public void errorMessageIsDisplayedForInvalidState() throws InterruptedException {
        Thread.sleep(750);
        LoginPage.errorMessageIsDisplayedForInvalidState();
        quitDriver();
    }

    @Then("Error message is displayed for empty state")
    public void errorMessageIsDisplayedForEmptyState() throws InterruptedException {
        Thread.sleep(750);
        LoginPage.errorMessageIsDisplayedForEmptyState();
        quitDriver();
    }

    @When("Click the profile")
    public void clickTheProfile() throws InterruptedException {
        Thread.sleep(750);
        LoginPage.clickTheProfile();
    }

    @And("Click the logoutbutton")
    public void clickTheLogoutbutton() throws InterruptedException {
        Thread.sleep(750);
        LoginPage.clickTheLogoutbutton();
    }

    @Then("The text login is visible in the login page")
    public void theTextLoginIsVisibleInTheLoginPage() throws InterruptedException {
        Thread.sleep(750);
        LoginPage.theTextLoginIsVisibleInTheLoginPage();
        quitDriver();
    }
}
