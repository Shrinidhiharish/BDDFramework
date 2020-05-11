package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class configurable_properties {
	static WebDriver driver;
	static Properties prop;

	public static void property_File() throws IOException {
		prop = new Properties();
		FileInputStream ip = new FileInputStream(".\\src\\test\\java\\resources\\configurableProperty.Properties");
		prop.load(ip);

	}

	public static WebDriver browser_choice() throws IOException

	{

		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"E:\\Eclipse_Projects\\amazon\\src\\test\\java\\Drivers\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else {

			System.out.println("no browser value given");
		}
		return driver;

	}

	public static void url_WindowOptimisation() {
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}

	
	
}
