package org.example.FirstLession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC01_ApproachSeleniumWebDriver {
    WebDriver webDriver;

    @BeforeClass
    public void Init() throws IOException {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }

    @Test
    public void Login() throws IOException {
        webDriver.get("https://hotel.stg.idemevents.com/");
    }

}
