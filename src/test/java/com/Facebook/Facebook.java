package com.Facebook;

import com.Facebook.StepObject.RegistrationSteps;
import com.Facebook.Utils.RunChrome;
import org.testng.annotations.Test;

import static com.Facebook.DataObjects.RegistrationData.firstName;
import static com.Facebook.DataObjects.RegistrationData.lastName;

public class Facebook extends RunChrome {
    @Test
    public void FacebookRegistration() {
        RegistrationSteps steps = new RegistrationSteps();
        steps
                .signUp()
                .firstName(firstName)
                .lastName(lastName);


    }
}
