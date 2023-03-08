package selenium.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSettings {
    protected static WebDriver driver;

    public void setupDriver() {
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com");
        driver.manage().window().maximize();
    }
}
