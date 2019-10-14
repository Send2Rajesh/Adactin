package com.cucumber.adactinPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchvalidation2 {
	public static WebDriver driver;
	@FindBy(id = "username")
	private WebElement email;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(id = "login")
	private WebElement login;
	
	@FindBy(xpath="//select[@name=\"location\"]")
	private WebElement location;
	@FindBy(xpath="//select[@name=\"hotels\"]")
	private WebElement hotel;
	@FindBy(xpath="//select[@name=\"room_type\"]")
	private WebElement roomtype;
	@FindBy(xpath="//select[@name=\"room_nos\"]")
	private WebElement no_room;
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement checkin;
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement checkout;
	@FindBy(xpath="//input[@name='Submit']")
	private WebElement search;
	
	
	
	public WebElement getEmail() {
		return email;
	}



	public WebElement getPassword() {
		return password;
	}



	public WebElement getLogin() {
		return login;
	}



	public WebElement getLocation() {
		return location;
	}



	public WebElement getHotel() {
		return hotel;
	}



	public WebElement getRoomtype() {
		return roomtype;
	}



	public WebElement getNo_room() {
		return no_room;
	}



	public WebElement getCheckin() {
		return checkin;
	}



	public WebElement getCheckout() {
		return checkout;
	}



	public WebElement getSearch() {
		return search;
	}



	public Searchvalidation2(WebDriver ddriver) {
		this.driver=ddriver;
		PageFactory.initElements(driver, this);
	}
	
	

}
