import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.internal.PropertiesFile;
public class BaseClass {
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static FileInputStream fi;
	public final String path = (".src/test/resources/features/data.properties");
}
