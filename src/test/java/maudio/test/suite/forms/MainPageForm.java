package maudio.test.suite.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.*;

public class MainPageForm extends BaseForm {
	
	//лоактор самой страницы
	private static String formlocator="//div[@id='carousel']//p";
	//навигационный блок - все наушники
	//private Label menyAllHeadphonesLabel = new Label (By.xpath("//div[@class='box']//a[contains(., 'Все наушники')]"), "Menu");
	//поисковые элементы
	public TextBox searchTextBox = new TextBox (By.xpath("//div[@id='search']/input[@type='text']"), "Search textbox");
	public Button searchButton = new Button (By.xpath("//div[@id='search']/div[@class='button-search']"), "Search button");
	//стать клиентом
	private Label logInOrRegLabel = new Label (By.xpath("//div[@id='menu']//a[contains(., 'Стать клиентом')]"), "Log in or register");
	
	//поиск по вводимому слову
	public void searchFor(String text) {
		
		searchTextBox.type(text);
		searchButton.click();
	
	}
	
	public void logInOrRegister() {
		
		logInOrRegLabel.click();
		
	}
	
	//Переход из этой формы по указанной в тесте ссылке
	public void navigateTo(String xpathlabel) {
		
		Label label = new Label (By.xpath(xpathlabel));
		label.click();
		
	}
	
	
	//constructor
	public MainPageForm() {

		super(By.xpath(formlocator), "Main page");
		
	}

}
