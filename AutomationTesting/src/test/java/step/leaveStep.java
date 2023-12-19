package step;

import config.base;
import data.leaveData;
import data.myInfoData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.leavePage;


public class leaveStep extends base {
    leavePage LeavePage = new leavePage(driver);

    @When("Click the leave button")
    public void clickTheLeaveButton() throws InterruptedException {
        Thread.sleep(750);
        LeavePage.clickTheLeaveButton();
    }

    @And("Click entitlements in topbar menu")
    public void clickEntitlementsInTopbarMenu() throws InterruptedException {
        Thread.sleep(750);
        LeavePage.clickEntitlementsInTopbarMenu();
    }

    @And("Click add entitlements in menu item")
    public void clickAddEntitlementsInMenuItem() throws InterruptedException {
        Thread.sleep(750);
        LeavePage.clickAddEntitlementsInMenuItem();
    }

    @And("Choose add to radiobutton in add entitlements")
    public void chooseAddToRadiobutton() throws InterruptedException {
        Thread.sleep(750);
        LeavePage.chooseAddToRadiobutton();
    }

    @And("Choose leave type dropdown in add entitlements")
    public void chooseLeaveTypeDropdown() throws InterruptedException {
        Thread.sleep(750);
        LeavePage.chooseLeaveTypeDropdown();
    }

    @And("Input entitlement field in add entitlements")
    public void inputEntitlementField() throws InterruptedException {
        Thread.sleep(750);
        LeavePage.inputEntitlementField(leaveData.DATA_TRUE_ENTITLEMENT);
    }

    @And("Click the save button for entitlement")
    public void clickTheSaveButtonForEntitlement() throws InterruptedException {
        Thread.sleep(750);
        LeavePage.clickTheSaveButtonForEntitlement();
    }

    @And("Click the confirm button for entitlement")
    public void clickTheConfirmButtonForEntitlement() throws InterruptedException {
        Thread.sleep(750);
        LeavePage.clickTheConfirmButtonForEntitlement();
    }

    @And("Success message is displayed for add entitlements multiple employeee")
    public void successMessageIsDisplayedForAddEntitlementsMultipleEmployeee() throws InterruptedException {
        Thread.sleep(750);
        LeavePage.successMessageIsDisplayedForAddEntitlementsMultipleEmployeee();
    }

    @When("Click apply in topbar menu")
    public void clickapplyInTopbarMenu() throws InterruptedException {
        Thread.sleep(750);
        LeavePage.clickapplyInTopbarMenu();
    }

    @And("Choose leave type dropdown in apply leave")
    public void chooseLeaveTypeDropdownInApplyLeave() throws InterruptedException {
        Thread.sleep(750);
        LeavePage.chooseLeaveTypeDropdownInApplyLeave();
    }

    @And("Input from date field in apply leave")
    public void inputFromDateFieldInApplyLeave() throws InterruptedException {
        Thread.sleep(750);
        LeavePage.inputFromDateFieldInApplyLeave(leaveData.DATA_TRUE_FROMDATE);
    }

    @And("Input to date field in apply leave")
    public void inputToDateFieldInApplyLeave() throws InterruptedException {
        Thread.sleep(750);
        LeavePage.inputToDateFieldInApplyLeave(leaveData.DATA_TRUE_TODATE);
    }

    @And("Choose duration dropdown in apply leave")
    public void chooseDurationDropdownInApplyLeave() throws InterruptedException {
        Thread.sleep(750);
        LeavePage.chooseDurationDropdownInApplyLeave();
    }

    @And("Input Comment field in apply leave")
    public void inputCommentFieldInApplyLeave() throws InterruptedException {
        Thread.sleep(750);
        LeavePage.inputCommentFieldInApplyLeave(leaveData.DATA_TRUE_COMMENT);
    }

    @And("Click the save button for apply leave")
    public void clickTheSaveButtonForApplyLeave() throws InterruptedException {
        Thread.sleep(750);
        LeavePage.clickTheSaveButtonForApplyLeave();
    }

    @Then("Success message is displayed apply leave one day")
    public void successMessageIsDisplayedApplyLeaveDay() throws InterruptedException {
        Thread.sleep(750);
        LeavePage.successMessageIsDisplayedApplyLeaveDay();
    }

    @When("Click my leave in topbar menu")
    public void clickMyLeaveInTopbarMenu() throws InterruptedException {
        Thread.sleep(750);
        LeavePage.clickMyLeaveInTopbarMenu();
    }

    @And("Click the cancel button")
    public void clickTheCancelButton() throws InterruptedException {
        Thread.sleep(750);
        LeavePage.clickTheCancelButton();
    }

    @Then("Success message is displayed cancel apply leave")
    public void successMessageIsDisplayedCancelApplyLeave() throws InterruptedException {
        Thread.sleep(750);
        LeavePage.successMessageIsDisplayedCancelApplyLeave();
        quitDriver();
    }
}
