package com.Facebook.PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    protected SelenideElement
            createAccountButton = $(byLinkText("Create new account")),
            userclickcreateAccountButton = $(".fcb"),
            firstName =  $(byName("firstname")),
            lastName = $(byName("lastname")),
            email = $(byName("reg_email__")),
            emailconfirmation = $(byName("reg_email_confirmation__")),
            passwordinput = $(By.id("password_step_input")),
            birthday = $("#day"),
            birthMonth = $("#month"),
            birthYear = $("#year"),
            preferredPronounInput = $(byName("preferred_pronoun")),
            customGenderInput =  $(byName("custom_gender")),
            customGender = $(byText("Custom")),
            fimaleGender = $(byText("Female"));







}

