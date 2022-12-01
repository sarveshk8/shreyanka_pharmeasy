package pom_scripts;

	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.Test;


	public class TestngTestPlan {
	    public static WebDriver driver;

	    @BeforeSuite
	    public void beforeTest() {
	    //	System.setProperty("webdriver.chrome.driver", "/Base_Framework_ELF/src/main/resources/Drivers/chromedriver.exe");
            System.setProperty("webdriver.chrome.driver",Utils.CHROME_DRIVER);
	        ChromeOptions options = new ChromeOptions();
	        driver = new ChromeDriver(options);
	    }
	    

	    @Test(testName = "Book Appointment", priority = 1)
	    public static void registration() throws InterruptedException {
	        WebForm webForm = new WebForm(driver);
	        webForm.landingPage();
	        webForm.selectSurgeries();
	        webForm.selectLocation();
	        webForm.selectSurgery();
	        webForm.bookAppointment();
	        Thread.sleep(2000);
	    }

	    @AfterSuite
	    public void cleanUp(){
	        driver.manage().deleteAllCookies();
	        driver.quit();
	    }

}
