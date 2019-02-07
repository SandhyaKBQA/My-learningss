package MyLearningTs;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import MypackagePO.BaseTest;
import MypackagePO.OdBusinesshrPo;

public class OdBusinesshrTc extends BaseTest {
	public OnedirectLoginTc OnedirectLoginTC;
	public OdBusinesshrPo OdBusinesshrPO;
	public OdBusinesshrTc OdBusinesshrTC;

	public OdBusinesshrTc() {}
	public OdBusinesshrTc(WebDriver driver) {
		this.driver=driver;
	}

	@Test
	public void VerifyBusinesshourcreation()throws Exception{
		this.OdBusinesshrPO=new OdBusinesshrPo(driver);
		this.OnedirectLoginTC=new OnedirectLoginTc(driver);
		OnedirectLoginTC.VerifySettingFunctionality();

		//Verify Business hour button clickable
		Assert.assertEquals(OdBusinesshrPO.BusinessHourlinkclickable(),true,"!Oops not able to click on Business hour");

		//Verify Create new button clickable
		Assert.assertEquals(OdBusinesshrPO.CreateNewbuttonclickable(),true,"!Oops not able to click on Create new button");

		//Verify Name text filed
		String Name="Automation BH";
		Assert.assertEquals(OdBusinesshrPO.Namefiled(Name),true,"!Oops not able to Enter the text into Name filed");

		//Verify Description text area filed
		String Description="Testing BH";
		Assert.assertEquals(OdBusinesshrPO.Descriptionfiled(Description),true,"!Oops not able to Enter the text into Description filed");

		//Verify Timezone filed clickable
		Assert.assertEquals(OdBusinesshrPO.TImezonefiled(),true,"!Oops not able to click on Timezone ");

		//Verify 24*7 radio button selectable
		Assert.assertEquals(OdBusinesshrPO.FirstRadiobutton(),true,"!Oops not able to click on 24*7 radio button");

		//Verify Enter holiday name text filed
		String Holidayname="ABC";
		Assert.assertEquals(OdBusinesshrPO.Enterholiday(Holidayname),true,"!Oops not able to enter the holiday name");

		//Verify Select holiday date filed clickable
		Assert.assertEquals(OdBusinesshrPO.SelectHolidayDate(),true,"!Oops not able to click on holiday date filed");

		//Verify Next month arrow clickable
		Assert.assertEquals(OdBusinesshrPO.Nextmonth(),true,"!Oops not able click on next month arrow");

		//Verify Calendar date selectable
		String Date="1";
		Assert.assertEquals(OdBusinesshrPO.Calendardate(Date),true,"!Oops not able to select the dates from calendar");

		//Verify Add holiday button clickable
		Assert.assertEquals(OdBusinesshrPO.Addholiday(),true,"!Oops not able to click on Add Holiday button");

		//Verify Save button clickable
		Assert.assertEquals(OdBusinesshrPO.Savebuttonclickable(),true,"!Oops not able to click on Save button");

		//Verify the Toast message text
		//String Message="Business hour created successfully";
		//Assert.assertEquals(OdBusinesshrPO.Toastmsg(Message),true,"!Oops not able to display the Toast message");

	}

	@Test
	public void VerifyBusinesshourupdation()throws Exception{
		this.OdBusinesshrPO=new OdBusinesshrPo(driver);
		this.OnedirectLoginTC=new OnedirectLoginTc(driver);
		OnedirectLoginTC.VerifySettingFunctionality();

		//Verify Business hour button clickable
		Assert.assertEquals(OdBusinesshrPO.BusinessHourlinkclickable(),true,"!Oops not able to click on Business hour");

		//Verify Edit icon clickable
		Assert.assertEquals(OdBusinesshrPO.Editicon(),true,"!Oops not able to click on Edit icon");

		//Verify select hour radio button clickable 
		Assert.assertEquals(OdBusinesshrPO.SecondRadiobutton(),true,"!Oops not able to click on Select Hour radio button");

		//Verify Save button clickable
		Assert.assertEquals(OdBusinesshrPO.Savebuttonclickable(),true,"!Oops not able to click on Save button");

	}

	@Test
	public void VerifyBusinesshourDeletion()throws Exception{
		this.OdBusinesshrPO=new OdBusinesshrPo(driver);
		this.OnedirectLoginTC=new OnedirectLoginTc(driver);
		OnedirectLoginTC.VerifySettingFunctionality();

		//Verify Business hour button clickable
		Assert.assertEquals(OdBusinesshrPO.BusinessHourlinkclickable(),true,"!Oops not able to click on Business hour");


		//Verify Delete icon clickable
		Assert.assertEquals(OdBusinesshrPO.Deleteicon(),true,"!Oops not able to click on Delete icon");

		//Verify Delete button clickable
		Assert.assertEquals(OdBusinesshrPO.Deletebutton(),true,"!Oops not able to click on Delete Button");

	}
}
