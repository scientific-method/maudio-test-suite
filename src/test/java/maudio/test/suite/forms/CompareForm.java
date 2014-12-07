package maudio.test.suite.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.*;

public class CompareForm extends BaseForm {
	
	private static String formlocator="//table[@class='compare-info']";
	private Label comparisonTableSign = new Label (By.xpath("//div[@id='content']//tbody[1]/tr[1]"));
	
	public Label returnComparisonSign() {
		
		return comparisonTableSign;
		
	}
	
	public CompareForm() {
		
		super(By.xpath(formlocator), "Items comparison");
		
	}

}
