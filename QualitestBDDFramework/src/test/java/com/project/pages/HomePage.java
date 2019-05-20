package com.project.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qualitest.core.element.BaseElement;
import com.qualitest.core.page.BasePage;
import com.qualitest.core.util.Helper;
import com.qualitest.core.util.Verify;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends BasePage {
	
	@AndroidFindBy(id="action_bar_dummy")
	private BaseElement searchDummy;
	
//	@AndroidFindBy(id="searchbar")
//	private BaseElement searchTextField;
//	
//	@AndroidFindBy(id="search_button")
//	private BaseElement searchButton;
		
	@Override
	public BaseElement getItemToExist() {
		return null;
	}
	
	public void searchFor(String text) {
		searchDummy.click();
		//searchTextField.fill(text);
		//searchButton.click();
	}
	
	public void findAllElements() {
		List<WebElement> list = Helper.getDriver().findElements(By.xpath("//*"));
		
		for(WebElement e : list) {
			System.out.println(e.getAttribute("class") + " " + e.getAttribute("name") + " " + e.getAttribute("id"));
		}
		
	}

}
