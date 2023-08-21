package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUS {
    //instantiate webdriver
    public WebDriver driver;

    public ContactUS(WebDriver driver) { this.driver = driver;}


    //LocateWeb element
    private By Contact =By.xpath("//li[@id='menu-item-724']//a[@class='menu-link'][normalize-space()='Contact']");

    //Request Consultation
    private By First = By.cssSelector("input[placeholder='Your name*']");
    private By Last  = By.cssSelector("input[placeholder='Your email*']");
    private By Meassge = By.xpath("//textarea[@placeholder='Your message*']");
    private By Submit =By.cssSelector("button[value='wpforms-submit']");
    private By Convert =By.cssSelector(".elementor-button-text");


   // Action the Element
    public void CONTACT(){driver.findElement(Contact).click();}
    public void FIRST(){driver.findElement(First).sendKeys("Kelechi");}
    public void LAST(){driver.findElement(Last).sendKeys("Judith@gmail.com");}
    public void MESSAGE(){driver.findElement(Meassge).sendKeys("Attached my Document");}
    public void SUBMIT(){driver.findElement(Submit).click();}
    public void ConvertHere(){driver.findElement(Convert).click();}
}