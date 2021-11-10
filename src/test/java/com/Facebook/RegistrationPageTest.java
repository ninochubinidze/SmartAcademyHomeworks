package com.Facebook;

import com.Facebook.StepObject.RegistrationPageSteps;
import com.Facebook.Utils.RunChrome;
import org.testng.annotations.Test;

import static com.Facebook.DataObjects.RegistrationData.*;


public class RegistrationPageTest extends RunChrome {
    @Test
    public void FacebookRegistration() {
        RegistrationPageSteps steps = new RegistrationPageSteps();
        steps
                .signUp()
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .confirmemail(email)
                .birthday(birthDay,birthMonth,birthYear)
                .genderCustom()
                .PreferredPronoun(selectPronoun)
                .genderFemale();





    }
}
