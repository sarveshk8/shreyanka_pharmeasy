package test_Scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;

public class TestScript1 extends Base_Test{
	
WebDriver driver;
	
	@BeforeTest
	public void browser() {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
	}
	
	@Test(priority = 1)
	public void Pharma() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://pharmeasy.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[text()='Surgeries'])[2]")).click();
	}
	
	@Test(priority = 2)
	public void selectLocation() throws InterruptedException {
		driver.findElement(By.xpath("(//a/span[text()='SELECT CITY'])[3]")).click();
		driver.findElement(By.xpath("//div/span[text()='Bangalore']")).click();
		Thread.sleep(1000);		
	}
	
	@Test(priority = 4)
	public void selectSurgery() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"app\"]/section[1]/div/div[2]/div[1]/div[1]/a[6]")).click();
		driver.findElement(By.xpath("//button[@id='banner']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority = 5)
	public void bookAppointment() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Monika");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("7829156159");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='submitFormBtn']")).click();
	}
	
	
	@DataProvider(name="testdata")
	public Object[][] getTestData() throws IOException {
		Object[][] testdata = ReadExcel.getMultipleData("Sheet1");
		return testdata;
			
	}
	
	@AfterTest
	public void exit() {
		driver.quit();
	}
}

