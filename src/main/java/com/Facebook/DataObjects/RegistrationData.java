package com.Facebook.DataObjects;
import com.github.javafaker.Faker;

public interface RegistrationData {
    Faker faker=new Faker();
    String
        firstName = "Nino",
        lastName = "Chubinidze",
        email = "ninochubinidze@gmail.com",
        password = "123asdASD",
        birthDay = faker.number().digits(1),
        birthMonth = "Nov",
        birthYear = "19"+faker.number().digits(2),
        selectPronoun = "She: \"Wish her a happy birthday!\"";
}
