package TestSuites;

import baseClass.baseClassTest;
import com.aventstack.extentreports.ExtentReports;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.AboutPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Home_SeacrchTest extends baseClassTest {

    ExtentReports extent = new ExtentReports();
    ExtentReports reports;

    //set Extent report methods

    @BeforeTest
    public void innit (){

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    @Test(priority = 0 )
    public void Homecheck() throws InterruptedException {
        landingPage.ClickedHome();
        Thread.sleep(2000);
        landingPage.PlusIcon();
        Thread.sleep(2000);
        landingPage.Expereinced();
        Thread.sleep(2000);
        landingPage.Oriented();
        Thread.sleep(2000);
        landingPage.clickOrient();
        Thread.sleep(2000);
        landingPage.Clicksupport();
        Thread.sleep(2000);
        landingPage.Support();
        Thread.sleep(3000);
        landingPage.Explore1();
        Thread.sleep(3000);
        // WebElement Scroll = driver.findElement(By.xpath("//span[contains(text(),'Read More')]"));
        // JavascriptExecutor jpeg = (JavascriptExecutor) driver;
        //jpeg.executeScript("arguments[0].scrollIntoView(true);", Scroll);
        // Scroll.click();
    }
      @Test(priority = 1 )
      public void AboutCheck() throws InterruptedException{
          AboutPage aboutPage  = new AboutPage(driver);
          // driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
          JavascriptExecutor js = (JavascriptExecutor)driver;
          js.executeScript("window.scrollBy(0,4000)");
          driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
          AboutPage.ApplyHere1();
          Thread.sleep(2000);
         // driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
          //AboutPage.ClickAbout1();
        // WebElement Scroll = driver.findElement(By.xpath("//ul[contains(@aria-expanded,'false')]//a[contains(@class,'menu-link')][normalize-space()='About']"));
        // JavascriptExecutor jpeg = (JavascriptExecutor) driver;
         //jpeg.executeScript("arguments[0].scrollIntoView(true);", Scroll);
          AboutPage.clickService();
          Thread.sleep(2000);


          // Scroll.click();
        /*  AboutPage.ClickTitle();
          Thread.sleep(2000);
          AboutPage.ClickFirstName();
          Thread.sleep(2000);
          AboutPage.ClickMiddleName();
          Thread.sleep(2000);
          AboutPage.ClickLast();
          Thread.sleep(2000);
          AboutPage.ClickEmaqil();
          Thread.sleep(2000);
          AboutPage.ClickPhone();
          Thread.sleep(2000);
          AboutPage.ClickAddress();
          Thread.sleep(2000);
          AboutPage.Suiteappartment();
          Thread.sleep(2000);
          AboutPage.ClickCity();
          Thread.sleep(2000);
          AboutPage.ClzickState();
          Thread.sleep(2000);
          AboutPage.CodeZip();
          Thread.sleep(2000);
          AboutPage.ClickCountrylist();
          Thread.sleep(2000);
          AboutPage.ClickCountryoption();
          Thread.sleep(500);
          AboutPage.clickDegree();
          Thread.sleep(500);
          AboutPage.prefferedCourses();
          Thread.sleep(500);
          AboutPage.ClickText();
          Thread.sleep(500);
          AboutPage.Meassgaes();*/
        }
    }

