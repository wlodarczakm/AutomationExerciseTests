package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.utils.TestSettings;

import java.util.List;
import java.util.Objects;

public class AutomationExcerciseHomePage extends TestSettings {
    Actions actions = new Actions(driver);


    public AutomationExcerciseHomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = ".//a[@style='color: orange;']")
    WebElement homeButton;
    

    public void HomeButtonClick() {
//        elements.get(0).click();
        WebElement przyciskHome = driver.findElement(By.xpath(".//li//a//i[@class='fa fa-home']"));
        przyciskHome.click();
//        homeButton.click();
    }
    public void HomeIsDisplayed(){

        String textHome = driver.findElement(By.xpath("//a[contains(.,' Home')]")).getText().toString();
        System.out.println(textHome);
    }
}
