package maudio.test.suite.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.*;

public class LogInOrRegisterForm extends BaseForm {
	
	private static String formlocator="//h1[contains(., 'Логин')]";
	private TextBox emailTextBox = new TextBox (By.xpath("//input[@name='email']"));
	private TextBox passwordTextBox = new TextBox (By.xpath("//input[@name='password']"));
	private Button loginButton = new Button (By.xpath("//input[@type='submit']"));
	private Button registerButton = new Button (By.xpath("//a[@class='button' and contains(., 'Продолжить')]"));
	private Label warningLabel = new Label (By.xpath("//div[@class='warning']"));

	public void logIn(String email, String pass) {
		
		emailTextBox.type(email);
		passwordTextBox.type(pass);
		loginButton.click();
		
	}
	
	public Label returnWarning() {
		
		return warningLabel;
		
	}
	
	public void register() {
		
		registerButton.click();
		
	}
	
	
	public LogInOrRegisterForm() {
		
		super(By.xpath(formlocator), "Become a client");
		
	}

}
