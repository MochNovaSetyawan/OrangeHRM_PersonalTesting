package step;

import config.base;
import data.myInfoData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.myInfoPage;


public class myInfoStep extends base {

    myInfoPage myInfoPage = new myInfoPage(driver);

    @When("Click the my info module")
    public void clickTheMyInfoModule() throws InterruptedException {
        Thread.sleep(750);
        myInfoPage.clickTheMyInfoModule();
    }

    @And("Click personal details tab")
    public void clickPersonalDetailsTab() throws InterruptedException {
        Thread.sleep(750);
        myInfoPage.clickPersonalDetailsTab();
    }

    @And("Input employee fullname field")
    public void inputEmployeeFullnameField() throws InterruptedException {
        Thread.sleep(750);
        myInfoPage.inputEmployeeFullnameField(
                myInfoData.TRUE_PERSONALDETAILS_FIRSTNAME,
                myInfoData.TRUE_PERSONALDETAILS_MIDDLE,
                myInfoData.TRUE_PERSONALDETAILS_LAST);
    }

    @And("Input nickname field")
    public void inputNicknameField() throws InterruptedException {
        Thread.sleep(750);
        myInfoPage.inputNicknameField(myInfoData.TRUE_PERSONALDETAILS_NICKNAME);
    }

    @And("Input employee id field")
    public void inputEmployeeIdField() throws InterruptedException {
        Thread.sleep(750);
        myInfoPage.inputEmployeeIdField(myInfoData.TRUE_PERSONALDETAILS_EMPLOYEEID);
    }

    @And("Input other id field")
    public void inputOtherIdField() throws InterruptedException {
        Thread.sleep(750);
        myInfoPage.inputOtherIdField(myInfoData.TRUE_PERSONALDETAILS_OTHERID);
    }

    @And("Input driver's license number field")
    public void inputDriverSLicenseNumberField() throws InterruptedException {
        Thread.sleep(750);
        myInfoPage.inputDriverSLicenseNumberField(myInfoData.TRUE_PERSONALDETAILS_DRIVERSLICENSENUMBER);
    }

    @And("Input license expiry date field")
    public void inputLicenseExpiryDateField() throws InterruptedException {
        Thread.sleep(750);
        myInfoPage.inputLicenseExpiryDateField(myInfoData.TRUE_PERSONALDETAILS_LICENSEEXPIRYDATE);
    }

    @And("Input ssn number field")
    public void inputSsnNumberField() throws InterruptedException {
        Thread.sleep(750);
        myInfoPage.inputSsnNumberField(myInfoData.TRUE_PERSONALDETAILS_SSNNUMBER);
    }

    @And("Input sin number field")
    public void inputSinNumberField() throws InterruptedException {
        Thread.sleep(750);
        myInfoPage.inputSinNumberField(myInfoData.TRUE_PERSONALDETAILS_SINNUMBER);
    }

    @And("Choose nationality dropdown")
    public void chooseNationalityDropdown() throws InterruptedException {
        Thread.sleep(750);
        myInfoPage.chooseNationalityDropdown(myInfoData.TRUE_PERSONALDETAILS_NATIONALITY);
    }

    @And("Choose marital status dropdown")
    public void chooseMaritalStatusDropdown() throws InterruptedException {
        Thread.sleep(750);
        myInfoPage.chooseMaritalStatusDropdown(myInfoData.TRUE_PERSONALDETAILS_MARITALSTATUS);
    }

    @And("Input date of birth field")
    public void inputDateOfBirthField() throws InterruptedException {
        Thread.sleep(750);
        myInfoPage.inputDateOfBirthField(myInfoData.TRUE_PERSONALDETAILS_DATEOFBIRTH);
    }

    @And("Choose gender radio button")
    public void chooseGenderRadioButton() throws InterruptedException {
        Thread.sleep(750);
        myInfoPage.chooseGenderRadioButton(myInfoData.TRUE_PERSONALDETAILS_GENDER);
    }

    @And("Input military service field")
    public void inputMilitaryServiceField() throws InterruptedException {
        Thread.sleep(750);
        myInfoPage.inputMilitaryServiceField(myInfoData.TRUE_PERSONALDETAILS_MILITARYSERVICE);
    }

