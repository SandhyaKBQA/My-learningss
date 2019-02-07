package MyLearningTs;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonutilities.Utility;
import MypackagePO.BaseTest;
import MypackagePO.OdSLAPO;

public class OdSLATC extends BaseTest {

	public OdSLAPO OdSLAPo;
	public OdSLATC OdSLATc; 
	public OnedirectLoginTc OnedirectLoginTC;
	public Utility UtilitY;

	public OdSLATC() {}
	public OdSLATC(WebDriver driver) {
		this.driver=driver;
	}

	
	//Creation of SLA
	
	@Test
	public void ClickonSLAtab()throws Exception{
		this.OdSLAPo=new OdSLAPO(driver);
		this.OnedirectLoginTC=new OnedirectLoginTc(driver);
		OnedirectLoginTC.VerifySettingFunctionality();
		this.UtilitY=new Utility(driver);

		String url="https://testing.onedirect.in/brandfull#/settingsSlaTab";


		Assert.assertEquals(OdSLAPo.ClickonSLAtab(url),true,"!Oops not able navigate to sla window");
		Thread.sleep(5000);

		Assert.assertEquals(UtilitY.Clickaction(OdSLAPo.Createslabtn_xpath),true,"!Oops not able to click on Create SLA Button");

		Assert.assertEquals(UtilitY.Sendingstrings(OdSLAPo.Slaname_xpath,"Facebook"),true,"!Oops not able to enter the SLA name");

		Assert.assertEquals(UtilitY.Clickaction(OdSLAPo.Sourcedropdownexpand_xpath),true,"!Oops not able to click on source drop-down");

		List<String>list=new ArrayList<String>();
		list.add("Select any source");
		list.add("Facebook");
		list.add("Twitter");
		list.add("Email");
		list.add("Playstore");
		list.add("Others");
		list.add("Instagram");

		Assert.assertEquals(UtilitY.VerifyDropdownoptions(OdSLAPo.Sourcevalues_xpath),list,"!Oops Values are not matching");

		Assert.assertEquals(UtilitY.SelectanOptionindropdownMouseoveraction(OdSLAPo.Sourceoptions_xpath,"Facebook"),true,"!Oops not able to select the option from the drop-down");

		Assert.assertEquals(UtilitY.Clickaction(OdSLAPo.Targetsduringdd_xpath),true,"!Oops not able to click on Target During drop-down");

		List<String>list1=new ArrayList<String>();
		list1.add("Select SLA Type");
		list1.add("Business Hours");
		list1.add("Calendar Hours");

		Assert.assertEquals(UtilitY.VerifyDropdownoptions(OdSLAPo.Targetsduringddvalues_xpath),list1,"!Oops values are not matching");

		Assert.assertEquals(UtilitY.SelectanOptionindropdownMouseoveraction(OdSLAPo.Tddoptions_xpath, "Calendar Hours"),true,"!Oops not able to select the option from the drop-down" );

		Assert.assertEquals(UtilitY.Sendingstrings(OdSLAPo.Respondwithin_xpath,"2"),true,"!Oops not able to enter the value");


		Assert.assertEquals(UtilitY.Clickaction(OdSLAPo.Responddd_xpath),true,"!Oops not able to click on Drop-down");

		List<String>list2=new ArrayList<String>();
		list2.add("Days");
		list2.add("Hours");
		list2.add("Mins");
		
		
		Assert.assertEquals(UtilitY.VerifyDropdownoptions(OdSLAPo.Respondddvalues_xpath),list2,"!Oops values are not matching");

		Assert.assertEquals(UtilitY.SelectanOptionindropdownMouseoveraction(OdSLAPo.Respondddoptions_xpath, "Mins"),true,"!Oops not able to select the option from the Drop-down");

		Assert.assertEquals(UtilitY.Sendingstrings(OdSLAPo.Resolvewithin_xpath,"5"),true,"Oops not able to enter the value");

		Assert.assertEquals(UtilitY.Clickaction(OdSLAPo.Resolveexpand_xpath),true,"!Oops not able to click on Drop-down");

		List<String>list3=new ArrayList<String>();
		list3.add("Days");
		list3.add("Hours");
		list3.add("Mins");
		
		Assert.assertEquals(UtilitY.VerifyDropdownoptions(OdSLAPo.Resolvevalues_xpath),list3,"!Oops values are not matching");
		
		
		Assert.assertEquals(UtilitY.SelectanOptionindropdownMouseoveraction(OdSLAPo.Resolveoptions_xpath,"Hours"),true,"!Oops not able to select the option from the drop-down");

        Assert.assertEquals(UtilitY.Clickaction(OdSLAPo.Escalationemail_xpath),true,"!Oops not able to enable the Escalationmail");

        Assert.assertEquals(UtilitY.Clickaction(OdSLAPo.Savebtn_xpath),true,"!Oops not able to click on Save button");
	}
	
	
       //Edit the SLA
        @Test
    	public void EditSLA()throws Exception{
    		this.OdSLAPo=new OdSLAPO(driver);
    		this.OnedirectLoginTC=new OnedirectLoginTc(driver);
    		OnedirectLoginTC.VerifySettingFunctionality();
    		this.UtilitY=new Utility(driver);

    		String url="https://testing.onedirect.in/brandfull#/settingsSlaTab";


    		Assert.assertEquals(OdSLAPo.ClickonSLAtab(url),true,"!Oops not able navigate to sla window");
    		Thread.sleep(5000);
        
    		Assert.assertEquals(UtilitY.Clickaction(OdSLAPo.Editsla_xpath),true,"!Oops not able to click on Edit icon");
    		
    		Assert.assertEquals(UtilitY.Clickaction(OdSLAPo.Sourcedropdownexpand_xpath),true,"!Oops not able to click on source drop-down");
    		
    		Assert.assertEquals(UtilitY.SelectanOptionindropdownMouseoveraction(OdSLAPo.Sourceoptions_xpath,"Twitter"),true,"!Oops not able to select the option from the drop-down");

            Assert.assertEquals(UtilitY.Clickaction(OdSLAPo.Savebtn_xpath),true,"!Oops not able to click on Save button");
	}

        
        
      //Delete the SLA
        @Test
    	public void DeleteSLA()throws Exception{
    		this.OdSLAPo=new OdSLAPO(driver);
    		this.OnedirectLoginTC=new OnedirectLoginTc(driver);
    		OnedirectLoginTC.VerifySettingFunctionality();
    		this.UtilitY=new Utility(driver);

    		String url="https://testing.onedirect.in/brandfull#/settingsSlaTab";


    		Assert.assertEquals(OdSLAPo.ClickonSLAtab(url),true,"!Oops not able navigate to sla window");
    		Thread.sleep(5000);
        
    		Assert.assertEquals(UtilitY.Clickaction(OdSLAPo.Deletesla_xpath),true,"!Oops not able to click on Delete icon");
    		
            Assert.assertEquals(UtilitY.Clickaction(OdSLAPo.Yesbtn_xpath),true,"!Oops not able to click on Yes button");
	}

        
        
        
        
        
        
        
        
        
}
