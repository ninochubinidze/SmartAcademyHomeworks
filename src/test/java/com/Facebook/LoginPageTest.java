package com.Facebook;

import com.Facebook.StepObject.LoginPageSteps;
import com.Facebook.Utils.RunChrome;
import org.testng.annotations.Test;

import static com.Facebook.DataObjects.LoginData.email;
import static com.Facebook.DataObjects.LoginData.password;

public class LoginPageTest extends RunChrome {
    @Test
    public void FacebookLogin(){
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps
                .email(email)
                .password(password)
                .LoginBtn();

    }
}
