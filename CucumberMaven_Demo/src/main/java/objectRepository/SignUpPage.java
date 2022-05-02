package objectRepository;

import org.openqa.selenium.By;

//Locators
public class SignUpPage {

	public final By AV_MyAccount_Link = By.xpath("//a[contains(@id,'32')]");
	public final By AV_SignUp_Link = By.xpath("//ul[contains(@id,'33')]//li//a[contains(text(),'Sign Up')]");
	public final By AV_CreateAccount_Button = By.xpath("//input[@id='ctl01_ContentPlaceHolder_account_BtnCreate']");
	public final By AV_MyAccount_Error_Message = By.xpath("//td[@class='ajax__validatorcallout_error_message_cell']");
	                                                       
	
	public final By AV_Offer_popup = By.xpath("//body/div[contains(@id,'bx-campaign')]/div[3]/div[1]");
	//public final By AV_OfferPopup_Link = By.xpath("//*[contains(@id,'bx-element')]/button");
	
	public final By AV_OfferPopup_Link = By.xpath("//body/div[contains(@id,'bx-campaign')]/div[3]/div[1]//a");
	
}
