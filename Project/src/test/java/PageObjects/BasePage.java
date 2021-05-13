package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BasePage {

    static WebDriver driver;

    public BasePage(WebDriver _driver) {
        this.driver = _driver;
    }

    public void waitUntilElementExists(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void implicitWait(int time) {
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }

}


