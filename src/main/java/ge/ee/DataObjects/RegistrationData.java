package ge.ee.DataObjects;
import com.github.javafaker.Faker;

public interface RegistrationData {
    Faker faker=new Faker();
    String
        firstName = faker.name().firstName(),
        lastName = "Chubinidze",
        email = "ninochubinidze@gmail.com",
        password = "123asdASD";

}
