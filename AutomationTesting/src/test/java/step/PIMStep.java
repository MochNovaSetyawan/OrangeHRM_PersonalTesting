package step;

import config.base;
import data.PIMData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.PIMPage;
import page.leavePage;

public class PIMStep extends base {

    PIMPage pIMPage = new PIMPage(driver);

    @When("Click the PIM module")
    public void clickThePIMModule() throws InterruptedException {
        Thread.sleep(750);
        pIMPage.clickThePIMModule();
    }

    @And("Click add employee tab")
    public void clickAddEmployeeTab() throws InterruptedException {
        Thread.sleep(750);
        pIMPage.clickAddEmployeeTab();
    }

    @And("Input new employee fullname field")
    public void inputNewEmployeeFullnameField() throws InterruptedException {
        Thread.sleep(750);
        pIMPage.inputNewEmployeeFullnameField(
                PIMData.TRUE_PERSONALDETAILS_FIRSTNAME,
                PIMData.TRUE_PERSONALDETAILS_MIDDLE,
                PIMData.TRUE_PERSONALDETAILS_LAST
        );
    }

    @And("Input new Employee id")
    public void inputNewEmployeeId() throws InterruptedException {
        Thread.sleep(750);
        pIMPage.inputNewEmployeeId(PIMData.TRUE_PERSONALDETAILS_EMPLOYEEID);
    }

    @And("Click the save button for add employee")
    public void clickTheSaveButtonForAddEmployee() throws InterruptedException {
        Thread.sleep(750);
        pIMPage.clickTheSaveButtonForAddEmployee();
    }

    @Then("Success message is displayed for add employee")
    public void successMessageIsDisplayedForAddEmployee() throws InterruptedException {
        Thread.sleep(750);
        pIMPage.successMessageIsDisplayedForAddEmployee();
    }

    @Given("Click job tab in employee list")
    public void clickJobTabInEmployeeList() throws InterruptedException {
        Thread.sleep(750);
        pIMPage.clickJobTabInEmployeeList();
    }

    @When("Input join date field")
    public void inputJoinDateField() throws InterruptedException {
        Thread.sleep(750);
        pIMPage.inputJoinDateField(PIMData.TRUE_JOBDETAILS_JOINEDDATE);
    }

    @And("Choose job title dropdown")
    public void chooseJobTitleDropdown() throws InterruptedException {
        Thread.sleep(750);
        pIMPage.chooseJobTitleDropdown();
    }

    @And("Choose job category dropdown")
    public void chooseJobCategoryDropdown() throws InterruptedException {
        Thread.sleep(750);
        pIMPage.chooseJobCategoryDropdown();
    }

    @And("Choose sub unit dropdown")
    public void chooseSubUnitDropdown() throws InterruptedException {
        Thread.sleep(750);
        pIMPage.chooseSubUnitDropdown();
    }

    @And("Choose location dropdown")
    public void chooseLocationDropdown() throws InterruptedException {
        Thread.sleep(750);
        pIMPage.chooseLocationDropdown();
    }

    @And("Choose employment status dropdown")
    public void chooseEmploymentStatusDropdown() throws InterruptedException {
        Thread.sleep(750);
        pIMPage.chooseEmploymentStatusDropdown();
    }

    @And("Click the save button for job detail")
    public void clickTheSaveButtonForJobDetail() throws InterruptedException {
        Thread.sleep(750);
        pIMPage.clickTheSaveButtonForJobDetail();
    }

    @Then("Success message is displayed for job detail")
    public void successMessageIsDisplayedForJobDetail() throws InterruptedException {
        Thread.sleep(750);
        pIMPage.successMessageIsDisplayedForJobDetail();
        quitDriver();
    }
}