    @And("Choose smoker or not")
    public void chooseSmokerOrNot() throws InterruptedException {
        Thread.sleep(750);
        myInfoPage.chooseSmokerOrNot(myInfoData.TRUE_PERSONALDETAILS_SMOKER);
    }

    @And("Click the save button for personal details")
    public void clickTheSaveButtonForPersonalDetails() throws InterruptedException {
        Thread.sleep(750);
        myInfoPage.clickTheSaveButtonForPersonalDetails();
    }

    @Then("Success message is displayed for update personal details")
    public void successMessageIsDisplayedForUpdatePersonalDetails() throws InterruptedException {
        Thread.sleep(750);
        myInfoPage.successMessageIsDisplayedForUpdatePersonalDetails();
    }

    @When("Click contact details tab")
    public void clickContactDetailsTab() throws InterruptedException {
        Thread.sleep(750);
        myInfoPage.clickContactDetailsTab();
    }

    @And("Input street one field")
    public void inputStreetOneField() throws InterruptedException {
        Thread.sleep(750);
        myInfoPage.inputStreetOneField(myInfoData.TRUE_PERSONALDETAILS_STREET1);
    }

    @And("Input street two field")
    public void inputStreetTwoField() throws InterruptedException {
        Thread.sleep(750);
        myInfoPage.inputStreetTwoField(myInfoData.TRUE_PERSONALDETAILS_STREET2);
    }

    @And("Input city field")
    public void inputCityField() throws InterruptedException {
        Thread.sleep(750);
        myInfoPage.inputCityField(myInfoData.TRUE_PERSONALDETAILS_CITY);
    }

    @And("Input State field")
    public void inputStateField() throws InterruptedException {
        Thread.sleep(750);
        myInfoPage.inputStateField(myInfoData.TRUE_PERSONALDETAILS_STATE);
    }

    @And("Input zip field")
    public void inputZipField() throws InterruptedException {
        Thread.sleep(750);
        myInfoPage.inputZipField(myInfoData.TRUE_PERSONALDETAILS_ZIP);
    }

    @And("Choose country dropdown")
    public void chooseCountryDropdown() throws InterruptedException {
        Thread.sleep(750);
        myInfoPage.chooseCountryDropdown(myInfoData.TRUE_PERSONALDETAILS_COUNTRY);
    }

    @And("Input home field")
    public void inputHomeField() throws InterruptedException {
        Thread.sleep(750);
        myInfoPage.inputHomeField(myInfoData.TRUE_PERSONALDETAILS_HOME);
    }

    @And("Input mobile field")
    public void inputMobileField() throws InterruptedException {
        Thread.sleep(750);
        myInfoPage.inputMobileField(myInfoData.TRUE_PERSONALDETAILS_MOBILE);
    }

    @And("Input work field")
    public void inputWorkField() throws InterruptedException {
        Thread.sleep(750);
        myInfoPage.inputWorkField(myInfoData.TRUE_PERSONALDETAILS_WORK);
    }

    @And("Input work email field")
    public void inputWorkEmailField() throws InterruptedException {
        Thread.sleep(750);
        myInfoPage.inputWorkEmailField(myInfoData.TRUE_PERSONALDETAILS_WORKEMAIL);
    }

    @And("Input other email field")
    public void inputOtherEmailField() throws InterruptedException {
        Thread.sleep(750);
        myInfoPage.inputOtherEmailField(myInfoData.TRUE_PERSONALDETAILS_OTHERMAIL);
    }

    @And("Click the save button for contact details")
    public void clickTheSaveButtonForContactDetails() throws InterruptedException {
        Thread.sleep(750);
        myInfoPage.clickTheSaveButtonForContactDetails();
    }

    @Then("Success message is displayed for update contact details")
    public void successMessageIsDisplayedForUpdateContactDetails() throws InterruptedException {
        Thread.sleep(750);
        myInfoPage.successMessageIsDisplayedForUpdateContactDetails();
        quitDriver();
    }
}
