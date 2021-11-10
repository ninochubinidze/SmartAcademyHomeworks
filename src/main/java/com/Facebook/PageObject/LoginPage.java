package com.Facebook.PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.*;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    protected SelenideElement
            email = $(By.id("email")),
            password = $(By.id("pass")),
            LoginBtn = $(By.name("login"));


}
