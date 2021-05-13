package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public WebElement productInCart () {
        return driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[2]/a"));
    }

    private List<WebElement> ProductList() {
        return driver.findElements(By.cssSelector("#content > div:nth-child(8) > div"));
    }

    public void AddProductToCart(String productName) {
        for (int i = 0; i < ProductList().size(); i++) {
            WebElement searchedProduct = ProductList().get(i);
            WebElement product = searchedProduct.findElement(By.cssSelector("div > div:nth-child(2) > div.caption > h4 > a"));

            if (product.getText().equals(productName)) {
                WebElement cartAddButton = searchedProduct.findElement(By.cssSelector("div.button-group > button:nth-child(1)"));
                cartAddButton.click();
                break;
            }

        }
    }
}


