import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.selector.ByText;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Classwork {
    @Test
    public void firstmethod() {
        WebDriverManager.chromedriver().setup();
        Configuration.startMaximized = true;
        Selenide.open("https://ee.ge/");
        $(By.cssSelector(".btn-register:nth-child(1)")).click();
        $(By.id("firstName")).sendKeys("Nino");
        $(By.id("firstName")).shouldNotBe(Condition.empty);
        $(By.id("lastName")).sendKeys("Chubinidze");
        $(By.id("firstName")).shouldNotBe(Condition.empty);
        $(By.id("email")).sendKeys("ninochubinidze2016@gmail.com");
        $(By.id("firstName")).shouldNotBe(Condition.empty);
        $(By.id("password")).sendKeys("123asdASD");
        $(By.id("firstName")).shouldNotBe(Condition.empty);
        $(By.id("confirmPassword")).sendKeys("123asdASD");
        $(By.id("firstName")).shouldNotBe(Condition.empty);
        $(By.id("singup")).shouldBe(Condition.enabled);
        sleep(7000);
    }

    @Test
    public void Secondmethod() {
        WebDriverManager.chromedriver().setup();
        Configuration.startMaximized = true;
        Selenide.open("https://ee.ge/");
        $(By.cssSelector(".btn-register:nth-child(1)")).click();
        $(By.id("singup")).shouldNotBe(Condition.enabled);
        $(By.id("firstName")).click();
        $(By.id("lastName")).click();
        $(By.id("email")).click();
        $(By.id("password")).click();
        $(By.id("confirmPassword")).click();
        $(By.id("password")).click();
        $(byText("სახელი სავალდებულოა")).shouldBe(Condition.visible);
        $(byText("გვარი სავალდებულოა")).shouldBe(Condition.visible);
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
        $(byText("პაროლი სავალდებულოა.")).shouldBe(Condition.visible);
        $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(Condition.visible);
        $(By.id("password")).sendKeys("123as");
        $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(Condition.visible);
        $(By.id("confirmPassword")).sendKeys("123asdASD");
        $(byText("პაროლი სავალდებულოა.")).shouldBe(Condition.visible);
        Selenide.open("https://ee.ge/registration");
        $(By.id("email")).setValue("test");
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
        Selenide.open("https://ee.ge/registration");
        $(By.id("email")).setValue("test@");
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
        Selenide.open("https://ee.ge/registration");
        $(By.id("email")).setValue("test@gmail");
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
        Selenide.open("https://ee.ge/registration");
        $(By.id("email")).setValue("test@gmail.");
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
        Selenide.open("https://ee.ge/registration");
        sleep(5000);
    }

    @Test
    public void Thirdmethod() {
        WebDriverManager.chromedriver().setup();
        Configuration.startMaximized = true;
        Selenide.open("https://ee.ge/");
        $(By.className("btn-cart")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $(By.id("search_list")).setValue("კომპიუტერი").pressEnter();

        $(By.cssSelector(".add_to_cart")).click();
        sleep(5000);

    }
}
