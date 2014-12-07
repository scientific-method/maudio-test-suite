package maudio.test.suite.forms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import webdriver.BaseForm;
import webdriver.elements.*;

public class CatalogForm extends BaseForm {
	
	private static String formlocator="//div[@id='content']/h1[contains(., 'Все наушники')]";
	private Button toCartButton = new Button (By.xpath("//div[@id='cartpopup']//button[contains(., 'Перейти в корзину')]"), "Cart");
	private Label comparisonLabel = new Label (By.xpath("//a[@id='compare-total']"));
	private Label fromLowToHigh = new Label (By.xpath("//div[@class='sort']//option[contains(., 'Цена (по возрастанию)')]"));
	
	public void sort() {
		
		fromLowToHigh.click();
		
	}

	//добавление товара в корзину или в сравнение
	public void addItemTo(String xpathbutton) {
		Button button = new Button(By.xpath(xpathbutton));
		button.click();
		
	}
	
		
	//переход по ссылке или выбор, для параметризованного элемента
	public void chooseOrNavigateTo(String xpathlabel) {
		Label label = new Label (By.xpath(xpathlabel));
		label.click();
		
	}
	
	
	//переход в корзину по кнопке		
	public void goToCart() {
			toCartButton.click();
			
	}
	
	//переход в форму сравнения
	public void compareItems() {
		
		comparisonLabel.click();
				
	}
	
	public int returnElementsWithParam(String someXpath) {
		
		RemoteWebDriver driver = browser.getDriver();
		List<WebElement> resultElements = driver.findElements(By.xpath(someXpath));
		return resultElements.size();
					
		}
	
	public int returnAllElements() {
		
		RemoteWebDriver driver = browser.getDriver();
		List<WebElement> allElements = driver.findElements(By.xpath("//div[@class='border']//div[@class='name']/a"));
		return allElements.size();
					
	}
	
	
	//constructor
	public CatalogForm() {
		
		super(By.xpath(formlocator), "Goods catalog");
		
	}



}
