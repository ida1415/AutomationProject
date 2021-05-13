package Tests;

import DataProviders.ProductDataProvider;
import PageObjects.ProductPage;
import org.testng.Assert;
import org.testng.annotations.*;
import PageObjects.dashboardPage;
import pojo.ProductData;


public class ProductTest extends BaseTest{
    @Test (groups = {"SearchProduct"},dataProvider = "getSearchDataFromJson", dataProviderClass = ProductDataProvider.class)
    public void doSearch(ProductData productData) throws InterruptedException {
        dashboardPage dashboard = new dashboardPage(driver);
        dashboard.doSearch(productData.getSearchItem());

        ProductPage productPage = new ProductPage(driver);
        productPage.AddProductToCart(productData.getSearchItem());
        dashboard.goToCart();
        Assert.assertTrue(productPage.productInCart().isDisplayed());
        Assert.assertEquals(productPage.productInCart().getText(),productData.getSearchItem());

    }
}
