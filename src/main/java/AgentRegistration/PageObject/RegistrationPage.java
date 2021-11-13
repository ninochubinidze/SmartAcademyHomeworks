package AgentRegistration.PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    protected SelenideElement
    registerBtn = $(byText("დარეგისტრირდი")),
    firstNameInput =  $(byName("firstNameD")),
    firstNameError =  $(byText("შეიყვანეთ თქვენი სახელი ქართულად!")),
    lastNameInput = $(byName("surNameD")),
    lastNameError = $(byText("შეიყვანეთ თქვენი გვარი ქართულად!")),
    dateofBirthInput = $(byXpath("/html/body/app/div/div/div/app-wizard-page/div/div/div[2]/wizard-form/div/div[1]/form/ul[2]/li/div/input")),
    dateofBirthError = $(byText("რეგისტრაციისთვის უნდა იყოთ სრულწლოვანი!")),
    datepickerInput = $(byXpath("//body/app[1]/div[1]/div[1]/div[1]/app-wizard-page[1]/div[1]/div[1]/div[2]/wizard-form[1]/div[1]/div[1]/form[1]/ul[2]/li[1]/div[1]/ng-datepicker[1]/div[1]/div[1]/div[1]")),
    backBtn = $(byXpath("//*[@id=\"Back\"]")),
    mobileNumberInput = $(byName("phone")),
    mobileNumberError =  $(byText("შეიყვანეთ ტელეფონის ნომერი სწორი ფორმატით!")),
    emailInput = $(byName("email")) ,
    emailError = $(byText("შეიყვანეთ თქვენი ელფოსტა სწორად!")),
    districtInput =  $(byName("municipalityD")),
    selectdistrictInput = $(".open .ng-star-inserted:nth-child(3)"),
    populatedAreaInput = $(byName("settlementD")),
    selectpopulatedAreaInput = $(".open .ng-star-inserted:nth-child(1)"),
    actualAddressInput = $(byName("actualAddress")),
    personalNumber = $((byXpath("//form/ul[7]/li/div/ol-block-input/div/input[3]"))),
    personalNumberInput = $((byXpath("//form/ul[7]/li/div/ol-block-input/div/input[1]"))),
    personalNumberError =  $(byText("პირადი ნომერი შედგება 11 ციფრისგან !")),
    repeatpersonalNumber = $((byXpath("//form/ul[8]/li/div/ol-block-input/div/input[3]"))),
    repeatpersonalNumberInput = $((byXpath("//form/ul[8]/li/div/ol-block-input/div/input[1]"))),
    repeatpersonalNumberError =  $(byText("პირადი ნომრები არ ემთხვევა ერთმანეთს !")),
    passwordinput = $(byName("passwordD")),
    passwordError = $(byText("პაროლი უნდა შედგებოდეს მინიმუმ 9 სიმბოლოსგან და უნდა შეიცავდეს მინიმუმ ერთ დიდ ლათინურ ასოს და ერთ ციფრს!")),
    repeatPasswordInput = $(byName("confirmpasswordD")),
    repeatpasswordError = $(byText("პაროლები არ ემთხვევა ერთმანეთს !")),
    checkboxBtn = $(".checkbox"),
    continuedBtn = $(byText("გაგრძელება")),
    checkpButton = $(".accept > .checkbox-block use"),
    cancelBtn = $(byText("გაუქმება")),
    otpValue = $(byName("message")),
    acceptBtn = $(byText("ვეთანხმები")),
    finishBtn = $(byText("დასრულება"));

}
