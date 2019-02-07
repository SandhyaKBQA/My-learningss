package MyLearningTs;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import MypackagePO.BaseTest;
import MypackagePO.OdViewsPO;

public class OdviewsTC extends BaseTest {
	public OdViewsPO OdViewsPo;
	public OdviewsTC OdviewsTc;
	public OnedirectLoginTc OnedirectLoginTC;

	public OdviewsTC() {}
	public OdviewsTC(WebDriver driver) {
		this.driver=driver;
	}


	@Test
	public void ViewsCreation()throws Exception{
		this.OnedirectLoginTC=new OnedirectLoginTc(driver);
		OnedirectLoginTC.VerifySettingFunctionality();
		this.OdViewsPo=new OdViewsPO(driver);

		//Verify create new view button clickable
		Assert.assertEquals(OdViewsPo.CreatenewViewbutton(),true,"!Oops not able to click on create new view button");

		//Verify the name field
		String name="Automation view";
		Assert.assertEquals(OdViewsPo.Viewname(name),true,"!Oops not able to Enter the view name");

		//Verify the Description text area field
		String Description="Automation Description";
		Assert.assertEquals(OdViewsPo.Description(Description),true,"!Oops not able to Enter the view name");
		
		//Verify the status toggle button clickable
		Assert.assertEquals(OdViewsPo.ClickonstatusTogglebtn(),true,"!Oops not able to click on status toggle button");
		
		Assert.assertEquals(OdViewsPo.ClickonstatusTogglebutton("Active"),true,"!Oops not able to change the status");
		
		
		
		//Verify the first drop-down expandable 
		Assert.assertEquals(OdViewsPo.Firstdropdown(),true,"!Oops not able to expande the first dropdown");

		//Verify options selectable from the drop down
		Assert.assertEquals(OdViewsPo.Sourceoptionclick(),true,"!Oops not able to select the source option");
		Assert.assertEquals(OdViewsPo.Equaloptionclick(),true,"!Oops not able to select the equal option");

		Assert.assertEquals(OdViewsPo.Thirddropdown(),true,"!Oops not able to click on third drop down");
		Assert.assertEquals(OdViewsPo.Facebookalloptionclick(),true,"!Oops not able to select the facebookall option");

		//Verify Drag and functionality
		//String Source="Updated At";
		//Assert.assertEquals(OdViewsPo.DragandDropElement(Source),true,"!Oops not able to drag and the drop the element");

		Assert.assertEquals(OdViewsPo.Singledragdrop(),true,"!Oops not able to drag and the drop the element");

		Assert.assertEquals(OdViewsPo.Savebutton(),true,"!Oops not able to click on save button");
	}

}
