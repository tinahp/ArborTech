package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutPage {
    //Instantiate  webdriver
    public WebDriver driver;

    public AboutPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locate Elements on webpage
    // private By CoverageStudy = By.cssSelector(".ast-custom-button']");

    private By ApplyHere = By.cssSelector("a[role='button']");
    //private By ClickAbout = By.cssSelector("ul[aria-expanded='false'] li[class='menu-item menu-item-type-post_type menu-item-object-page menu-item-726'] a[class='menu-link']");
    private By Service1 = By.cssSelector("li[id='menu-item-725'] a[class='menu-link']");


    //Input Action on the Element
    //public void StudyCoverage() {driver.findElement(CoverageStudy).click();}
    public void ApplyHere1() {
        driver.findElement(ApplyHere).click();}
   // public void ClickAbout1(){ driver.findElement(ClickAbout).click();}


   /* public void ClickTitle() {driver.findElement(Title).click();}
    public void ClickFirstName() {driver.findElement(FirstName).sendKeys("John");}
    public void ClickMiddleName() { driver.findElement(MiddleName).sendKeys("Chinelo");}
    public void ClickLast() {driver.findElement(lastName).sendKeys("Nonso");}
    public void ClickEmaqil() {driver.findElement(Email).sendKeys("tinap@gmail.com");}
    public void ClickPhone() { driver.findElement(Phoneno).sendKeys("07058945789");}
    public void ClickAddress() {driver.findElement(StreetAdrress).sendKeys("No 8 glover street");}
    public void Suiteappartment() {driver.findElement(ApartmentSuite).sendKeys("One Ensuite");}
    public void ClickCity() {driver.findElement(City).sendKeys("Lagos");}
    public void ClzickState() {driver.findElement(State).sendKeys("Lagos");}
    public void CodeZip() {driver.findElement(ZipCode).sendKeys("LG202034");}
    public void ClickCountrylist() {driver.findElement(SelectCountry).click();}
    public void ClickCountryoption() {driver.findElement(CountryList).click();}
    public void clickDegree() {driver.findElement(Degree).click();}
    public void prefferedCourses() {driver.findElement(PreferredCourse).sendKeys("Biology");}
    public void ClickText(){driver.findElement(Text).sendKeys("I would like to enquire on new course");}
    public void Meassgaes(){driver.findElement(sendMessage).sendKeys("let see what happens from here");}*/

    //returnPage
    public ServicePage clickService() { driver.findElement(Service1).click();
        return new ServicePage(driver);



    }

}


