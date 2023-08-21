package TestSuites;

import baseClass.baseClassTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.AboutPage;
import pageObject.ContactUS;
import pageObject.ServicePage;

import java.util.concurrent.TimeUnit;


public class ServiceTest extends baseClassTest {

    ExtentReports extent = new ExtentReports();
    ExtentReports reports;

    //set Extent report methods
    @BeforeTest

    public void innit (){
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    @Test(priority = 0 )
    public void ServiceCheck() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,6000)");
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        ServicePage.Clickeddetails();
        Thread.sleep(1000);
        //ServicePage.ClickedService();
    }

        @Test(priority = 1)
         public void ContactCheck() throws InterruptedException {
            ContactUS contactPage  = new ContactUS(driver);
            driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
            ContactUs.CONTACT();
            Thread.sleep(2000);
            ContactUs.FIRST();
            Thread.sleep(2000);
            ContactUs.LAST();
            Thread.sleep(2000);
            ContactUs.MESSAGE();
            Thread.sleep(2000);
            ContactUs.SUBMIT();
            System.out.println("PASSED: Successful");
            System.out.println("Thanks for contacting us! We will be in touch with you shortly.");
            ContactUs.ConvertHere();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.close();


        }


    }

