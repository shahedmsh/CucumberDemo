package stepDefinations;

import org.openqa.selenium.ElementNotVisibleException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.SignUpPage;
import utils.GenericWrappers;

public class SignUpPage_Steps extends GenericWrappers {
	SignUpPage sup = new SignUpPage();

	@Given("Open the Application")
	public void open_the_application() {
		setUpDriver(getPropertyData("browerName"));
		driver.get(getPropertyData("URL"));
	}

	@And("Redirct to the SignUp page")
	public void redirct_to_the_sign_up_page() {
		try {
			if (driver.findElement(sup.AV_Offer_popup).isDisplayed()) {
				System.out.println("Offer popup showing! Now closing the popup.\n");
				driver.findElement(sup.AV_OfferPopup_Link).click();
			}

			System.out.println("Current Page Title : " + driver.getTitle() + "\n");
			driver.findElement(sup.AV_MyAccount_Link).click();
			Thread.sleep(2000);
			driver.findElement(sup.AV_SignUp_Link).click();
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ElementNotVisibleException e) {
			e.printStackTrace();
			throw new RuntimeException("Element is not displayed ");
		}
	}

	@When("Click on the create account button without entring the values")
	public void click_on_the_create_account_button_without_entring_the_values() {
		System.out.println("Current Page Title : " + driver.getTitle() + "\n");
		driver.findElement(sup.AV_CreateAccount_Button).click();
	}

	@Then("Get the error message")
	public void get_the_error_message() {
		try {
			if (driver.findElement(sup.AV_MyAccount_Error_Message).isDisplayed()) {
				System.out.println("Validation Message displaying: "
						+ driver.findElement(sup.AV_MyAccount_Error_Message).getText() + "\n");
			}
		} catch (ElementNotVisibleException e) {
			e.printStackTrace();
			throw new RuntimeException("Element is not displayed ");
		}
	}
}
