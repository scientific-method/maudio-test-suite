package maudio.test.suite.tests;

import maudio.test.suite.forms.*;

import org.testng.Assert;
import org.testng.annotations.*;
import webdriver.BaseTest;

public class LogInPositiveTest extends BaseTest {

	private String startPage;
	private String emailParam;
	private String passParam;	
	
	@Parameters({"startpage", "email", "password"})
	@BeforeClass
	private void readParams(String startpage, String email, String password ) throws Throwable{
		
		this.startPage = startpage;
		this.emailParam = email;
		this.passParam = password;
         
   }
	
	   
	@Override
	public void runTest() {
		
		logger.step(1);
		browser.navigate(startPage);
		MainPageForm mainForm = new MainPageForm();		
		
		logger.step(2);
		mainForm.logInOrRegister();
		LogInOrRegisterForm logInForm = new LogInOrRegisterForm();
				
		logger.step(3);
		logInForm.logIn(emailParam, passParam);
		UserPageForm userPage = new UserPageForm();
				
		logger.step(4);
		Assert.assertNotNull(userPage.returnLogInSign());
		
	}

}
