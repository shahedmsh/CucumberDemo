package utils;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class BaseClass {

	// here will store the common Variables for project
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static FileInputStream fi;
	public final String propertyFilePath = "./src/test/resources/config/config.properties";

}
