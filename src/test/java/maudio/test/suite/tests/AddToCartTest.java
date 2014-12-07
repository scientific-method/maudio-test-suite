package maudio.test.suite.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import maudio.test.suite.forms.*;
import webdriver.BaseTest;
import webdriver.elements.*;

public class AddToCartTest extends BaseTest {

	private String catalog;
	private String addItem;
	private String itemName;
	private String startPage;
	
	@Parameters({"startpage", "catalogXpath", "itemToBuyButton", "itemToBuyName"})
	@BeforeClass
	private void readParams(String startpage, String catalogXpath, String itemToBuyButton, String itemToBuyName) throws Throwable{
		
		this.startPage = startpage;
        this.catalog = catalogXpath;
        this.addItem = itemToBuyButton;
        this.itemName = itemToBuyName;
          
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
		Label addedItemName = new Label (By.xpath(itemName));
		String expectedName = addedItemName.getText();
		catalogForm.goToCart();
		CartForm cartForm = new CartForm();
		
		logger.step(5);
		Assert.assertEquals(cartForm.actualName(), expectedName);

		
	}
		
	
}
