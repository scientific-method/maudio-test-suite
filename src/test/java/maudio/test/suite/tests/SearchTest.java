package maudio.test.suite.tests;

import org.testng.annotations.*;
import maudio.test.suite.forms.*;
import webdriver.BaseTest;
import org.testng.Assert;

public class SearchTest extends BaseTest {
	
	private String startPage;
	private String someText;
	private String resultXPathExpression;
	
	
	@Parameters({"startpage", "searchtext", "soughforitem"})
	@BeforeClass
	private void readParams(String startpage, String searchtext, String soughforitem) throws Throwable {
		
		this.startPage = startpage;
		this.someText = searchtext;
		this.resultXPathExpression = soughforitem;
         
   }
	
	
	@Override
	public void runTest() {
		
		logger.step(1);
		browser.navigate(startPage);
		MainPageForm mainForm = new MainPageForm();		
		
		logger.step(2);		
		mainForm.searchFor(someText);
		SearchResultsForm searchResultForm = new SearchResultsForm();
		
		logger.step(3);
		searchResultForm.navigateTo(resultXPathExpression);
		ItemPageForm itemPageForm = new ItemPageForm();
				
		logger.step(4);
		Assert.assertEquals(itemPageForm.actualName(), someText);
		
       
        
   }

}