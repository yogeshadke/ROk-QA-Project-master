package rok.qaPageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Wrapper.WaitForElement;
import rok.qa.Utilities.Wrappers;

public class Logo_verification_on_login_page {

	WebDriver driver;

	public Logo_verification_on_login_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@src='/img/logo214.svg']")
	WebElement logoElement;
	// a[@id="forgot_password_link"]

	@FindBy(xpath = "//a[@href='/secur/forgotpassword.jsp?locale=us']")
	WebElement forgotpassword;
	
	@FindBy(xpath = "//h1[contains(text(),'Forgot Your Password')]")
	WebElement forgotpasswordlinkvfy;
	
	//input[@name="cancel"]
	@FindBy(xpath = "//input[@name='cancel']")
	WebElement clickoncancelbtn;

	public boolean LogoVerification()  {
	
		return logoElement.isDisplayed();

	}

	public void forgotpasswordlinkverification() {
       
		WaitForElement.visibilityOfElement(driver, forgotpassword, Duration.ofSeconds(5000));
		Wrappers.clickJS(forgotpassword);
		String fgt = forgotpasswordlinkvfy.getText();
		String expected ="Forgot Your Password";
		Assert.assertEquals(fgt, expected, "Link is broken");
		System.out.println("Redirected to forgot Password page Sucessfully"); 
		Wrappers.clickJS(clickoncancelbtn);
		

	}
}
