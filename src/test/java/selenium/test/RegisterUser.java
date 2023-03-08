package selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import selenium.pages.AutomationExcerciseHomePage;
import selenium.utils.TestSettings;

import java.util.concurrent.TimeUnit;

public class RegisterUser extends TestSettings {

    @BeforeTest
    public void prepareDriver(){
        TestSettings testSettings = new TestSettings();
        testSettings.setupDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void home_page_is_visible_successfully() throws Exception {
        AutomationExcerciseHomePage objAutomationExcerciseHomePage;
        objAutomationExcerciseHomePage = new AutomationExcerciseHomePage(TestSettings.driver);
        objAutomationExcerciseHomePage.HomeButtonClick();

        objAutomationExcerciseHomePage.HomeIsDisplayed();



    }

}
