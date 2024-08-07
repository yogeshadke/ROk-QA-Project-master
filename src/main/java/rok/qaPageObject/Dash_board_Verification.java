package rok.qaPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Dash_board_Verification {
	WebDriver driver;

	public Dash_board_Verification(WebDriver driver) {
	this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@class='cBrandingLogo']")
	WebElement dashboardlogo;

//span[@class=" profileName"]

	public void dashboardverify() {

		Assert.assertTrue(dashboardlogo.isDisplayed(), "Logo is not present");

	}

}
