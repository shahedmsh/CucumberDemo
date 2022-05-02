import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.internal.PropertiesFile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileLoad extends BaseClass {
		
	
	@Test
	public void setup() throws IOException {
	
		fi = new FileInputStream(path);
		prop.load(fi);
		prop.getProperty("Url");
		prop.getProperty("Browser");
	}
	@BeforeClass
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
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

}
