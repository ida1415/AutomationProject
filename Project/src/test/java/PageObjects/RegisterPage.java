package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pojo.RegisterData;

public class RegisterPage extends BasePage{

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    private WebElement firtNameText(){return driver.findElement(By.id("input-firstname"));}
    private WebElement lastNameText() {return driver.findElement(By.id("input-lastname"));}
    private WebElement emailText() {return driver.findElement(By.id("input-email"));}
    private WebElement phoneText () {return driver.findElement(By.id("input-telephone"));}
    private WebElement passwordText () {return driver.findElement(By.id("input-password"));}
    private WebElement confirmPassText () {return driver.findElement(By.id("input-confirm"));}
    private WebElement newsLetterRadio () {return driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input"));}
    private WebElement privacyCheckBox () {return driver.findElement(By.name("agree"));}
    private WebElement continueButton () {return driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));}
    public WebElement accountCreated(){
        return driver.findElement(By.xpath("//*[@id=\"content\"]/h1"));
    }

    public void doRegister(RegisterData registerData) {
        this.firtNameText().sendKeys(registerData.getFirstName());
        this.lastNameText().sendKeys(registerData.getLastName());
        this.emailText().sendKeys(registerData.getEmail());
        this.phoneText().sendKeys(registerData.getTelephone());
        this.passwordText().sendKeys(registerData.getPassword());
        this.confirmPassText().sendKeys(registerData.getPassword());
        this.newsLetterRadio().click();
        this.privacyCheckBox().click();
        this.continueButton().click();
    }
}
