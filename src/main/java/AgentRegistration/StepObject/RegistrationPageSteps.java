package AgentRegistration.StepObject;

import AgentRegistration.PageObject.RegistrationPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import static AgentRegistration.DataObjects.RegistrationData.birthDay;
import static AgentRegistration.DataObjects.RegistrationData.birthMonth;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPageSteps extends RegistrationPage {
    @Step("Click Register button")
    public RegistrationPageSteps signUp() {
        registerBtn.click();
        return this;
    }

    @Step("Click Cancel button")
    public RegistrationPageSteps CancelBtnCheck() {
        cancelBtn.click();
        Assert.assertTrue(registerBtn.is(Condition.visible));
        return this;
    }

    @Step("Empty Firstname Input Value Validation")
    public RegistrationPageSteps EmptyFirstName() {
        firstNameInput.pressTab();
        Assert.assertTrue(firstNameError.is(Condition.visible));
        return this;
    }

    @Step("Invalid Firstname Input Value Validation")
    public RegistrationPageSteps InvalidFirstName(String INVALIDFIRSTNAME) {
        firstNameInput.setValue(INVALIDFIRSTNAME);
        Assert.assertTrue(firstNameError.is(Condition.visible));
        return this;
    }

    @Step("Firstname Input Value Validation")
    public RegistrationPageSteps FirstName(String FIRSTNAME) {
        firstNameInput.setValue(FIRSTNAME);
        Assert.assertFalse(firstNameInput.is(Condition.empty));
        return this;
    }

    @Step("Empty Lastname Input Value Validation")
    public RegistrationPageSteps EmptyLastName() {
        lastNameInput.pressTab();
        Assert.assertTrue(lastNameError.is(Condition.visible));
        return this;
    }

    @Step("Invalid Lastname Input Value Validation")
    public RegistrationPageSteps InvalidLastName(String INVALIDLASTNAME) {
        lastNameInput.setValue(INVALIDLASTNAME);
        Assert.assertTrue(lastNameError.is(Condition.visible));
        return this;
    }

    @Step("Lastname Input Value Validation")
    public RegistrationPageSteps LastName(String LASTNAME) {
        lastNameInput.setValue(LASTNAME);
        Assert.assertFalse(lastNameInput.is(Condition.empty));
        return this;
    }

    @Step("Continue Button Click")
    public RegistrationPageSteps ContinueButton() {
        continuedBtn.click();
        Assert.assertTrue(continuedBtn.is(Condition.visible));
        return this;
    }

    @Step("Empty BirthDate Input Value Validation")
    public RegistrationPageSteps EmptyBirthDay() {
        Assert.assertTrue(dateofBirthInput.is(Condition.empty));
        Assert.assertTrue(dateofBirthError.is(Condition.visible));
        return this;
    }

    @Step("BirthDate Input Value Validation")
    public RegistrationPageSteps BirthDay() {
        dateofBirthInput.click();
        while (true) {
            datepickerInput.getText();
            if (datepickerInput.getText().equals(birthMonth)) {
                $(byText(birthDay)).click();
                break;
            } else {
                backBtn.click();
            }
        }

        return this;
    }

    @Step("Empty Mobile Number Input Value Validation")
    public RegistrationPageSteps EmptyMobileNumber() {
        Assert.assertTrue(mobileNumberInput.is(Condition.empty));
        Assert.assertTrue(mobileNumberError.is(Condition.visible));
        return this;
    }

    @Step("Invalid Mobile Number Input Value Validation")
    public RegistrationPageSteps InvalidMobileNumber(String INVALIDMOBILENUMBER) {
        mobileNumberInput.setValue(INVALIDMOBILENUMBER);
        continuedBtn.click();
        Assert.assertTrue(mobileNumberError.is(Condition.visible));
        return this;
    }

    @Step("Mobile Number Input Value Validation")
    public RegistrationPageSteps MobileNumber(String MOBILENUMBER) {
        mobileNumberInput.clear();
        mobileNumberInput.setValue(MOBILENUMBER);
        Assert.assertFalse(mobileNumberInput.is(Condition.empty));
        return this;
    }

    @Step("Invalid Email Input Value Validation")
    public RegistrationPageSteps InvalidEmail(String INVALIDEMAIL) {
        emailInput.clear();
        emailInput.setValue(INVALIDEMAIL);
        Assert.assertTrue(emailError.is(Condition.visible));
        return this;
    }

    @Step("Email Input Value Validation")
    public RegistrationPageSteps Email(String EMAIL) {
        emailInput.clear();
        emailInput.setValue(EMAIL);
        Assert.assertFalse(emailInput.is(Condition.empty));
        return this;
    }

    @Step("Municipality  Select")
    public RegistrationPageSteps Municipality() {
        districtInput.click();
        selectdistrictInput.click();
        return this;
    }

    @Step("settlement  Select")
    public RegistrationPageSteps Settlement() {
        populatedAreaInput.click();
        selectpopulatedAreaInput.click();
        return this;
    }

    @Step("Actual Address Input  ")
    public RegistrationPageSteps ActualAddress(String ADDRESS) {
        Assert.assertTrue(actualAddressInput.is(Condition.empty));
        actualAddressInput.setValue(ADDRESS);
        return this;
    }

    @Step("Empty Personal Number Input Value Validation")
    public RegistrationPageSteps EmptyPersonalNumber() {
        continuedBtn.click();
        Assert.assertTrue(personalNumberError.is(Condition.visible));
        return this;
    }

    @Step("Personal Number Input Value Validation")
    public RegistrationPageSteps PersonalNumber(String PERSONALID) {
        personalNumber.doubleClick();
        personalNumberInput.sendKeys(PERSONALID);
        Assert.assertFalse(personalNumberError.is(Condition.visible));
        return this;
    }

    @Step("Empty  Repeat Personal Number Input Value Validation")
    public RegistrationPageSteps EmptyRepeatPersonalNumber() {
        Assert.assertTrue(repeatpersonalNumberError.is(Condition.visible));
        return this;
    }

    @Step("Invalid Repeat Personal Number Input Value Validation")
    public RegistrationPageSteps InvalidRepeatPersonalNumber(String INVALIDPERSONALID) {
        repeatpersonalNumber.doubleClick();
        repeatpersonalNumberInput.sendKeys(INVALIDPERSONALID);
        Assert.assertTrue(repeatpersonalNumberError.is(Condition.visible));
        return this;
    }

    @Step("Repeat Personal Number Input Value Validation")
    public RegistrationPageSteps RepeatPersonalNumber(String REPEATPERSONALID) {
        for (int i = 0; i <= 10; i++) {
            repeatpersonalNumberInput.sendKeys(Keys.BACK_SPACE);
        }
        repeatpersonalNumber.doubleClick();
        repeatpersonalNumberInput.sendKeys(REPEATPERSONALID);
        Assert.assertFalse(personalNumberError.is(Condition.visible));
        return this;
    }

    @Step("Empty Password Input Value Validation")
    public RegistrationPageSteps EmptyPassword() {
        Assert.assertTrue(passwordError.is(Condition.visible));
        return this;
    }

    @Step("Invalid Password Input Value Validation")
    public RegistrationPageSteps InvalidPassword(String PASSWORD) {
        passwordinput.sendKeys(PASSWORD);
        Assert.assertTrue(passwordError.is(Condition.visible));
        return this;
    }

    @Step(" Password Input Value Validation")
    public RegistrationPageSteps Password(String PASSWORD) {
        passwordinput.sendKeys(PASSWORD);
        return this;
    }

    @Step("Empty Repeat Password Input Value Validation")
    public RegistrationPageSteps EmptyRepeatPassword() {
        Assert.assertTrue(repeatpasswordError.is(Condition.visible));
        return this;
    }

    @Step("Invalid Repeat Password Input Value Validation")
    public RegistrationPageSteps InvalidRepeatPassword(String PASSWORD) {
        repeatPasswordInput.sendKeys(PASSWORD);
        Assert.assertTrue(repeatpasswordError.is(Condition.visible));
        return this;
    }

    @Step("Repeat Password Input Value Validation")
    public RegistrationPageSteps RepeatPassword(String PASSWORD) {
        repeatPasswordInput.sendKeys(PASSWORD);
        Assert.assertFalse(repeatpasswordError.is(Condition.visible));
        return this;
    }

    @Step("Agree terms and conditions checkbox")
    public RegistrationPageSteps CheckboxButton(){
        checkboxBtn.click();
        continuedBtn.click();
        return this;
}
    @Step("OTP check page")
    public RegistrationPageSteps OTPCheck(String OTP){
       otpValue.sendKeys(OTP);
       acceptBtn.click();
        return this;
    }
    @Step(" terms  checkbox")
    public RegistrationPageSteps checkButton(){
        checkpButton.click();
        return this;
    }
    @Step("Finish Button Check")
    public RegistrationPageSteps Finish(){
        Assert.assertTrue(finishBtn.is(Condition.visible));
        finishBtn.click();
        return this;
    }

}
