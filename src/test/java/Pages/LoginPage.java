package Pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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
     		System.out.println("Successfully logged In as Shrinidhi and navigated to Homepage of the  Application");
     	}
     	else
     	{
     		System.out.println("Loggin unsuccessful");
     	}
     	
     	driver.findElement(By.id(SearchItem_Page_Repository.SearchBox)).sendKeys(Keys.SHIFT , "baby clothes");
     	
     	
     	
     	driver.findElement(By.id(SearchItem_Page_Repository.SearchBox)).sendKeys(Keys.DOWN);
     	driver.findElement(By.id(SearchItem_Page_Repository.SearchBox)).sendKeys(Keys.DOWN);
     	driver.findElement(By.id(SearchItem_Page_Repository.SearchBox)).sendKeys(Keys.DOWN);
    
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
