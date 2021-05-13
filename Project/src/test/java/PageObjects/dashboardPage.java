package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dashboardPage extends BasePage{


    public WebElement dashboardContainer;

    public dashboardPage(WebDriver driver) {
        super(driver);
    }

    public WebElement setDashboardAccountContainer() {

        return driver.findElement(By.id("account-account"));
    }
    public WebElement myAccountOption () {

        return driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"));
    }
    public WebElement registerOption () {
        return driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a"));
    }
    public WebElement searchInput () {

        return driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
    }
    public WebElement searchButton () {

        return driver.findElement(By.xpath("//*[@id=\"search\"]/span/button"));
    }
    public WebElement cartButton () {

        return driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a"));
    }
    private WebElement productfromList () {
        return driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/h4/a"));
    }
    public WebElement loginOption () {
        return driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
    }

    public void goToLogin(){
        this.myAccountOption().click();
        this.loginOption().click();
    }

    public void goToRegisterDashboard(){
        this.myAccountOption().click();
        this.registerOption().click();
    }

   public void doSearch (String search){
        this.searchInput().sendKeys(search);
        this.searchButton().click();
    }

    public void goToCart (){

        this.cartButton().click();
    }

   public void selectProduct (){

        this.productfromList().click();
    }
}