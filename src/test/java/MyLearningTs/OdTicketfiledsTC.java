package MyLearningTs;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import MypackagePO.BaseTest;
import MypackagePO.OdTicketfiledsPO;

public class OdTicketfiledsTC extends BaseTest {
	public OdTicketfiledsPO OdTicketfiledsPo;
	public OdTicketfiledsTC OdTicketfiledsTc;
	public OnedirectLoginTc OnedirectLoginTC;

	public OdTicketfiledsTC() {}
	public OdTicketfiledsTC(WebDriver driver) {this.driver=driver;}

	
	//Single line text, paragraph and Date ticket fields:
	@Test
	public void Verifyticketfiledcreation()throws Exception {
		this.OdTicketfiledsPo=new OdTicketfiledsPO(driver);
		this.OnedirectLoginTC=new OnedirectLoginTc(driver);
		OnedirectLoginTC.VerifySettingFunctionality();

		//Verify ticket filed tab clickable
		Assert.assertEquals(OdTicketfiledsPo.Clickonticketfiledtab(),true,"!Oops not able to click on Ticket filed tab");

		Assert.assertEquals(OdTicketfiledsPo.Clickaddticketbtn(),true,"!Oops not able to click on Add ticket filed button");

		Assert.assertEquals(OdTicketfiledsPo.Fieldtypedropdownexpandable(),true,"!Oops not able to expand the Filed type drop-down");

		Assert.assertEquals(OdTicketfiledsPo.Selectfiledtype("Paragraph"),true,"!Oops not able to select the option from Filed type drop-down");

		Assert.assertEquals(OdTicketfiledsPo.Filedtitle("Test1"),true,"!Oops not able to enter the filed title");
	
	    Assert.assertEquals(OdTicketfiledsPo.VerifyNoneditablecheckbox(),true,"!Oops not able to check the non editable check box");
	
	
		Assert.assertEquals(OdTicketfiledsPo.Descriptionfiled("Ticket filed"),true,"!Oops not able to enter the text into Description filed");
		
		List<String> Expectedoptions=new ArrayList<String>();
		Expectedoptions.add("Closing Ticket");
		Expectedoptions.add("Resolving Ticket");
		for(int i=0;i<Expectedoptions.size();i++) {
			Assert.assertEquals(OdTicketfiledsPo.Requiredcheckbox(Expectedoptions.get(i)), true,"!Oops not able to check the check box");
		}
			//Assert.assertEquals(OdTicketfiledsPo.Requiredcheckbox("Resolving Ticket"), true,"!Oops not able to check the check box");

		Assert.assertEquals(OdTicketfiledsPo.Savebtn(),true,"!Oops not able to click on Save button");

	}
	
	//Drop down filed creation
	
	@Test
	public void VerifyDropdowncreation()throws Exception {
		this.OdTicketfiledsPo=new OdTicketfiledsPO(driver);
		this.OnedirectLoginTC=new OnedirectLoginTc(driver);
		OnedirectLoginTC.VerifySettingFunctionality();

		//Verify ticket filed tab clickable
		Assert.assertEquals(OdTicketfiledsPo.Clickonticketfiledtab(),true,"!Oops not able to click on Ticket filed tab");

		Assert.assertEquals(OdTicketfiledsPo.Clickaddticketbtn(),true,"!Oops not able to click on Add ticket filed button");

		Assert.assertEquals(OdTicketfiledsPo.Fieldtypedropdownexpandable(),true,"!Oops not able to expand the Filed type drop-down");

		Assert.assertEquals(OdTicketfiledsPo.Selectfiledtype("Dropdown"),true,"!Oops not able to select the option from Filed type drop-down");

		Assert.assertEquals(OdTicketfiledsPo.Filedtitle("DD1"),true,"!Oops not able to enter the filed title");
	
	
		Assert.assertEquals(OdTicketfiledsPo.Descriptionfiled("Ticket filed"),true,"!Oops not able to enter the text into Description filed");
		
		List<String> Expectedoptions=new ArrayList<String>();
		Expectedoptions.add("Closing Ticket");
		Expectedoptions.add("Resolving Ticket");
		for(int i=0;i<Expectedoptions.size();i++) {
			Assert.assertEquals(OdTicketfiledsPo.Requiredcheckbox(Expectedoptions.get(i)), true,"!Oops not able to check the check box");
		}
			//Assert.assertEquals(OdTicketfiledsPo.Requiredcheckbox("Resolving Ticket"), true,"!Oops not able to check the check box");
		
		Assert.assertEquals(OdTicketfiledsPo.DropdownOption1("Filed1"),true,"!Oops not able to enter the First value");
		
		Assert.assertEquals(OdTicketfiledsPo.Plusicon(),true,"!Oops not able to click on plus icon");
		Assert.assertEquals(OdTicketfiledsPo.Plusicon(),true,"!Oops not able to click on plus icon");
		
		Assert.assertEquals(OdTicketfiledsPo.DropdownOption2("Filed2"),true,"!Oops not able to enter the Second value");
		
		Assert.assertEquals(OdTicketfiledsPo.DropdownOption3("Filed3"),true,"!Oops not able to enter the Third value");


		Assert.assertEquals(OdTicketfiledsPo.Savebtn(),true,"!Oops not able to click on Save button");

	}
	
	
	//Dependent Drop down filed creation
	
