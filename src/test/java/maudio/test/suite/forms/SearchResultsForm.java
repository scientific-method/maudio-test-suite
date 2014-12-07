package maudio.test.suite.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.*;

public class SearchResultsForm extends BaseForm {
	//лоактор самой страницы
	private static String formlocator="//h2[contains(., 'Товары, соответствующие критериям поиска')]";
	 
	//локатор нечувствителен к варианту отображения результатов
	//private Label soughtForItem = new Label(By.xpath("//div[@class='border']//a[contains(., 'KOSS The PLUG')]"), "Искомый товар");

	public void navigateTo(String xpathlabel) {
		
		Label label = new Label (By.xpath(xpathlabel), "Ссылка на искомый товар");
		label.click();
		
	}
	
	
	//конструктор
	public SearchResultsForm() {
		
		super(By.xpath(formlocator), "Search results");
		
	}
	

}
