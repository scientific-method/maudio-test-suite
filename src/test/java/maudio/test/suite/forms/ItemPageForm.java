package maudio.test.suite.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.*;

public class ItemPageForm extends BaseForm {
	
	private static String formlocator="//div[@id='content']//div[@class='product-info']";
	private Label actualItemName  = new Label (By.xpath("//div[@id='content']/h1"), "Actual item name");
	//по умолчанию цена на сайте отображается в бел.руб.
	private Button usdButton = new Button (By.xpath("//div[@id='currency']/a[contains(., '$')]"));
	private Label priceInUSD = new Label (By.xpath("//div[@class='price' and contains(., '$')]"));
	
	public String actualName() {
		
		return actualItemName.getText();
		
	}
	
	public void changeCurrencyToUSD() {
		
		usdButton.click();
		
	}
	
	public Label returnPriceInUSDSign() {
		
		return priceInUSD;
		
	}
	
	
	
	//constructor
	public ItemPageForm() {
		
		super(By.xpath(formlocator), "Item page");
		
	}

}
