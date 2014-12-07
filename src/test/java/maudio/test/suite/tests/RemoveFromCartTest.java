package maudio.test.suite.tests;

import org.testng.annotations.*;
import maudio.test.suite.forms.*;
import webdriver.BaseTest;
import org.testng.Assert;

public class RemoveFromCartTest extends BaseTest {

	private String startPage;
	private String catalog;
	private String addItem;
	
	@Parameters({"startpage", "catalogXpath", "itemToBuyButton"})
	@BeforeClass
	private void readParams(String startpage, String catalogXpath, String itemToBuyButton) throws Throwable{
		
		this.startPage = startpage;
		this.catalog = catalogXpath;
		this.addItem = itemToBuyButton;
              
   }
	
	   
	@Override
	public void runTest() {
		
		logger.step(1);
		browser.navigate(startPage);
		MainPageForm mainForm = new MainPageForm();		
		
		logger.step(2);
		mainForm.navigateTo(catalog);		
		CatalogForm catalogForm = new CatalogForm();
				
		logger.step(3);
		catalogForm.addItemTo(addItem);
						
		logger.step(4);
		catalogForm.goToCart();
		CartForm cartFormOne = new CartForm();
		
		logger.step(5);
		cartFormOne.removeFromCart();
		CartForm cartFormTwo = new CartForm();
		
		logger.step(6);
		Assert.assertNotNull(cartFormTwo.returnIsEmptySign());
		

		
	}
		
}
