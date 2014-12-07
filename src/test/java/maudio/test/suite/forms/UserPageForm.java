package maudio.test.suite.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.*;

public class UserPageForm extends BaseForm {
	
	private static String formlocator="//h1[contains(., 'Личный Кабинет')]";
	private Label logOutLabel = new Label (By.xpath("//div[@class='box']//a[contains(., 'Выход')]"));
	
	public Label returnLogInSign() {
		
		return logOutLabel;
		
	}

	public UserPageForm() {
		
		super(By.xpath(formlocator), "User Page");
		
	}

}
