package com.project.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qualitest.core.element.BaseElement;
import com.qualitest.core.page.BasePage;
import com.qualitest.core.util.Helper;

import net.serenitybdd.core.annotations.findby.FindBy;

public class DocFinityLoginPage extends BasePage {
	
	@FindBy(id="login")
	private BaseElement loginButton;
	
	@FindBy(id="username")
	private BaseElement usernameTextField;
	
	@FindBy(id="password")
	private BaseElement passwordTextField;
	
	@FindBy(id="loginError")
	private BaseElement loginErrorMessage;
		
	
	public void docFinityLogin(String username, String password) {
		usernameTextField.fill(username);
		passwordTextField.fill(password);
		loginButton.click();
	}
	
	public void verifyLoginErrorVisible() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(loginErrorMessage.isDisplayed());
	}
}
