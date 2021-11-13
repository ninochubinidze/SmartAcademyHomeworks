package agentRegistration;

import AgentRegistration.StepObject.RegistrationPageSteps;
import AgentRegistration.Utils.Retry;
import AgentRegistration.Utils.RunChrome;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static AgentRegistration.DataObjects.RegistrationData.*;

@Listeners(AgentRegistration.Utils.TestListers.class)
public class RegistrationPageTest extends RunChrome {
    @Test (retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.BLOCKER)
    @Description("ლიბერთი ბანკის პარტნიორად რეგისტრაციის პროცესი")
    public void agentRegistration(){
        RegistrationPageSteps steps = new RegistrationPageSteps();
        steps
                .signUp()
                .CancelBtnCheck()
                .signUp()
                .EmptyFirstName()
                .InvalidFirstName(invalidFirstName)
                .InvalidFirstName(invalidfirstname)
                .FirstName(firstName)
                .EmptyLastName()
                .InvalidLastName(invalidLastName)
                .InvalidLastName(invalidlastname)
                .LastName(lastName)
                .ContinueButton()
                .EmptyBirthDay()
                .BirthDay()
                .EmptyMobileNumber()
                .InvalidMobileNumber(ivalidMobileNumber)
                .MobileNumber(mobileNumber)
                .InvalidEmail(invalidemail)
                .InvalidEmail(invalidEmail)
                .Email(email)
                .Municipality()
                .Settlement()
                .ActualAddress(actualAddress)
                .EmptyPersonalNumber()
                .PersonalNumber(personalid)
                .EmptyRepeatPersonalNumber()
                .InvalidRepeatPersonalNumber(invalidpersonalid)
                .RepeatPersonalNumber(personalid)
                .EmptyPassword()
                .InvalidPassword(invalidpassword)
                .Password(password)
                .EmptyRepeatPassword()
                .InvalidRepeatPassword(invalidpassword)
                .RepeatPassword(password)
                .CheckboxButton()
                .OTPCheck(otp)
                .CheckboxButton()
                .OTPCheck(otp)
                .Finish();



    }
}
