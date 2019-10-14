package com.cucumber.adactinPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLogin {
	public static WebDriver driver;

	@FindBy(id = "username")
	private WebElement email_id;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "login")
	private WebElement login;
	
	@FindBy(xpath="//a[@href='Logout.php']")
	private WebElement logout;
	
	@FindBy(xpath="//img[@class='logo']")
	private WebElement logo;

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getLogo() {
		return logo;
	}

	public WebElement getEmail_id() {
		return email_id;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public AdactinLogin(WebDriver xdriver) {
		this.driver = xdriver;
		PageFactory.initElements(driver, this);
	}

}
