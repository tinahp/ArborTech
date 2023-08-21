package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ServicePage {

    //instantiate webdriver
    public WebDriver driver;

    public ServicePage(WebDriver driver) {
        this.driver = driver;
    }

    //Locate Elements on webpage
    private By Accountdetails = By.xpath("//span[@class='elementor-button-text']");
    private By Services1 = By.xpath("//ul[contains(@aria-expanded,'false')]//a[contains(@class,'menu-link')][normalize-space()='Services']");


    //Input Action on the Element
    public void Clickeddetails() {
        driver.findElement(Accountdetails).click();
    }

    // void ClickedService() {
      //  driver.findElement(Services1).click();
   // }

    public ContactUS clickContact() {
        driver.findElement(Services1).click();
        return new ContactUS(driver);

    }
}
