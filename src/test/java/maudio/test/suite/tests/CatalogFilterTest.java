package maudio.test.suite.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import maudio.test.suite.forms.*;
import webdriver.BaseTest;

public class CatalogFilterTest extends BaseTest {

	private String startPage;
	private String filter;
	private String elements;
	private String catalog;
	
	
	@Parameters({"startpage", "filterMark", "elementsMark", "catalogXpath"})
	@BeforeClass
	private void readParams(String startpage, String filterMark, String elementsMark, String catalogXpath) throws Throwable{
        this.startPage = startpage; 
		this.filter = filterMark;
        this.elements = elementsMark;
        this.catalog = catalogXpath;
         
   }	
	
  
	@Override
	public void runTest() {
		
		logger.step(1);
		browser.navigate(startPage);
		MainPageForm mainForm = new MainPageForm();
				
		logger.step(2);
		mainForm.navigateTo(catalog);
		CatalogForm catalogFormOne = new CatalogForm();
								
		logger.step(3);
		catalogFormOne.chooseOrNavigateTo(filter);
		CatalogForm catalogFormTwo = new CatalogForm();				
				
		logger.step(4);
		Assert.assertEquals(catalogFormTwo.returnElementsWithParam(elements), catalogFormTwo.returnAllElements());
		
	}

}
