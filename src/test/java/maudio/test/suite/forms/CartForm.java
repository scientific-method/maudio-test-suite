package maudio.test.suite.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.*;

public class CartForm extends BaseForm {

	private static String formlocator="//div[@id='container']//h1[contains(., 'Корзина покупок')]";
	private Label emptyCartLabel = new Label (By.xpath("//div[@class='border']/div[contains(., 'Ваша корзина пуста!')]"));
	private Label itemNameLabel = new Label (By.xpath("//div[@class='cart-info']//td[@class='name']/a"));
	private Button removeButton = new Button (By.xpath("//img[@title='Удалить']"));
	
	public String actualName() {
		
		return itemNameLabel.getText();
		
	}
	
	public void removeFromCart() {
		
		removeButton.click();
		
	}
	
	public Label returnIsEmptySign() {
		
		return emptyCartLabel;
		
	}

	public CartForm() {
		
		super(By.xpath(formlocator), "Cart");
		
	}

}
