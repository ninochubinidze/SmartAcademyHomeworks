package com.Facebook.StepObject;

import com.Facebook.PageObject.RegistrationPage;

public class RegistrationSteps extends RegistrationPage {
    public RegistrationSteps signUp(){
        createAccountButton.click();
        return this;
    }
    public RegistrationSteps firstName(String FIRSTNAME){
        firstName.sendKeys(FIRSTNAME);
        return this;
    }
    public RegistrationSteps lastName(String LASTNAME){
        lastName.sendKeys(LASTNAME);
        return this;
    }
}
