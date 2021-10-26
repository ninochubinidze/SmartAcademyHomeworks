import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.*;

public class Classwork {
    @Test
    public void firstmethod() {
        WebDriverManager.chromedriver().setup();
        Configuration.startMaximized = true;
        Selenide.open("https://ee.ge/");
        $(cssSelector(".btn-register:nth-child(1)")).click();
        $(id("firstName")).sendKeys("Nino");
        $(id("firstName")).shouldNotBe(Condition.empty);
        $(id("lastName")).sendKeys("Chubinidze");
        $(id("firstName")).shouldNotBe(Condition.empty);
        $(id("email")).sendKeys("ninochubinidze2016@gmail.com");
        $(id("firstName")).shouldNotBe(Condition.empty);
        $(id("password")).sendKeys("123asdASD");
        $(id("firstName")).shouldNotBe(Condition.empty);
        $(id("confirmPassword")).sendKeys("123asdASD");
        $(id("firstName")).shouldNotBe(Condition.empty);
        $(id("singup")).shouldBe(Condition.enabled);
        sleep(7000);
    }

    @Test
    public void Secondmethod() {
        WebDriverManager.chromedriver().setup();
        Configuration.startMaximized = true;
        Selenide.open("https://ee.ge/");
        $(cssSelector(".btn-register:nth-child(1)")).click();
        $(id("singup")).shouldNotBe(Condition.enabled);
        $(id("firstName")).click();
        $(id("lastName")).click();
        $(id("email")).click();
        $(id("password")).click();
        $(id("confirmPassword")).click();
        $(id("password")).click();
        $(byText("სახელი სავალდებულოა")).shouldBe(Condition.visible);
        $(byText("გვარი სავალდებულოა")).shouldBe(Condition.visible);
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
        $(byText("პაროლი სავალდებულოა.")).shouldBe(Condition.visible);
        $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(Condition.visible);
        $(id("password")).sendKeys("123as");
        $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(Condition.visible);
        $(id("confirmPassword")).sendKeys("123asdASD");
        $(byText("პაროლი სავალდებულოა.")).shouldBe(Condition.visible);
        Selenide.open("https://ee.ge/registration");
        $(id("email")).setValue("test");
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
        Selenide.open("https://ee.ge/registration");
        $(id("email")).setValue("test@");
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
        Selenide.open("https://ee.ge/registration");
        $(id("email")).setValue("test@gmail");
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
        Selenide.open("https://ee.ge/registration");
        $(id("email")).setValue("test@gmail.");
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
        Selenide.open("https://ee.ge/registration");
        sleep(5000);
    }

    @Test
    public void Thirdmethod() {
        WebDriverManager.chromedriver().setup();
        Configuration.startMaximized = true;
        Selenide.open("https://ee.ge/");
        //გადადით კალათაში და დარწმუნდით რომ ცარიელია
        $(className("btn-cart")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        //დასერჩეთ ნებისმიერი რაღ რასაც შედეგი ექნება, მაგალითად კომპიუტერი, პირეველივე შედეგი დაამატეთ კალათაში
        $(id("search_list")).setValue("კომპიუტერი").pressEnter();
        $(cssSelector(".product-list:nth-child(2) .add_to_cart")).click();
        //გადადით კალათაში ნახეეთ რომ კალათა აღარაა ცარიელი
        $(className("btn-cart")).click();
        $(byText("კალათა ცარიელია")).shouldNotBe(Condition.visible);
        //წაშალეთ კალათიდან პროდუქტი
        $$("span").findBy(Condition.text("წაშლა")).click();
        //დარწმუნდიტ რომ კალათა კვლავ ცარიელია
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        sleep(6000);
    }
    @Test
    public void FourthMethod(){
        WebDriverManager.chromedriver().setup();
        Configuration.startMaximized = true;
        Selenide.open("https://ee.ge/");
        //გადადით კალათაში და დარწმუნდით რომ ცარიელია
        $(className("btn-cart")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        //გადადით შენახულ ნივთებში და დარწმუნდით რომ ცარიელია
        $$("span").findBy(Condition.text("შენახული ნივთები")).click();
        $(byText("ვერ მოიძებნა")).shouldBe(Condition.visible);
        //დასერჩეთ ნებისმიერი რაღ რასაც შედეგი ექნება, მაგალითად კომპიუტერი, პირეველივე შედეგი დაამატეთ კალათაში
        $(id("search_list")).setValue("კომპიუტერი").pressEnter();
        $(cssSelector(".product-list:nth-child(2) .add_to_cart")).click();
        //გადაით კალათაში და შეინახეთ მოცემული პროდუქტი
        $(className("btn-cart")).click();
        $$("span").findBy(Condition.text("შენახვა")).click();
        //გადადით შენახულ ნივთებში და შეამოწმეთ რომ აღარაა ცარიელი
        $$("span").findBy(Condition.text("შენახული ნივთები")).click();
        $(byText("ვერ მოიძებნა")).shouldNotBe(Condition.visible);
        //გადადით კალათაში და დარწუნდით რომ კალათიდან ავტოატურად წაიშალა პროდუქტი
        $(className("btn-cart")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        //გადადით შენახულ ნივთებში წაშალეთ შენახული პროდუქტი
        $$("span").findBy(Condition.text("შენახული ნივთები")).click();
        $(cssSelector(".btn_round")).click();
        //დარწმუნდით რომ შენახული ნივთები ცარიელია
        $$("span").findBy(Condition.text("შენახული ნივთები")).click();
        $(byText("ვერ მოიძებნა")).shouldBe(Condition.visible);
        sleep(6000);
    }
}
