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

//    List<WebElement> elements = driver.findElement(By.xpath(".//a[@style='color: orange;']"))
//            .findElements(By.xpath(".//a[text()=' Home']"));
//    WebElement przyciskHome = driver.findElement(By.xpath(".//a[@style='color: orange;']"));
//    .//li//a[contains(.,' Home')]//text()
//    WebElement przyciskHome = driver.findElement(By.xpath(".//li//a//i[@class='fa fa-home']"));

//    tutaj myk polega na tym że w klasie HomeButtonClick() mogę się odnieść WebElementu utworzonego przy użyciu FindBY
//    ale jak utworze sobie WebElement klasyczną metodą:
//    WebElement przyciskHome = driver.findElement(By.xpath(".//li//a//i[@class='fa fa-home']"));
//    to wywala mi błąd
//    org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element:
//    {"method":"css selector","selector":"*[name='przyciskHome']"}
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
