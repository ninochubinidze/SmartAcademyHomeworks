package com.Facebook.Utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class RunChrome {
    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        Configuration.startMaximized = true;
        //Selenide.open("https://ee.ge/");
        Selenide.open("https://www.facebook.com/");

    }
    @AfterTest
    public static void tearDown() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
    }
}
