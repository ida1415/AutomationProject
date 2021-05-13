package Tests;

import DataProviders.RegisterDataProvider;
import org.testng.Assert;
import org.testng.annotations.*;
import PageObjects.RegisterPage;
import PageObjects.dashboardPage;
import pojo.RegisterData;

public class RegisterPageTest extends BaseTest{


    @Test (groups = {"register"},dataProvider = "getRegisterDataFromJson", dataProviderClass = RegisterDataProvider.class)
    public void doRegister(RegisterData registerData) throws InterruptedException {
        dashboardPage dashboard = new dashboardPage(driver);
        dashboard.goToRegisterDashboard();

        RegisterPage register = new RegisterPage(driver);
        register.doRegister(registerData);

        Assert.assertEquals(register.accountCreated().isDisplayed(), true);
        Assert.assertEquals(register.accountCreated().getText(), "Your Account Has Been Created!");

    }
}
