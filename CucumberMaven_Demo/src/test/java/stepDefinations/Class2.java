package stepDefinations;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;
import objectRepository.SignUpPage;
import utils.GenericWrappers;

public class Class2 extends GenericWrappers {
	SignUpPage sup = new SignUpPage();

	@When("Click on the create account button with valid email values")
	public void click_on_the_create_account_button_with_valid_email_values() {
		System.out.println("Current Page Title : " + driver.getTitle() + "\n");
		driver.findElement(By.name("ctl01$ContentPlaceHolder$account$txtEmail")).sendKeys("g@gmail.com");
		driver.findElement(sup.AV_CreateAccount_Button).click();
		if (driver.findElement(sup.AV_MyAccount_Error_Message).isDisplayed()) {
			System.out.println("Validation Message displaying: "
					+ driver.findElement(sup.AV_MyAccount_Error_Message).getText() + "\n");
		}
	}

}
