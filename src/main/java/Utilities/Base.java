package Utilities;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class Base {
    //General
    protected static WebDriverWait wait;
    protected static WebDriver driver;
    protected static SoftAssert softAssert;

    //PageObject
    protected static HomePage DemoBlazeHomePage;
    protected static LoginPage DemoBlazeLoginPage;



}
