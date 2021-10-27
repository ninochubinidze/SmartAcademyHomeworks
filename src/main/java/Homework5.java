import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Homework5 {
    @Test
    public void FacebookRegistration() {
        WebDriverManager.chromedriver().setup();
        Configuration.startMaximized = true;
        Selenide.open("https://www.facebook.com/");
        $(byText("Create New Account")).click();
        $(byName("firstname")).sendKeys("Nino");
        $(byName("lastname")).sendKeys("Chubinidze");
        $(byName("reg_email__")).sendKeys("ninochubinidze2016@gmail.com");
        $(byName("reg_email_confirmation__")).sendKeys("ninochubinidze2016@gmail.com");
        $(By.id("password_step_input")).sendKeys("123asdASD");
        $("#month").selectOption("Nov");
        $("#day").selectOption("16");
        $("#year").selectOption("1991");
        $$("label").findBy(Condition.text("Custom")).click();
        $(byName("preferred_pronoun")).shouldBe(Condition.visible);
        $(byName("custom_gender")).shouldBe(Condition.visible);
        $(byName("preferred_pronoun")).selectOption("She: \"Wish her a happy birthday!\"");
        $$("label").findBy(Condition.text("Female")).click();
        $(byName("preferred_pronoun")).shouldNotBe(Condition.visible);
        $(byName("custom_gender")).shouldNotBe(Condition.visible);
        sleep(6000);

    }
}
