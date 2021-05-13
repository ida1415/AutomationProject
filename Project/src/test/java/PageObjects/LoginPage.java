package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private WebElement setEmailText() {
        return driver.findElement(By.id("input-email"));
    }

    private WebElement setPasswordText() {
        return driver.findElement(By.id("input-password"));
    }

    private  WebElement setSubmitButton() {
        return driver.findElement(By.xpath("//input[@type='submit']"));
    }

    public void doLogin(String email, String password) {
        this.setEmailText().sendKeys(email);
        this.setPasswordText().sendKeys(password);
        this.setSubmitButton().click();
    }

}
