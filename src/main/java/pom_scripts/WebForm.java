package pom_scripts;
	
	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.Assert;

import generic.ReadExcel;

import java.io.IOException;
import java.util.ArrayList;
	import java.util.concurrent.TimeUnit;


	public class WebForm extends Utils {
	    public WebDriver getDriver() {
	        return this.driver;
	    }
	    protected WebDriver driver;
	    public WebForm(WebDriver driver){
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void landingPage() throws InterruptedException {
	        driver.manage().window().maximize();
	        driver.get(BASE_URL);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        Thread.sleep(3000);
	        Assert.assertEquals(driver.getCurrentUrl(), BASE_URL );
	        System.out.println("---- Succesfully Landing to URL ----");
	        driver.navigate().refresh();
	    }


	    @FindBy(xpath ="(//a[text()='Surgeries'])[2]") private WebElement click_Surgeries;
	    @FindBy(xpath ="(//a/span[text()='SELECT CITY'])[3]") private WebElement click_SelectCity;
	    @FindBy(xpath ="//div/span[text()='Bangalore']") private WebElement select_City;
	    @FindBy(xpath ="//*[@id=\\\"app\\\"]/section[1]/div/div[2]/div[1]/div[1]/a[6]") private WebElement select_Surgery;
	    @FindBy(xpath ="//button[@id='banner']") private WebElement book_Appointment;
	    @FindBy(xpath ="//input[@name='FirstName']") private WebElement fullName;
	    @FindBy(xpath ="//input[@placeholder='Phone Number']") private WebElement phoneNumber;
	    @FindBy(xpath ="//button[@id='submitFormBtn']") private WebElement click_Submit;
	    
	    
	    public void selectSurgeries() throws InterruptedException {
	    	this.click_Surgeries.click();
			Thread.sleep(1000);
		}
	    
	    public void selectLocation() throws InterruptedException {
	    	Thread.sleep(1000);
			this.click_SelectCity.click();
			this.select_City.click();
			Thread.sleep(1000);		
		}
	    
	    public void selectSurgery() throws InterruptedException {
			this.select_Surgery.click();
			this.book_Appointment.click();
			Thread.sleep(1000);
		}
	    
	    public void bookAppointment() throws InterruptedException {
			this.fullName.sendKeys("Monika");
			Thread.sleep(1000);
			this.phoneNumber.sendKeys("7829156159");
			Thread.sleep(1000);
			this.click_Submit.click();
		}
	    
	    public Object[][] getTestData() throws IOException {
			Object[][] testdata = ReadExcel.getMultipleData("Sheet");
			return testdata;
				
		}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    	  
	    	    

}
