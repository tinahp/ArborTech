package baseClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import pageObject.AboutPage;
import pageObject.ContactUS;
import pageObject.ServicePage;
import pageObject.landingPage;
import reports.extentManager;

import java.sql.Driver;

public class baseClassTest {

    public static WebDriver driver;

    public static WebDriver startdriver(String browser) {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            driver = new ChromeDriver();
        } else
            return driver;
        return null;
    }

    ExtentTest test;
    ExtentReports reports;
    extentManager ExtentManager = new extentManager();
    // Create a Landing page
    protected landingPage landingPage;
    protected AboutPage AboutPage;
    protected ServicePage ServicePage;
    protected ContactUS ContactUs;

    @BeforeTest
    public void SetUp() {
        reports = ExtentManager.getReports();
        test = reports.createTest("BaseClassTest");
        //Set Chrome Browser
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        // maximize window
        driver.manage().window().maximize();
        //Open the page URL
        driver.get("https://arboredtech.com/");
        test.log(Status.INFO, "Starting test case Home_Search");


        //Instantiate landingpage after launching the browser
        landingPage = new landingPage(driver);
        AboutPage  = new AboutPage(driver);
        ServicePage = new ServicePage(driver);
        ContactUs  = new ContactUS(driver);
    }
}