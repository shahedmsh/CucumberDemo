package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Reusable Functions
public class GenericWrappers extends BaseClass {

	// Setup browser driver
	public void setUpDriver(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		 else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();
		}
		 else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.chromedriver().setup();
			driver = new EdgeDriver();
		} else
			System.out.println("Please pass the correct browser value: " + browserName);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	// Read data from properties file
	public String getPropertyData(String key) {
		try {
			fi = new FileInputStream(propertyFilePath);
			prop.load(fi);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String keyvlaue = null;
		keyvlaue = prop.getProperty(key);
		return keyvlaue;
	}
}
