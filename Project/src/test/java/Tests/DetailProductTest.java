package Tests;

import DataProviders.ProductDataProvider;
import PageObjects.ProductPage;
import org.testng.annotations.Test;
import PageObjects.DetailProductPage;
import org.testng.Assert;
import org.testng.annotations.*;
import PageObjects.dashboardPage;
import pojo.ProductData;

public class DetailProductTest extends  BaseTest{
    @Test(groups = {"Dollar","Euro", "Pound Sterling"})
    public void validateDollarPrice () throws InterruptedException {
        dashboardPage dashboard = new dashboardPage(driver);
        dashboard.selectProduct();

        DetailProductPage detailProductPage = new DetailProductPage(driver);
        detailProductPage.selectDollarCurrency();
        Assert.assertTrue(detailProductPage.getPrice().getText().contains("$"));
    }
    @Test(groups = {"Dollar","Euro", "Pound Sterling"})
    public void validateEuroPrice () throws InterruptedException {
        dashboardPage dashboard = new dashboardPage(driver);
        dashboard.selectProduct();

        DetailProductPage detailProductPage = new DetailProductPage(driver);
        detailProductPage.selectEuroCurrency();
        Assert.assertTrue(detailProductPage.getPrice().getText().contains("€"));
    }
    @Test(groups = {"Dollar","Euro", "Pound Sterling"})
    public void validatePoundPrice () throws InterruptedException {
        dashboardPage dashboard = new dashboardPage(driver);
        dashboard.selectProduct();

        DetailProductPage detailProductPage = new DetailProductPage(driver);
        detailProductPage.selectPoundCurrency();
        Assert.assertTrue(detailProductPage.getPrice().getText().contains("£"));
    }
}
