package AgentRegistration.DataObjects;

import com.github.javafaker.Faker;

public interface RegistrationData{
    Faker faker=new Faker();
    String
            firstName = "ნინა",
            invalidFirstName = "nino",
            invalidfirstname = "ნინოnino",
            lastName = "ჩუბინიძე",
            invalidLastName = "chubinidze",
            invalidlastname = "ჩუბინიdze",
            mobileNumber = "5"+faker.number().digits(8),
            ivalidMobileNumber = "591",
            email = faker.internet().emailAddress(),
            invalidemail = "n@gmail.",
            invalidEmail = "n@gmail",
            password = "123asdASD",
            invalidpassword = "12345678911",
            birthDay = "16",
            birthMonth = "November 2002",
            actualAddress = "ჭყნდიდელის 16",
            personalid = faker.number().digits(11),
            invalidpersonalid = "00000000000",
            otp = "0000";

}
