import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Homework3 {
    @Test
    public void firstmethod(){
        WebDriverManager.chromedriver().setup();
        Configuration.startMaximized=true;
        Selenide.open("https://www.google.com/");
        //1.მივწვდი სერჩის ინფუთს
        $(By.name("q")).setValue("covid-19 საქართველოში");
        //2.დავაკლიკე ძებნა ღილაკს
        $(By.name("btnK")).click();
    }
    @Test
    public void secondMethod(){
        WebDriverManager.chromedriver().setup();
        Configuration.startMaximized=true;
        Selenide.open("https://www.google.com/");
        // image ლინკისთვის დააკოპირე xpath
        $(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[2]/a")).click();
        sleep(5000);
    }

}
