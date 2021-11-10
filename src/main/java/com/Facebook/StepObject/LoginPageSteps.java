package com.Facebook.StepObject;

import com.Facebook.PageObject.LoginPage;
import com.codeborne.selenide.Condition;
import org.testng.Assert;

public class LoginPageSteps extends LoginPage {
    public LoginPageSteps email(String Email) {
        email.sendKeys(Email);
        email.shouldNotBe(Condition.empty);
        return this;
    }
    public LoginPageSteps password(String Password) {
        password.sendKeys(Password);
        password.shouldNotBe(Condition.empty);
        return this;
    }
    public LoginPageSteps LoginBtn(){
        Assert.assertTrue(LoginBtn.is(Condition.visible));
        return this;
    }

}
