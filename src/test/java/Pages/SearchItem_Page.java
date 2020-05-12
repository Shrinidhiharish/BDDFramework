package Pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import repository.SearchItem_Page_Repository;
import utility.configurable_properties;

public class SearchItem_Page extends configurable_properties{

	static WebDriver driver;
	static Properties prop;
	
	public static void searchItem() throws IOException
	
	{
		
		//driver.findElement(By.id(SearchItem_Page_Repository.SearchBox)).sendKeys("hello");
	}
	
	
}
