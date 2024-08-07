package rok.qa.Testcases;

import java.io.IOException;


import java.net.MalformedURLException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import rok.qa.Utilities.BaseClass;
import rok.qaPageObject.Logo_verification_on_login_page;

public class Verify_logo_on_login_page_01 extends BaseClass {
	//public static Properties prop;
	

	@Test
	public void VerfyLogo() throws InterruptedException, MalformedURLException, IOException {
		// openUrl
		
       driver.get(url);
		//logger.info("Url opened");
		Logo_verification_on_login_page logo = new Logo_verification_on_login_page(driver);
		boolean flag =logo.LogoVerification();
		Assert.assertTrue(flag);
		
        logo.forgotpasswordlinkverification();
        
	}

}
