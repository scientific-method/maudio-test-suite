package maudio.test.suite.tests;

import org.testng.annotations.*;

import maudio.test.suite.forms.*;
import webdriver.BaseTest;
import org.testng.Assert;

public class PriseDisplayTest extends BaseTest {

	private String startPage;
	private String catalog;
	private String item;
	
	
	@Parameters({"startpage", "catalogXpath", "itemToBuyName"})
	@BeforeClass
	private void readParams(String startpage, String catalogXpath, String itemToBuyName) throws Throwable{
         
		this.startPage = startpage;
		this.catalog = catalogXpath;
		this.item = itemToBuyName;
             
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
		catalogForm.chooseOrNavigateTo(item);
		ItemPageForm itemPageOne = new ItemPageForm();
				
		logger.step(4);
		itemPageOne.changeCurrencyToUSD();
		ItemPageForm itemPageTwo = new ItemPageForm();
		
		logger.step(5);
		Assert.assertNotNull(itemPageTwo.returnPriceInUSDSign());
		
		
	}

}
