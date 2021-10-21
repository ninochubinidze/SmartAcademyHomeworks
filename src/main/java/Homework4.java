import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Homework4 {
    @Test
    public void firstmethod() {
        WebDriverManager.chromedriver().setup();
        Configuration.startMaximized = true;
        Selenide.open("https://www.youtube.com/");
        $(By.name("search_query")).setValue("Pharrell Williams - Happy").pressEnter();
        sleep(7000);
    }
}
