package com.cucumber.adactinPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchvalidation {
public static WebDriver driver;

@FindBy(xpath="//img[@class='logo']")
private WebElement logo;

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

public WebElement getLocation() {
	return location;
}

public WebElement getHotels() {
	return hotels;
}

public WebElement getRoomtype() {
	return roomtype;
}

public WebElement getRoom() {
	return room;
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

@FindBy(id = "username")
private WebElement email_id;

@FindBy(id = "password")
private WebElement password;

@FindBy(id = "login")
private WebElement login;

@FindBy(id = "location")
private WebElement location;
	
@FindBy(id = "hotels")
private WebElement hotels;

@FindBy(id = "room_type")
private WebElement roomtype;

@FindBy(id = "room_nos")
private WebElement room;

@FindBy(id = "datepick_in")
private WebElement checkin;

@FindBy(id = "datepick_out")
private WebElement checkout;

@FindBy(id = "Submit")
private WebElement search;
	
public Searchvalidation(WebDriver sdriver) {
this.driver=sdriver;
PageFactory.initElements(driver, this);
}

}
