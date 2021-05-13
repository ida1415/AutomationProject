package Tests;

import DataProviders.UsersDataProvider;
import org.testng.Assert;
import org.testng.annotations.*;
import PageObjects.LoginPage;
import PageObjects.dashboardPage;
import pojo.loginData;

public class LoginPageTests extends BaseTest {

    @Test (groups = {"regression"},dataProvider = "getUserDataFromJson", dataProviderClass = UsersDataProvider.class)
    public void doLogin(loginData _loginData) throws InterruptedException {
        dashboardPage dashboard = new dashboardPage(driver);
        dashboard.goToLogin();

        LoginPage login = new LoginPage(driver);
        login.doLogin(_loginData.getEmail(), _loginData.getPassword());

        dashboard.waitUntilElementExists(dashboard.setDashboardAccountContainer());
        Assert.assertEquals(dashboard.setDashboardAccountContainer().isDisplayed(), true);
    }
}
