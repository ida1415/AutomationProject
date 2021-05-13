package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DetailProductPage extends BasePage {

    public DetailProductPage(WebDriver driver) {
        super(driver);
    }

    private WebElement CurrencyOptions() {
        return driver.findElement(By.cssSelector("#form-currency > div"));
    }
    private  WebElement dollarOption(){
        return driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/ul/li[3]/button"));
    }
    private  WebElement euroOption(){
        return driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/ul/li[1]/button"));
    }
    private  WebElement poundOption(){
        return driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/ul/li[2]/button"));
    }
    public WebElement getPrice(){
        return driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/ul[2]/li[1]/h2"));
    }

    public void selectDollarCurrency(){
        this.CurrencyOptions().click();
        this.dollarOption().click();
    }
    public void selectEuroCurrency(){
        this.CurrencyOptions().click();
        this.euroOption().click();
    }
    public void selectPoundCurrency(){
        this.CurrencyOptions().click();
        this.poundOption().click();
    }
}
