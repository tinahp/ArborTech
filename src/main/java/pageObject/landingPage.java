package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class landingPage {

    //instantiate webdriver
    public WebDriver driver;

    public landingPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locate Elements on webpage
    private By ClickHome = By.xpath("//ul[@aria-expanded='false']//a[normalize-space()='Home']");
    private By Clickplus = By.cssSelector("div[role='tablist'] div:nth-child(1) div:nth-child(1) ");
    private By ClickEperienced = By.xpath("//a[normalize-space()='Experienced Professionals']");
    private By ClickRoriented =By.cssSelector("div[id='elementor-tab-title-9812'] i[class='fas fa-plus']");
    private By ROriented= By.xpath("//a[normalize-space()='Result Oriented']");
    private By ClickOriented = By.xpath("//div[@class='elementor-tab-title elementor-active']//i[@class='fas fa-minus']");
    private By ClickSupport = By.cssSelector("div[id='elementor-tab-title-9813'] i[class='fas fa-plus']");
    private By ClientSupport =By.xpath("//a[normalize-space()='24x7 Client Support']");
   // private By ClickReadMore =By.cssSelector("div[class='elementor-element elementor-element-38d9a79d elementor-mobile-align-center elementor-widget elementor-widget-button'] a[role='button']");
    private By Explore = By.xpath("//span[contains(text(),'Explore More')]");

    //private By ClickReadMore = By.xpath("//span[contains(text(),'Read More')]");
    //private By Clickexporemore = By.xpath("//body//div//div//div//div//main//article");
    //private By ResultOriented = By.xpath("//body//div//div//div//div//main//article");
    //private By ClientSupport = By.xpath("//body//div//div//div//div//main//article");
    // private By CovertHere = By.xpath("//span[contains(text(),'Convert here')]");
    //private By ClickEPofession= By.xpath("//input[@placeholder='Referral Code (Optional)']");
    // private By EClickPartner = By.xpath("//body//div//div//div//div//main//article");
    //private By ClickResulTOri =By.xpath("//a[normalize-space()='Result Oriented']");


    //  Action on located Element
    public void ClickedHome() {driver.findElement(ClickHome).click();}
    public void PlusIcon(){driver.findElement(Clickplus).click();}
    public void Expereinced (){driver.findElement(ClickEperienced).click();}
   // public void ClickedRMore() {driver.findElement(ClickReadMore).click();}
    public void Oriented() {driver.findElement(ClickRoriented).click();}
    public void clickOrient(){driver.findElement(ROriented).click();}
    public void Clicksupport (){driver.findElement(ClientSupport).click();}
    public void Support(){driver.findElement(ClientSupport).click();}


    public AboutPage Explore1() {
        driver.findElement(Explore).click();
        return new AboutPage(driver);

    }
}