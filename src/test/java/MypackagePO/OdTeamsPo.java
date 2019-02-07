package MypackagePO;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OdTeamsPo {

	By Teams_xapth=By.xpath("//div[@class='mat-list-item-content']//h3[.=' Teams ']");
	By AddnewTeambutton_xpath=By.xpath("//button[.=' + Add New Team']");
	By TeamName_xpath=By.xpath("//div[@class='form-field']//input[@placeholder='Enter team name']");
	By Description_xpath=By.xpath("//div[@class='form-field']//textarea[@name='description']");
	By Supervisordrop_xpath=By.xpath("(//div[@class='m-box']//i[@class='icon-arrow-down'])[1]");
	By supervisorelist_xpath=By.xpath("//label[@class='od-checkbox-label']");
	By Agentsdrop_xpath=By.xpath("(//div[@class='m-box']//i[@class='icon-arrow-down'])[2]");
	By Agentslist_xpath=By.xpath("//div[@class='suggestions-holder expanded']//ul[@class='m-suggestions']//label[@class='od-checkbox-label']");
	By Noneradiobutton_xpath=By.xpath("//md-radio-button[@id='md-radio-1']//div[@class='mat-radio-container']");
	By RoundRobinbutton_xpath=By.xpath("//md-radio-button[@id='md-radio-2']//div[@class='mat-radio-container']");
	By LoadBalencebutton_xpath=By.xpath("//md-radio-button[@id='md-radio-3']//div[@class='mat-radio-container']");
	By Businesshourdrop_xpath=By.xpath("//div[@class='chooser-box']//i[@class='icon-arrow-down']");
	By Businesshourlist_xpath=By.xpath("//ul[@class='chooser-suggestions up']//li");
	By SingleBusinesshr_xpath=By.xpath("//span[.='t2smfbs']");
	By Savebutton_xpaath=By.xpath("//button[.='Save']");
	By Cancelbutton_xpaath=By.xpath("//button[.='Cancel']");
	By Seachfield_xpath=By.xpath("//div[@class='search-box']//input[@name='searchInput']");
	By Editicon_xpath=By.cssSelector("i[class=icon-edit]");
	By Deleteicon_xpath=By.cssSelector("//i[@class='icon-delete']");
	By Deletebutton_xpath=By.xpath("//button[.='Delete']");
	By Yesbutton_xpath=By.xpath("//button[text()=' Yes ']");


	public WebDriver driver;
	public OdTeamsPo(WebDriver driver) {
		this.driver=driver;
	}

	//POM: Verify Teams button clickable
	public boolean Teamsbuttonclickable() throws Exception
	{

		try {
			Thread.sleep(5000);
			WebElement Teams_webl=(new WebDriverWait(driver,60)).until(ExpectedConditions.visibilityOfElementLocated(Teams_xapth));
			Teams_webl.click();;
			return true;
		}
		catch(Exception ex){
			return false;
		}

	}
	//POM: Verify Add new Teams button clickable
	public boolean AddnewTeamsbuttonclickable() throws Exception
	{

		try {
			Thread.sleep(5000);
			WebElement AddnewTeambutton_webl=(new WebDriverWait(driver,60)).until(ExpectedConditions.visibilityOfElementLocated(AddnewTeambutton_xpath));
			AddnewTeambutton_webl.click();
			return true;
		}
		catch(Exception ex){
			return false;
		}

	}



	//POM:Verify Team name text field
	public boolean EnterTeamname(String Teamname) throws Exception
	{

		try {
			Thread.sleep(5000);
			WebElement TeamName_webl=(new WebDriverWait(driver,60)).until(ExpectedConditions.visibilityOfElementLocated(TeamName_xpath));
			TeamName_webl.sendKeys(Teamname);
			return true;
		}
		catch(Exception ex){
			return false;
		}

	}

	//POM: Verify Description text area filed.
	public boolean EnterDescription(String Description) throws Exception
	{

		try {
			Thread.sleep(5000);
			WebElement Description_webl=(new WebDriverWait(driver,60)).until(ExpectedConditions.visibilityOfElementLocated(Description_xpath));
			Description_webl.sendKeys(Description);
			return true;
		}
		catch(Exception ex){
			return false;
		}

	}

	//POM: Verify Supervisor drop down clickable.
	public boolean Supervisordropdownclickable() throws Exception
	{

		try {

			WebElement Supervisordrop_webl=(new WebDriverWait(driver,60)).until(ExpectedConditions.visibilityOfElementLocated(Supervisordrop_xpath));
			Supervisordrop_webl.click();
			return true;
		}
		catch(Exception ex){
			return false;
		}

	}
	//POM: Select single users from supervisor drop-down
	public boolean Selectsupervisors(String option)throws Exception{
		try	{Thread.sleep(5000);
		List<WebElement> List_WebL=driver.findElements(supervisorelist_xpath);
		for(WebElement ElementWebl:List_WebL){
			String value=ElementWebl.getText().trim();
			System.out.println("All the supervisors are "+value);
			if(value.equalsIgnoreCase(option)){
				System.out.println("Selected option is "+value);
				ElementWebl.click();
				return true;
			}
			Thread.sleep(5000);
		}
		return false;
		}
		catch(Exception ex){
			return false;
		}

	}

	//POM: Select more users from supervisor drop-down
	public boolean Moresupervisors(String option)throws Exception{
		try	{Thread.sleep(5000);
		List<WebElement> List_WebL=driver.findElements(supervisorelist_xpath);
		for(WebElement ElementWebl:List_WebL){
			String value=ElementWebl.getText().trim();
			System.out.println("All the supervisors are "+value);
			if(value.equalsIgnoreCase(option)){
				System.out.println("Selected option is "+value);
				ElementWebl.click();
				return true;
			}
			Thread.sleep(5000);
		}
		return false;
		}
		catch(Exception ex){
			return false;
		}

	}

	//POM:verify the agent drop down clickable
	public boolean Agentdropdownclickable()throws Exception{
		try {
			Thread.sleep(5000);
			WebElement Agentsdrop_webl=(new WebDriverWait(driver, 60)).until(ExpectedConditions.visibilityOfElementLocated(Agentsdrop_xpath));
			Agentsdrop_webl.click();
			return true;
		}
		catch(Exception ex) {
			return false;
		}
	}

	//POM: select one user from agent drop down
	public boolean Selectagentdropdown(String agents)throws Exception{
		try {
			List<WebElement> List_WebL=driver.findElements(Agentslist_xpath);
			for(WebElement ElementWebl1:List_WebL){
				String value=ElementWebl1.getText().trim();
				System.out.println("all agents are "+value);
				if(value.equalsIgnoreCase(agents)){
					System.out.println("Selected option is "+value);
					ElementWebl1.click();
					return true;
				}
			}
			return false;
		}
		catch (Exception e) {
			return false;
		}
	}

	//POM: Select more users from agent drop down
	public boolean MoreAgents(String option)throws Exception{
		try	{Thread.sleep(5000);
		List<WebElement> List_WebL=driver.findElements(Agentslist_xpath);
		for(WebElement ElementWebl:List_WebL){
			String value=ElementWebl.getText().trim();
			System.out.println("All the agents are "+value);
			if(value.equalsIgnoreCase(option)){
				System.out.println("Selected option is "+value);
				ElementWebl.click();
				return true;
			}
			Thread.sleep(5000);
		}
		return false;
		}
		catch(Exception ex){
			return false;
		}

	}

	//POM:verify Round robin radio button clickable
	public boolean Roundrobinclickable()throws Exception{
		try {
			Thread.sleep(5000);
			WebElement RoundRobinbutton_webl=(new WebDriverWait(driver, 60)).until(ExpectedConditions.visibilityOfElementLocated(RoundRobinbutton_xpath));
			RoundRobinbutton_webl.click();
			return true;
		}
		catch(Exception ex) {
			return false;
		}
	}	


	//POM:verify Load balencer radio button clickable
	public boolean Loadbalenceclickable()throws Exception{
		try {
			Thread.sleep(5000);
			WebElement LoadBalencebutton_webl=(new WebDriverWait(driver, 60)).until(ExpectedConditions.visibilityOfElementLocated(LoadBalencebutton_xpath));
			LoadBalencebutton_webl.click();
			return true;
		}
		catch(Exception ex) {
			return false;
		}
	}

	//POM:verify Business hour drop down expandable
	public boolean Businesshrdrop()throws Exception{
		try {
			Thread.sleep(5000);
			WebElement Businesshourdrop_webl=(new WebDriverWait(driver, 60)).until(ExpectedConditions.visibilityOfElementLocated(Businesshourdrop_xpath));
			Businesshourdrop_webl.click();
			return true;
		}
		catch(Exception ex) {
			return false;
		}
	}

	//POM: Select any one business hour from Business hour drop-down
	public boolean SelectBusinesshr(String Hour)throws Exception{
		try	{Thread.sleep(5000);
		List<WebElement> List_WebL=driver.findElements(Businesshourlist_xpath);
		for(WebElement ElementWebl:List_WebL){
			String value=ElementWebl.getText().trim();
			System.out.println("All the Business hour are "+value);
			if(value.equalsIgnoreCase(Hour)){
				System.out.println("Selected Hour is "+value);
				ElementWebl.click();
				return true;
			}
			Thread.sleep(5000);
		}
		return false;
		}
		catch(Exception ex){
			return false;
		}

	}

	//POM:verify Single business hour option  clickable
	public boolean SingleBHclickable()throws Exception{
		try {
			Thread.sleep(5000);
			WebElement SingleBusinesshr_webl=(new WebDriverWait(driver, 60)).until(ExpectedConditions.visibilityOfElementLocated(SingleBusinesshr_xpath));
			SingleBusinesshr_webl.click();
			Thread.sleep(5000);
			return true;

		}
		catch(Exception ex) {
			return false;
		}
	}


	//POM:verify Save button clickable
	public boolean Savebuttonclickable()throws Exception{
		try {
			Thread.sleep(5000);
			WebElement Savebutton_webl=(new WebDriverWait(driver, 60)).until(ExpectedConditions.visibilityOfElementLocated(Savebutton_xpaath));
			Savebutton_webl.click();
			Thread.sleep(5000);
			return true;

		}
		catch(Exception ex) {
			return false;
		}
	}
	//POM:verify Cancel button clickable
	public boolean Cancelbuttonclickable()throws Exception{
		try {
			Thread.sleep(5000);
			WebElement Cancelbutton_webl=(new WebDriverWait(driver, 60)).until(ExpectedConditions.visibilityOfElementLocated(Cancelbutton_xpaath));
			Cancelbutton_webl.click();
			return true;

		}
		catch(Exception ex) {
			return false;
		}

	}

	//POM:Verify Search text field
	public boolean Serchteam(String Teamname) throws Exception
	{

		try {
			Thread.sleep(5000);
			WebElement Seachfield_webl=(new WebDriverWait(driver,60)).until(ExpectedConditions.visibilityOfElementLocated(Seachfield_xpath));
			Seachfield_webl.sendKeys(Teamname);
			return true;
		}
		catch(Exception ex){
			return false;
		}

	}
	//POM:verify edit icon button clickable
	public boolean Editiconclickable()throws Exception{
		try {
			Thread.sleep(5000);
			WebElement Editicon_webl= driver.findElement(Editicon_xpath);
			Actions builder=new Actions(driver);
			builder.moveToElement(Editicon_webl).build().perform();
			driver.findElement(Editicon_xpath).click();
			return true;

		}
		catch(Exception ex) {
			return false;
		}

	}

	//POM:verify delete icon button clickable
	public boolean Deleteiconclickable()throws Exception{
		try {
			Thread.sleep(5000);
			WebElement Deleteicon_webl= driver.findElement(Deleteicon_xpath);
			Actions builder=new Actions(driver);
			builder.moveToElement(Deleteicon_webl).build().perform();
			driver.findElement(Deleteicon_xpath).click();
			return true;

		}
		catch(Exception ex) {
			return false;
		}

	}

	//POM:verify Delete button clickable
	public boolean Deletebuttonclickable()throws Exception{
		try {
			Thread.sleep(5000);
			WebElement Deletebutton_webl=(new WebDriverWait(driver, 60)).until(ExpectedConditions.visibilityOfElementLocated(Deletebutton_xpath));
			Deletebutton_webl.click();
			return true;

		}
		catch(Exception ex) {
			return false;
		}

	}

	//POM:verify yes button clickable
	public boolean Yesbuttonclickable()throws Exception{
		try {
			Thread.sleep(5000);
			WebElement Yesbutton_webl=(new WebDriverWait(driver, 60)).until(ExpectedConditions.visibilityOfElementLocated(Yesbutton_xpath));
			Yesbutton_webl.click();
			return true;

		}
		catch(Exception ex) {
			return false;
		}

	}


}
