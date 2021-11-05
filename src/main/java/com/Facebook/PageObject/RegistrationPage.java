package com.Facebook.PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    protected SelenideElement
            createAccountButton = $(byLinkText("Create new account")),
            firstName =  $(byName("firstname")),
            lastName = $(byName("lastname"));

    


}