	@Test
	public void VerifyDependentDropdowncreation()throws Exception {
		this.OdTicketfiledsPo=new OdTicketfiledsPO(driver);
		this.OnedirectLoginTC=new OnedirectLoginTc(driver);
		OnedirectLoginTC.VerifySettingFunctionality();

		//Verify ticket filed tab clickable
		Assert.assertEquals(OdTicketfiledsPo.Clickonticketfiledtab(),true,"!Oops not able to click on Ticket filed tab");

		Assert.assertEquals(OdTicketfiledsPo.Clickaddticketbtn(),true,"!Oops not able to click on Add ticket filed button");

		Assert.assertEquals(OdTicketfiledsPo.Fieldtypedropdownexpandable(),true,"!Oops not able to expand the Filed type drop-down");

		Assert.assertEquals(OdTicketfiledsPo.Selectfiledtype("Dependent Dropdown"),true,"!Oops not able to select the option from Filed type drop-down");

		Assert.assertEquals(OdTicketfiledsPo.Filedtitle("DD"),true,"!Oops not able to enter the filed title");
	
	
		Assert.assertEquals(OdTicketfiledsPo.Descriptionfiled("Ticket filed"),true,"!Oops not able to enter the text into Description filed");
		
		List<String> Expectedoptions=new ArrayList<String>();
		Expectedoptions.add("Closing Ticket");
		Expectedoptions.add("Resolving Ticket");
		for(int i=0;i<Expectedoptions.size();i++) {
			Assert.assertEquals(OdTicketfiledsPo.Requiredcheckbox(Expectedoptions.get(i)), true,"!Oops not able to check the check box");
		}		
		Assert.assertEquals(OdTicketfiledsPo.Choosefile(),true,"!Oops not able to select the file");

		Assert.assertEquals(OdTicketfiledsPo.Savebtn(),true,"!Oops not able to click on Save button");

	}
	
	//Verify Regex field creation
	
	@Test
	public void VerifyRegExcreation()throws Exception {
		this.OdTicketfiledsPo=new OdTicketfiledsPO(driver);
		this.OnedirectLoginTC=new OnedirectLoginTc(driver);
		OnedirectLoginTC.VerifySettingFunctionality();

		//Verify ticket filed tab clickable
		Assert.assertEquals(OdTicketfiledsPo.Clickonticketfiledtab(),true,"!Oops not able to click on Ticket filed tab");

		Assert.assertEquals(OdTicketfiledsPo.Clickaddticketbtn(),true,"!Oops not able to click on Add ticket filed button");

		Assert.assertEquals(OdTicketfiledsPo.Fieldtypedropdownexpandable(),true,"!Oops not able to expand the Filed type drop-down");

		Assert.assertEquals(OdTicketfiledsPo.Selectfiledtype("RegEx"),true,"!Oops not able to select the option from Filed type drop-down");

		Assert.assertEquals(OdTicketfiledsPo.Filedtitle("Regex1"),true,"!Oops not able to enter the filed title");
	
	
		Assert.assertEquals(OdTicketfiledsPo.Descriptionfiled("Ticket filed"),true,"!Oops not able to enter the text into Description filed");
		
		List<String> Expectedoptions=new ArrayList<String>();
		Expectedoptions.add("Closing Ticket");
		Expectedoptions.add("Resolving Ticket");
		for(int i=0;i<Expectedoptions.size();i++) {
			Assert.assertEquals(OdTicketfiledsPo.Requiredcheckbox(Expectedoptions.get(i)), true,"!Oops not able to check the check box");
		}		
		Assert.assertEquals(OdTicketfiledsPo.Expressiontextfield("123"),true,"!Oops not able to enter the text into Expression filed");

		Assert.assertEquals(OdTicketfiledsPo.Errortextfield("Numbers only"),true,"!Oops not able to enter  text into error Text filed");
		
		Assert.assertEquals(OdTicketfiledsPo.Savebtn(),true,"!Oops not able to click on Save button");

	}
	
	
	
	//Verify updation
	
	@Test
	public void VerifyticketfiledUpdation()throws Exception {
		this.OdTicketfiledsPo=new OdTicketfiledsPO(driver);
		this.OnedirectLoginTC=new OnedirectLoginTc(driver);
		OnedirectLoginTC.VerifySettingFunctionality();
		
		
		
		Assert.assertEquals(OdTicketfiledsPo.Clickonticketfiledtab(),true,"!Oops not able to click on Ticket filed tab");

		//Verify the Edit functionality of the ticket filed
		Assert.assertEquals(OdTicketfiledsPo.Editicon(),true,"!Oops not able to click on Edit Icon");
		
	    Assert.assertEquals(OdTicketfiledsPo.VerifyNoneditablecheckbox(),true,"!Oops not able to check the non editable check box");

		
		Assert.assertEquals(OdTicketfiledsPo.Savebtn(),true,"!Oops not able to click on Save button");

	
	}

	
	@Test
	public void VerifyticketfiledDeletion()throws Exception{
		this.OdTicketfiledsPo=new OdTicketfiledsPO(driver);
		this.OnedirectLoginTC=new OnedirectLoginTc(driver);
		OnedirectLoginTC.VerifySettingFunctionality();
		
		
		Assert.assertEquals(OdTicketfiledsPo.Clickonticketfiledtab(),true,"!Oops not able to click on Ticket filed tab");

		Assert.assertEquals(OdTicketfiledsPo.Deleteicon(),true,"!Oops not able to click on Delete icon");
		Assert.assertEquals(OdTicketfiledsPo.Yesbutton(),true,"!Oops not able to click on Yes button");
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

