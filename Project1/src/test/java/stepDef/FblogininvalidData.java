package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FblogininvalidData {
	WebDriver driver;
	@Given("Open FB URL")
	public void openFBURL(){
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://fb.com/");
	   
	}

	@When("User enter invalid credentials")
	public void UserFBURL(){
		driver.findElement(By.name("email")).sendKeys("srewvsr3w34@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("asfaskjfaskf");
	}

	@And("Click on Login button")
	public void clickFBURL() throws InterruptedException{
		driver.findElement(By.name("login")).click();
		Thread.sleep(9000);
	}

	@Then("Application should display the validation Message")
	public void tFBURL(){
		WebElement errorMessage = driver.findElement(By.linkText("Find your account and log in."));

		if (errorMessage.isDisplayed()) {
			System.out.println("Given Credentials were invalid.........");

		} else {
			System.out.println("Given Credentials were valid..........");
		}

	
	}
	

}
