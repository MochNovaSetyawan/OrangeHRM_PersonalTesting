package page;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class myInfoPage {
    WebDriver driver;

    public myInfoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //===================================================================================================================================================================================================================================//
    //PERSONAL DETAILS
    @FindBy(css = "[href='/web/index.php/pim/viewMyDetails']")
    private WebElement module_myInfo;

    @FindBy(css = "[href='/web/index.php/pim/viewPersonalDetails/empNumber/7']")
    private WebElement tab_personalDetails;

    @FindBy(css = "[name='firstName']")
    private WebElement field_firstName;

    @FindBy(css = "[name='middleName']")
    private WebElement field_middleName;

    @FindBy(css = "[name='lastName']")
    private WebElement field_lastName;

    @FindBy(xpath = "//div[@class=\"orangehrm-edit-employee\"]/div[2]/div[1]/form/div[1]/div[2]/div/div/div[2]/input")
    private WebElement field_nickName;

    @FindBy(xpath = "//div[@class=\"orangehrm-edit-employee\"]/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[2]/input")
    private WebElement field_employeeId;

    @FindBy(xpath = "//div[@class=\"orangehrm-edit-employee\"]/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[2]/input")
    private WebElement field_otherId;

    @FindBy(xpath = "//div[@class=\"orangehrm-edit-employee\"]/div[2]/div[1]/form/div[2]/div[2]/div/div/div[2]/input")
    private WebElement field_driversLicenseNumber;

    @FindBy(xpath = "//div[@class=\"orangehrm-edit-employee\"]/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input")
    private WebElement field_licenseExpiryDate;

    @FindBy(xpath = "//div[@class=\"orangehrm-edit-employee\"]/div[2]/div[1]/form/div[2]/div[3]/div[1]/div/div[2]/input")
    private WebElement field_ssnNumber;

    @FindBy(xpath = "//div[@class=\"orangehrm-edit-employee\"]/div[2]/div[1]/form/div[2]/div[3]/div[2]/div/div[2]/input")
    private WebElement field_sinNumber;

    @FindBy(xpath = "//div[@class=\"orangehrm-edit-employee\"]/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[1]")
    private WebElement field_nationality;

    @FindBy(xpath = "//div[@class=\"orangehrm-edit-employee\"]/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div/div[1]")
    private WebElement field_maritalStatus;

    @FindBy(xpath = "//div[@class=\"orangehrm-edit-employee\"]/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input")
    private WebElement field_dateOfBirth;

    @FindBy(xpath = "//div[@class=\"orangehrm-edit-employee\"]/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/label/span")
    private WebElement radiobtn_male;

    @FindBy(xpath = "//div[@class=\"orangehrm-edit-employee\"]/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/label/span")
    private WebElement radiobtn_female;

    @FindBy(xpath = "//div[@class=\"orangehrm-edit-employee\"]/div[2]/div[1]/form/div[4]/div/div[1]/div/div[2]/input")
    private WebElement field_militaryService;

    @FindBy(xpath = "//div[@class=\"orangehrm-edit-employee\"]/div[2]/div[1]/form/div[4]/div/div[2]/div/div[2]/div/label/span")
    private WebElement checkbox_smoker;

    @FindBy(xpath = "//div[@class=\"orangehrm-edit-employee\"]/div[2]/div[1]/form/div[5]/button")
    private WebElement btn_SavePersonalDetail;

    @FindBy(css = "[class=\"oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text\"]")
    private WebElement successMessage_successfullyUpdated;

//===================================================================================================================================================================================================================================//

    //CONTACT DETAIL
    @FindBy(css = "[href=\"/web/index.php/pim/contactDetails/empNumber/7\"]")
    private WebElement tab_contactDetail;

    @FindBy(xpath = "//div[@class=\"orangehrm-edit-employee\"]/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input")
    private WebElement field_street1;

    @FindBy(xpath = "//div[@class=\"orangehrm-edit-employee\"]/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input")
    private WebElement field_street2;

    @FindBy(xpath = "//div[@class=\"orangehrm-edit-employee\"]/div[2]/div[1]/form/div[1]/div/div[3]/div/div[2]/input")
    private WebElement field_city;

    @FindBy(xpath = "//div[@class=\"orangehrm-edit-employee\"]/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/input")
    private WebElement field_state;

    @FindBy(xpath = "//div[@class=\"orangehrm-edit-employee\"]/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/input")
    private WebElement field_zip;

    @FindBy(xpath = "//div[@class=\"orangehrm-edit-employee\"]/div[2]/div[1]/form/div[1]/div/div[6]/div/div[2]/div/div/div[1]")
    private WebElement dropdwn_country;

    @FindBy(xpath = "//div[@class=\"orangehrm-edit-employee\"]/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/input")
    private WebElement field_home;

    @FindBy(xpath = "//div[@class=\"orangehrm-edit-employee\"]/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/input")
    private WebElement field_mobile;

    @FindBy(xpath = "//div[@class=\"orangehrm-edit-employee\"]/div[2]/div[1]/form/div[2]/div/div[3]/div/div[2]/input")
    private WebElement field_work;

    @FindBy(xpath = "//div[@class=\"orangehrm-edit-employee\"]/div[2]/div[1]/form/div[3]/div/div[1]/div/div[2]/input")
    private WebElement field_workEmail;

    @FindBy(xpath = "//div[@class=\"orangehrm-edit-employee\"]/div[2]/div[1]/form/div[3]/div/div[2]/div/div[2]/input")
    private WebElement field_otherEmail;

    @FindBy(xpath = "//div[@class=\"orangehrm-edit-employee\"]/div[2]/div[1]/form/div[4]/button")
    private WebElement btn_saveContactDetail;

//===================================================================================================================================================================================================================================//


    //PERSONAL DETAIL
    public void clickTheMyInfoModule() {
        module_myInfo.click();
    }

    public void clickPersonalDetailsTab() {
        tab_personalDetails.click();
    }

    public void inputEmployeeFullnameField(String fullName, String middleName, String lastName) throws InterruptedException {
        Thread.sleep(750);
        field_firstName.sendKeys(Keys.CONTROL, "A");
        field_firstName.sendKeys(fullName);
        Thread.sleep(750);
        field_middleName.sendKeys(Keys.CONTROL, "A");
        field_middleName.sendKeys(middleName);
        Thread.sleep(750);
        field_lastName.sendKeys(Keys.CONTROL, "A");
        field_lastName.sendKeys(lastName);
    }

    public void inputNicknameField(String nickName) {
        field_nickName.sendKeys(Keys.CONTROL, "A");
        field_nickName.sendKeys(nickName);
    }

    public void inputEmployeeIdField(String employeeId) {
        field_employeeId.sendKeys(Keys.CONTROL, "A");
        field_employeeId.sendKeys(employeeId);
    }

    public void inputOtherIdField(String otherId) {
        field_otherId.sendKeys(Keys.CONTROL, "A");
        field_otherId.sendKeys(otherId);
    }

    public void inputDriverSLicenseNumberField(String driversLisenceNumber) {
        field_driversLicenseNumber.sendKeys(Keys.CONTROL, "A");
        field_driversLicenseNumber.sendKeys(driversLisenceNumber);
    }

    public void inputLicenseExpiryDateField(String licenceExpiryDate) {
        field_licenseExpiryDate.sendKeys(Keys.CONTROL, "A");
        field_licenseExpiryDate.sendKeys(licenceExpiryDate);
    }

    public void inputSsnNumberField(String ssnNumner) {
        field_ssnNumber.sendKeys(Keys.CONTROL, "A");
        field_ssnNumber.sendKeys(ssnNumner);
    }

    public void inputSinNumberField(String sinNumber) {
        field_sinNumber.sendKeys(Keys.CONTROL, "A");
        field_sinNumber.sendKeys(sinNumber);
    }

    public void chooseNationalityDropdown(String nationality) {
        field_nationality.sendKeys(nationality);
        field_nationality.sendKeys(Keys.ARROW_DOWN);
        field_nationality.sendKeys(Keys.ARROW_DOWN);
        field_nationality.sendKeys(Keys.ENTER);
    }

    public void chooseMaritalStatusDropdown(String maritalStatus) {
        field_sinNumber.sendKeys(Keys.CONTROL, "A");
        field_maritalStatus.sendKeys(maritalStatus);
    }

    public void inputDateOfBirthField(String dateOfBirth) {
        field_dateOfBirth.sendKeys(Keys.CONTROL, "A");
        field_dateOfBirth.sendKeys(dateOfBirth);
    }

    public void chooseGenderRadioButton(String gender) {
        if ("Male".equals(gender)) {
            radiobtn_male.click();
        } else if ("Female".equals(gender)) {
            radiobtn_female.click();
        }
    }

    public void inputMilitaryServiceField(String militaryService) {
        field_militaryService.sendKeys(Keys.CONTROL, "A");
        field_militaryService.sendKeys(militaryService);
    }

    public void chooseSmokerOrNot(String smoker) {
        if ("Yes".equals(smoker)) {
            checkbox_smoker.click();
        } else if ("No".equals(smoker)) {
        }
    }

    public void clickTheSaveButtonForPersonalDetails() {
        btn_SavePersonalDetail.click();
    }

    public void successMessageIsDisplayedForUpdatePersonalDetails() {
        Assert.assertTrue(successMessage_successfullyUpdated.isDisplayed());
    }


//===================================================================================================================================================================================================================================//

//CONTACT DETAIL

    public void clickContactDetailsTab() {
        tab_contactDetail.click();
    }


    public void inputStreetOneField(String street1) {
        field_street1.sendKeys(Keys.CONTROL, "A");
        field_street1.sendKeys(street1);
    }


    public void inputStreetTwoField(String street2) {
        field_street2.sendKeys(Keys.CONTROL, "A");
        field_street2.sendKeys(street2);
    }


    public void inputCityField(String city) {
        field_city.sendKeys(Keys.CONTROL, "A");
        field_city.sendKeys(city);
    }


    public void inputStateField(String state) {
        field_state.sendKeys(Keys.CONTROL, "A");
        field_state.sendKeys(state);
    }


    public void inputZipField(String zip) {
        field_zip.sendKeys(Keys.CONTROL, "A");
        field_zip.sendKeys(zip);
    }


    public void chooseCountryDropdown(String country) {
        dropdwn_country.click();
        dropdwn_country.sendKeys(country);
        dropdwn_country.sendKeys(Keys.ARROW_DOWN);
        dropdwn_country.sendKeys(Keys.ENTER);
    }


    public void inputHomeField(String home) {
        field_home.sendKeys(Keys.CONTROL, "A");
        field_home.sendKeys(home);
    }


    public void inputMobileField(String mobile) {
        field_mobile.sendKeys(Keys.CONTROL, "A");
        field_mobile.sendKeys(mobile);
    }


    public void inputWorkField(String work) {
        field_work.sendKeys(Keys.CONTROL, "A");
        field_work.sendKeys(work);
    }


    public void inputWorkEmailField(String workEmail) {
        field_workEmail.sendKeys(Keys.CONTROL, "A");
        field_workEmail.sendKeys(workEmail);
    }


    public void inputOtherEmailField(String otherEmail) {
        field_otherEmail.sendKeys(Keys.CONTROL, "A");
        field_otherEmail.sendKeys(otherEmail);
    }


    public void clickTheSaveButtonForContactDetails() {
        btn_saveContactDetail.click();
    }


    public void successMessageIsDisplayedForUpdateContactDetails() {
        Assert.assertTrue(successMessage_successfullyUpdated.isDisplayed());
    }

}