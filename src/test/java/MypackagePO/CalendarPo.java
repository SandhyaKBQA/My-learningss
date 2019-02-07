package MypackagePO;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarPo {
	public WebDriver driver;
	public CalendarPo(WebDriver driver){
		this.driver=driver;
	}
	By OnwardDate_xpath=By.xpath("//div[@class='clearfix search-wrap']//div[@class='fl search-box date-box gtm-onwardCalendar']");
	
	By OnwardDatesList_xpath=By.xpath("//div[@id='rb-calendar_onward_cal']//table[@class='rb-monthTable first last']//td");
	
	//POM: Click on Calendar Picker
	public boolean ClickonCalendarPicker()throws Exception{
		try{
			WebElement OnwardDate_webl=(new WebDriverWait(driver, 60))
					.until(ExpectedConditions.visibilityOfElementLocated(OnwardDate_xpath));
			OnwardDate_webl.click();
			return true;
		}
		catch(Exception ex){
			return false;
		}
	}
	public boolean SelectDate(String particularDate)throws Exception{
		try{
			List<WebElement> dates=driver.findElements(OnwardDatesList_xpath);
			for(WebElement date:dates){
				String value=date.getText().trim();
				if(value.equals(particularDate)){
					System.out.println(value);
					Actions builder=new Actions(driver);
					builder.moveToElement(date).click().build().perform();
					return true;
				}
			}
			return false;
		}
		catch(Exception ex){
			return false;
		}
	}

}


