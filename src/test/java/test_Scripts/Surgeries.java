package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.SurgeriesSearchMultiple;

public class Surgeries extends Base_Test {
	
	@Test(dataProvider="testdata")
	public void Testcall(String entername,String enternumber) {
		SurgeriesSearchMultiple surgeries=new SurgeriesSearchMultiple(driver);
		
		surgeries.Click_Surgeries();
		
		surgeries.Click_Selectcitytf();
		
		surgeries.Click_Bangaloretf();
		
		surgeries.Click_Varicoceletf();
		
		surgeries.Click_Bookafreeconsultationtf();
		
		surgeries.EnterName(entername);
		
		surgeries.Entervalue(enternumber);
		
		surgeries.Click_Submittf();
	}
	
	@DataProvider(name="testdata")
	public Object[][] getTestData() throws IOException {
		Object[][] testdata = ReadExcel.getMultipleData("Sheet1");
		return testdata;
			
	}
}
