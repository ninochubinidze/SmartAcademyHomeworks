package ge.ee.StepObject;

import com.Facebook.PageObject.RegistrationPage;
import com.codeborne.selenide.Condition;
import org.testng.Assert;

public class RegistrationPageSteps extends RegistrationPage {
    public RegistrationPageSteps signUp() {
        createAccountButton.click();
        return this;
    }

    public RegistrationPageSteps firstName(String FIRSTNAME) {
        firstName.sendKeys(FIRSTNAME);
        firstName.shouldNotBe(Condition.empty);
        return this;
    }

    public RegistrationPageSteps lastName(String LASTNAME) {
        lastName.sendKeys(LASTNAME);
        lastName.shouldNotBe(Condition.empty);
        return this;
    }

    public RegistrationPageSteps email(String EMAIL) {
        email.sendKeys(EMAIL);
        email.shouldNotBe(Condition.empty);
        return this;
    }

    public RegistrationPageSteps confirmemail(String EMAIL) {
        emailconfirmation.sendKeys(EMAIL);
        emailconfirmation.shouldNotBe(Condition.empty);
        return this;
    }

    public RegistrationPageSteps Password(String password) {
        passwordinput.sendKeys(password);
        passwordinput.shouldNotBe(Condition.empty);
        Assert.assertEquals(passwordinput.getValue(), password);
        return this;
    }

    public RegistrationPageSteps birthday(String BIRTHDAY, String BIRTHMONTH, String BIRTHYEAR) {
        birthday.selectOption(BIRTHDAY);
        birthday.shouldNotBe(Condition.empty);
        birthMonth.selectOption(BIRTHMONTH);
        birthMonth.shouldNotBe(Condition.empty);
        birthYear.selectOption(BIRTHYEAR);
        birthYear.shouldNotBe(Condition.empty);
        return this;
    }

   /* public RegistrationPageSteps genderCustom() {
        customGender.click();
        emailconfirmation.shouldNotBe(Condition.empty);
        return this;
    }*/
}