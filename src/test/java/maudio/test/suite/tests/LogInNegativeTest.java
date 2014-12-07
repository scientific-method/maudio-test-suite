package maudio.test.suite.tests;


import org.testng.Assert;
import org.testng.annotations.*;
import maudio.test.suite.forms.*;
import webdriver.BaseTest;


public class LogInNegativeTest extends BaseTest {

	private String emailParam;
	private String passParam;	
	private String startPage;
	
	@Parameters({"startpage", "invalidEmail", "invalidPassword"})
	@BeforeClass
	private void readParams(String startpage, String invalidEmail, String invalidPassword ) throws Throwable{
		
		this.startPage = startpage;
		this.emailParam = invalidEmail;
		this.passParam = invalidPassword;

	}

	  
	@Override
	public void runTest() {
		
		logger.step(1);
		browser.navigate(startPage);
		MainPageForm mainForm = new MainPageForm();		
		
		logger.step(2);
		mainForm.logInOrRegister();
		LogInOrRegisterForm logInFormOne = new LogInOrRegisterForm();
				
		logger.step(3);
		logInFormOne.logIn(emailParam, passParam);
		LogInOrRegisterForm logInFormTwo = new LogInOrRegisterForm();
				
		logger.step(4);
		Assert.assertNotNull(logInFormTwo.returnWarning());
		
	}

}
