package Pages;

import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import repository.Login_Page_Repository;
import repository.SearchItem_Page_Repository;
import utility.ReadPropertyFile;
import utility.configurable_properties;

public class LoginPage {
	static WebDriver driver;
	static Properties prop;

	public static  void callconfig() throws IOException {
		
		prop = ReadPropertyFile.property_File();
		driver = configurable_properties.browser_choice();
		configurable_properties.url_WindowOptimisation();
		driver.findElement(By.xpath(Login_Page_Repository.StartSignIn)).click();	
		driver.findElement(By.xpath(Login_Page_Repository.Username)).sendKeys(prop.getProperty("username"));
    	driver.findElement(By.xpath(Login_Page_Repository.ContinueButton)).click();
    	driver.findElement(By.xpath(Login_Page_Repository.password)).sendKeys(prop.getProperty("password"));
     	driver.findElement(By.xpath(Login_Page_Repository.SigninButton)).click();
     	
     	WebElement userLoggedIn=driver.findElement(By.xpath("//div[@id='nav-tools']/a[2]/span[1][contains(text(),'Hello, Shrinidhi')]"));
     	if(userLoggedIn.getText().equals("Hello, Shrinidhi"))
     	{
     		Assert.assertTrue(true);//ystem.out.println("Successfully logged In as Shrinidhi and navigated to Homepage of the  Application");
     	}
     	else
     	{
     		Assert.assertFalse(false);
     	}
     	
     	driver.findElement(By.id(SearchItem_Page_Repository.SearchBox)).sendKeys(Keys.SHIFT , "baby clothes");
     	
     	JavascriptExecutor js= (JavascriptExecutor)driver;

		String script = "return document.getElementById(\"twotabsearchtextbox\").value;";
		String text=(String) js.executeScript(script);
		int i =0;
		while(!text.equalsIgnoreCase("baby clothes boy 3-6 months"))
		{
		i++;
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.DOWN);

		text=(String) js.executeScript(script);
		//System.out.println(text);
		if(i>10)
		{
		break;
		}

		}

		if(i>10)
		{
		System.out.println("Element not found");
		}
		else
		{
		System.out.println("Element  found");
		}
    
		
		driver.findElement(By.xpath(SearchItem_Page_Repository.SearchButton)).click();
		
		Select dropDownOption  = new Select((WebElement) driver.findElement(By.id("s-result-sort-select")));
		
		System.out.println(dropDownOption.getOptions());
		dropDownOption.selectByValue("price-desc-rank");
	
		
		js.executeScript("window.scrollBy(0,250)");
	}
	
	
//	public static void loginusername() throws IOException {
//
//		callconfig();
//
//		driver.findElement(By.xpath(Login_Page_Repository.Username)).sendKeys(prop.getProperty("username"));
//		driver.findElement(By.xpath(Login_Page_Repository.ContinueButton)).click();
//	}
//
//	public static void loginpassword() throws IOException {
//
//		driver.findElement(By.xpath(Login_Page_Repository.password)).sendKeys(prop.getProperty("password"));
//	}
//
//	public static void loginpSignin() throws IOException {
//
//		driver.findElement(By.xpath(Login_Page_Repository.SigninButton)).click();
//	}
//
//	

}