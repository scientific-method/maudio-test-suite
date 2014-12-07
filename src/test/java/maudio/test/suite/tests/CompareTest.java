package maudio.test.suite.tests;

import org.testng.annotations.*;

import maudio.test.suite.forms.*;
import webdriver.BaseTest;
import org.testng.Assert;

public class CompareTest extends BaseTest {

	private String startPage;
	private String catalog;
	private String itemOne;
	private String itemTwo;
	
	@Parameters({"startpage", "catalogXpath", "firstItem", "secondItem"})
	@BeforeClass
	private void readParams(String startpage, String catalogXpath, String firstItem, String secondItem) throws Throwable{
         
		this.startPage = startpage;
		this.catalog = catalogXpath;
		this.itemOne = firstItem;
		this.itemTwo = secondItem;
             
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
		catalogForm.addItemTo(itemOne);
		catalogForm.addItemTo(itemTwo);
										
		logger.step(4);
		catalogForm.compareItems();
		CompareForm compareForm = new CompareForm();
		
		logger.step(5);
		Assert.assertNotNull(compareForm.returnComparisonSign());
		
		
		
	}

}
