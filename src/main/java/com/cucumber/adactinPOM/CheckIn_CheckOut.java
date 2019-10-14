package com.cucumber.adactinPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckIn_CheckOut {
public static WebDriver driver;

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

@FindBy(id = "arr_date_0")
private WebElement Arriveddate;

@FindBy(id = "dep_date_0")
private WebElement departuredate;

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

public WebElement getArriveddate() {
	return Arriveddate;
}

public WebElement getDeparturedate() {
	return departuredate;
}

public WebElement getSearch() {
	return search;
}

@FindBy(id = "Submit")
private WebElement search;

public WebElement getAdultroom() {
	return adultroom;
}

public WebElement getChildroom() {
	return childroom;
}

@FindBy(id = "adult_room")
private WebElement adultroom;

@FindBy(id = "child_room")
private WebElement childroom;

public CheckIn_CheckOut(WebDriver cdriver) {
this.driver=cdriver;
PageFactory.initElements(driver, this);
}
}
