package page;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class leavePage {
    WebDriver driver;

    public leavePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

//===================================================================================================================================================================================================================================//

    //ADD ENTITLEMENT
    @FindBy(css = "[href=\"/web/index.php/leave/viewLeaveModule\"]")
    private WebElement module_leave;

    @FindBy(css = "header[class='oxd-topbar'] li:nth-child(3) span:nth-child(1)")
    private WebElement topbarMenu_entitlement;

    @FindBy(css = "li[class='--active oxd-topbar-body-nav-tab --parent'] li:nth-child(1) a:nth-child(1)")
    private WebElement subMenu_addEntitlement;

    @FindBy(xpath = "//label[normalize-space()='Multiple Employees']")
    private WebElement radiobtn_addTo_multipleEmployee;


    @FindBy(xpath = "//form[@class=\"oxd-form\"]/div[3]/div/div[1]/div/div[2]/div/div/div[1]")
    private WebElement dropdwn_leaveType;

    @FindBy(xpath = "//form[@class=\"oxd-form\"]/div[3]/div/div[3]/div/div[2]/input")
    private WebElement field_entitlement;

    @FindBy(xpath = "//form[@class=\"oxd-form\"]/div[4]/button[2]")
    private WebElement btn_save;

    @FindBy(xpath = "//button[normalize-space()='Confirm']")
    private WebElement btn_confirm;

    @FindBy(css = "[class=\"oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text\"]")
    private WebElement successMessage_successfullySaved;


    //APPLY LEAVE
    @FindBy(xpath = "//a[normalize-space()='Apply']")
    private WebElement topbarMenu_apply;

    @FindBy(xpath = "//form[@class=\"oxd-form\"]/div[1]/div/div[1]/div/div[2]/div/div/div[1]")
    private WebElement dropdwn_leaveType2;

    @FindBy(xpath = "//form[@class=\"oxd-form\"]/div[2]/div/div[1]/div/div[2]/div/div/input")
    private WebElement field_fromDate;

    @FindBy(xpath = "//form[@class=\"oxd-form\"]/div[2]/div/div[2]/div/div[2]/div/div/input")
    private WebElement field_toDate;

    @FindBy(xpath = "//form[@class=\"oxd-form\"]/div[3]/div/div/div/div[2]/div/div/div[1]")
    private WebElement field_duration;

    @FindBy(css = "[class=\"oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical\"]")
    private WebElement field_comment;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btn_save2;

    //CANCEL LEAVE
    @FindBy(xpath = "//a[normalize-space()='My Leave']")
    private WebElement topbarMenu_myLeave;
    @FindBy(xpath = "//div[@class=\"oxd-table-body\"]/div[1]/div/div[9]/div/button")
    private WebElement btn_cancel;
    //===================================================================================================================================================================================================================================//

    public void clickTheLeaveButton() {
        module_leave.click();
    }
    public void clickEntitlementsInTopbarMenu() {
        topbarMenu_entitlement.click();
    }

    public void clickAddEntitlementsInMenuItem() {
        subMenu_addEntitlement.click();
    }

    public void chooseAddToRadiobutton() {
        radiobtn_addTo_multipleEmployee.click();
    }

    public void chooseLeaveTypeDropdown() {
        dropdwn_leaveType.sendKeys(Keys.ARROW_DOWN);
        dropdwn_leaveType.sendKeys(Keys.ARROW_DOWN);
        dropdwn_leaveType.sendKeys(Keys.ARROW_DOWN);
        dropdwn_leaveType.sendKeys(Keys.ARROW_DOWN);
        dropdwn_leaveType.sendKeys(Keys.ARROW_DOWN);
        dropdwn_leaveType.sendKeys(Keys.ENTER);
    }

    public void inputEntitlementField(String entitlement) {
        field_entitlement.sendKeys(entitlement);
    }

    public void clickTheSaveButtonForEntitlement() {
        btn_save.click();
    }


    public void clickTheConfirmButtonForEntitlement() {
        btn_confirm.click();
    }

    public void successMessageIsDisplayedForAddEntitlementsMultipleEmployeee() {
        Assert.assertTrue(successMessage_successfullySaved.isDisplayed());
    }

    public void clickapplyInTopbarMenu() {
        topbarMenu_apply.click();
    }

    public void chooseLeaveTypeDropdownInApplyLeave() {
        dropdwn_leaveType2.sendKeys(Keys.ARROW_DOWN);
        dropdwn_leaveType2.sendKeys(Keys.ENTER);
    }

    public void inputFromDateFieldInApplyLeave(String fromDate) {
        field_toDate.sendKeys(Keys.CONTROL,"A");
        field_fromDate.sendKeys(fromDate);
    }

    public void inputToDateFieldInApplyLeave(String toDate) {
        field_toDate.sendKeys(Keys.CONTROL,"A");
        field_toDate.sendKeys(toDate);
    }

    public void chooseDurationDropdownInApplyLeave() {
        field_duration.sendKeys(Keys.ARROW_DOWN);
        dropdwn_leaveType2.sendKeys(Keys.ENTER);
    }

    public void inputCommentFieldInApplyLeave(String comment) {
        field_comment.sendKeys(comment);
    }

    public void clickTheSaveButtonForApplyLeave() {
        btn_save2.click();
    }

    public void successMessageIsDisplayedApplyLeaveDay() {
        Assert.assertTrue(successMessage_successfullySaved.isDisplayed());
    }

    @When("Click my leave in topbar menu")
    public void clickMyLeaveInTopbarMenu() {
        topbarMenu_myLeave.click();
    }

    @And("Click the cancel button")
    public void clickTheCancelButton() {
        btn_cancel.click();
    }

    @Then("Success message is displayed cancel apply leave")
    public void successMessageIsDisplayedCancelApplyLeave() {
        Assert.assertTrue(successMessage_successfullySaved.isDisplayed());
    }
}
