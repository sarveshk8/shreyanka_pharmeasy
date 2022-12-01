package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SurgeriesSearchMultiple extends BasePage {
	
	public SurgeriesSearchMultiple(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy (xpath="(//a[text()='Surgeries'])[2]")
	WebElement Surgeries;
	public void Click_Surgeries() {
		clickAction(Surgeries);
	}
	
	@FindBy(xpath="a/span[text()='SELECT CITY'])[3]")
	WebElement Selectcitytf;
	public void Click_Selectcitytf() {
		clickAction(Selectcitytf);
	}
	
	@FindBy(xpath="//div/span[text()='Bangalore']")
	WebElement Bangaloretf;
	public void Click_Bangaloretf() {
		clickAction(Bangaloretf);
	}
	
	@FindBy(xpath="//*[@id=\"app\"]/section[1]/div/div[2]/div[1]/div[1]/a[6]")
	WebElement Varicoceletf;
	public void Click_Varicoceletf() {
		clickAction(Varicoceletf);
	}
	
	@FindBy(xpath="//button[@id='banner']")
	WebElement Bookafreeconsultationtf;
	public void Click_Bookafreeconsultationtf() {
		clickAction(Bookafreeconsultationtf);
	}
	
	@FindBy (xpath="//input[@name='FirstName']")
	WebElement EnterName;
	public void EnterName(String enter_name) {
		enter_value(EnterName, enter_name);
	}
	
	@FindBy (xpath="//input[@placeholder='Phone Number']")
	WebElement 	Entervalue;
	public void Entervalue(String enter_number) {
		enter_value(Entervalue,enter_number);
	}
	
	@FindBy (xpath="//button[@id='submitFormBtn']")
	WebElement 	Submittf;
	public void Click_Submittf() {
		clickAction(Submittf);
	}
	

}
