package MyLearningTs;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import MypackagePO.BaseTest;
import MypackagePO.CalendarPo;

public class CalendarTc extends BaseTest{ 


	public CalendarTc CalendarTC;
	public CalendarPo CalendarPO;
	public CalendarTc(){}
	public CalendarTc(WebDriver driver){
		this.driver=driver;
	}
	
	@Test
	public void VerifyOnwarddateFunctionality() throws Exception{
		
		this.CalendarPO=new CalendarPo(driver);
		Assert.assertEquals(CalendarPO.ClickonCalendarPicker(),true, "OnwardDate not able to clickable");
		Assert.assertEquals(CalendarPO.SelectDate("20"),true,"!Oops not able to slect ade");
		
		
	}

}
