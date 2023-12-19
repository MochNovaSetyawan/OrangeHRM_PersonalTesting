package page;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMPage {
    WebDriver driver;

    public PIMPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //===================================================================================================================================================================================================================================//

    //ADD EMPLOYEE
    @FindBy(css = "[href=\"/web/index.php/pim/viewPimModule\"]")
    private WebElement module_PIM;

    @FindBy(xpath = "//a[normalize-space()='Add Employee']")
    private WebElement topbarMenu_addEmployee;

    @FindBy(css = "[name=\"firstName\"]")
    private WebElement field_firstName;

    @FindBy(css = "[name=\"middleName\"]")
    private WebElement field_middleName;

    @FindBy(css = "[name=\"lastName\"]")
    private WebElement field_lastName;

    @FindBy(xpath = "//div[@class=\"oxd-grid-2 orangehrm-full-width-grid\"]/div/div/div[2]/input")
    private WebElement field_employeeId;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btn_save;

    @FindBy(css = "[class=\"oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text\"]")
    private WebElement successMessage_successfullySaved;

    //ADD JOB DETAIL
    @FindBy(xpath = "//a[normalize-space()='Job']")
    private WebElement tab_job;

    @FindBy(css = "[placeholder=\"yyyy-mm-dd\"]")
    private WebElement field_joinedDate;

    @FindBy(xpath = "//form[@class=\"oxd-form\"]/div[1]/div/div[2]/div/div[2]/div/div/div[1]")
    private WebElement field_jobTitle;

    @FindBy(xpath = "//form[@class=\"oxd-form\"]/div[1]/div/div[4]/div/div[2]/div/div/div[1]")
    private WebElement field_jobCategory;

    @FindBy(xpath = "//form[@class=\"oxd-form\"]/div[1]/div/div[5]/div/div[2]/div/div/div[1]")
    private WebElement field_subUnit;

    @FindBy(xpath = "//form[@class=\"oxd-form\"]/div[1]/div/div[6]/div/div[2]/div/div/div[1]")
    private WebElement field_location;

    @FindBy(xpath = "//form[@class=\"oxd-form\"]/div[1]/div/div[7]/div/div[2]/div/div/div[1]")
    private WebElement field_employeeStatus;

    //===================================================================================================================================================================================================================================//


    public void clickThePIMModule() {
        module_PIM.click();
    }

    public void clickAddEmployeeTab() {
        topbarMenu_addEmployee.click();
    }

    public void inputNewEmployeeFullnameField(String firstName, String middleName, String lastName) throws InterruptedException {
        Thread.sleep(750);
        field_firstName.sendKeys(firstName);
        Thread.sleep(750);
        field_middleName.sendKeys(middleName);
        Thread.sleep(750);
        field_lastName.sendKeys(lastName);
    }

    public void inputNewEmployeeId(String employeeId) {
        field_employeeId.sendKeys(employeeId);
    }

    public void clickTheSaveButtonForAddEmployee() {
        btn_save.click();
    }

    public void successMessageIsDisplayedForAddEmployee() {
        Assert.assertTrue(successMessage_successfullySaved.isDisplayed());

    }

    public void clickJobTabInEmployeeList() {
        tab_job.click();
    }

    public void inputJoinDateField(String joinedDate) {
        field_joinedDate.sendKeys(joinedDate);
    }

    public void chooseJobTitleDropdown() {
        field_jobTitle.sendKeys(Keys.ARROW_DOWN);
        field_jobTitle.sendKeys(Keys.ENTER);
    }

    public void chooseJobCategoryDropdown() {
        field_jobCategory.sendKeys(Keys.ARROW_DOWN);
        field_jobCategory.sendKeys(Keys.ENTER);
    }

    public void chooseSubUnitDropdown() {
        field_subUnit.sendKeys(Keys.ARROW_DOWN);
        field_subUnit.sendKeys(Keys.ENTER);
    }

    public void chooseLocationDropdown() {
        field_location.sendKeys(Keys.ARROW_DOWN);
        field_location.sendKeys(Keys.ENTER);
    }

    public void chooseEmploymentStatusDropdown() {
        field_employeeStatus.sendKeys(Keys.ARROW_DOWN);
        field_employeeStatus.sendKeys(Keys.ENTER);
    }

    public void clickTheSaveButtonForJobDetail() {
        btn_save.click();
    }

    public void successMessageIsDisplayedForJobDetail() {
        Assert.assertTrue(successMessage_successfullySaved.isDisplayed());
    }
}
