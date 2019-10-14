package com.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumber.AdactinBaseclass.AdactinBaseclass;
import com.cucumber.runner.TestRunner;
import com.cucumber.singleton.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinition extends AdactinBaseclass {
 public static WebDriver driver=TestRunner.driver;
 
 PageObjectManager po=new PageObjectManager(driver);

//TC-101
@Given("^User enter the URL$")
public void user_enter_the_URL() throws Throwable {
	geturl("http://adactin.com/HotelApp/index.php");
}

@Then("^User should see the application logo$")
public void user_should_see_the_application_logo() throws Throwable {
  elementisdisplay(po.getA().getLogo());
}

@Then("^User enter the email id$")
public void user_enter_the_email_id() throws Throwable {
	
	sendkeys(po.getA().getEmail_id(), "prakashmano");
}

@Then("^User enter the password$")
public void user_enter_the_password() throws Throwable {      
	 
	
	sendkeys(po.getA().getPassword(), "9841492682");
}

@Then("^User click the login button$")
public void user_click_the_login_button() throws Throwable {
	clickelement(po.getA().getLogin());
}
@Then("^User click the logout button$")
public void user_click_the_logout_button() throws Throwable {
clickelement(po.getA().getLogout());
}

//TC-102

@Given("^Launch hotel reservation application using URL as in test data$")
public void launch_hotel_reservation_application_using_URL_as_in_test_data() throws Throwable {
	geturl("http://adactin.com/HotelApp/index.php");
   
}

@Given("^Login to the application using username and password as in test data\\.$")
public void login_to_the_application_using_username_and_password_as_in_test_data() throws Throwable {
    sendkeys(po.getS().getEmail_id(), "prakashmano");
    sendkeys(po.getS().getPassword(), "9841492682");
    clickelement(po.getS().getLogin());
}

@Then("^User should see the logo$")
public void user_should_see_the_logo() throws Throwable {
    elementisdisplay(po.getS().getLogo());
   
}

@Then("^Select location as in test data\\.$")
public void select_location_as_in_test_data() throws Throwable {
dropdown(po.getS().getLocation(), "index", "1");   
}

@Then("^Select hotel as in test data\\.$")
public void select_hotel_as_in_test_data() throws Throwable {
    dropdown(po.getS().getHotels(), "index", "1");
   
}

@Then("^Select room type as in test data\\.$")
public void select_room_type_as_in_test_data() throws Throwable {
    dropdown(po.getS().getRoomtype(), "index", "1");
   
}

@Then("^Select no-of-rooms as in test data\\.$")
public void select_no_of_rooms_as_in_test_data() throws Throwable {
   dropdown(po.getS().getRoom(), "index", "1");
   
}

@Then("^Enter check-in-date later than the checkout date field as in test data\\.$")
public void enter_check_in_date_later_than_the_checkout_date_field_as_in_test_data() throws Throwable {
	 sendkeys(po.getS().getCheckin(), "21/10/2019");
	 sendkeys(po.getS().getCheckout(), "19/10/2019");
   
}

@Then("^Verify that system gives an error saying ‘check-in-date should not be later than check-out-date’\\.$")
public void verify_that_system_gives_an_error_saying_check_in_date_should_not_be_later_than_check_out_date() throws Throwable {
    clickelement(po.getS().getSearch());
   
}

//TC-103


@Given("^Launch reservation application using URL as in test_data\\.$")
	public void launch_reservation_application_using_URL_as_in_test_data() throws Throwable {
	geturl("http://adactin.com/HotelApp/index.php");
	}

@Then("^Log in to the application using username and password as in test data\\.$")
public void log_in_to_the_application_using_username_and_password_as_in_test_data() throws Throwable {
	 sendkeys(po.getEr().getEmail(), "prakashmano");
	    sendkeys(po.getEr().getPassword(), "9841492682");
	    clickelement(po.getEr().getLogin());
    
}

@Then("^Select location as per in the test data$")
public void select_location_as_per_in_the_test_data() throws Throwable {
	dropdown(po.getEr().getLocation(), "index", "1");
}

@Then("^select hotel in test data$")
public void select_hotel_in_test_data() throws Throwable {
	dropdown(po.getEr().getHotel(), "index", "1");
    
}

@When("^select room type in test data$")
public void select_room_type_in_test_data() throws Throwable {
	dropdown(po.getEr().getRoomtype(), "index", "1");
    
}

@When("^select no\\.of rooms in hotel$")
public void select_no_of_rooms_in_hotel() throws Throwable {
	 dropdown(po.getEr().getNo_room(), "index", "1");
    
}

@When("^Enter check-out-date as in test data\\.$")
public void enter_check_out_date_as_in_test_data() throws Throwable {
	 sendkeys(po.getEr().getCheckin(), "09/10/2019");
	 sendkeys(po.getEr().getCheckout(), "11/10/2019");
    
}

@When("^verify the application in error$")
public void verify_the_application_in_error() throws Throwable {
	 clickelement(po.getEr().getSearch());
    
}

//TC-104

@Given("^Launch hotel application using URL as in test data\\.$")
public void launch_hotel_application_using_URL_as_in_test_data() throws Throwable {
	geturl("http://adactin.com/HotelApp/index.php");
    
}

@Then("^Login to the web application using username and password as in test data\\.$")
public void login_to_the_web_application_using_username_and_password_as_in_test_data() throws Throwable {
	sendkeys(po.getV().getEmail_id(), "prakashmano");
    sendkeys(po.getV().getPassword(), "9841492682");
    clickelement(po.getV().getLogin());
    
}

@Then("^User Select location as in test data\\.$")
public void user_Select_location_as_in_test_data() throws Throwable {
	dropdown(po.getV().getLocation(), "index", "1");
    
}

@Then("^User Select hotel as in test data\\.$")
public void user_Select_hotel_as_in_test_data() throws Throwable {
	dropdown(po.getV().getHotels(), "index", "1");
    
}

@Then("^User Select room type as in test data\\.$")
public void user_Select_room_type_as_in_test_data() throws Throwable {
	dropdown(po.getV().getRoomtype(), "index", "1");
    
}

@Then("^User Select no-of-rooms as in test data\\.$")
public void user_Select_no_of_rooms_as_in_test_data() throws Throwable {
	dropdown(po.getV().getRoom(), "index", "1");
    
}

@Then("^User Enter check-out-date as in test data\\.$")
public void user_Enter_check_out_date_as_in_test_data() throws Throwable {
	String s="15/10/2019";
	sendkeys(po.getV().getCheckout(), s);
    
}

@Then("^User Select No-of-adults as in test data\\.$")
public void user_Select_No_of_adults_as_in_test_data() throws Throwable {
	dropdown(po.getV().getAdultroom(), "index", "1");
    
}

@Then("^User Select No-of-children as in test data\\.$")
public void user_Select_No_of_children_as_in_test_data() throws Throwable {
	dropdown(po.getV().getChildroom(), "index", "0");
    
}

@Then("^User Click on Search button\\.$")
public void user_Click_on_Search_button() throws Throwable {
	clickelement(po.getV().getSearch());
    
}

@Then("^Verify that hotel displayed is the same as selected in search Hotel form\\.$")
public void verify_that_hotel_displayed_is_the_same_as_selected_in_search_Hotel_form() throws Throwable {
	String s="15/10/2019";
	String r2 = s.replaceAll("/", "");
	System.out.println(s+"=="+po.getV().getCheckdate().getAttribute("value"));
	String n=(po.getV().getCheckdate().getAttribute("value"));
	String r1 = n.replaceAll("/", "");
	
	    if (r1.equals(r2)) {
    	System.out.println("the check out date::Passed");
		
	}else {
		System.out.println("the check out date::Failed");
	}   
}

//TC-105

@Given("^Launch hotel reservation application using URL as in test data\\.\\(TC-(\\d+)\\)$")
public void launch_hotel_reservation_application_using_URL_as_in_test_data_TC(int arg1) throws Throwable {
	geturl("http://adactin.com/HotelApp/index.php");
   
}

@Given("^Login to the application using username and password as in test data\\.\\(TC-(\\d+)\\)$")
public void login_to_the_application_using_username_and_password_as_in_test_data_TC(int arg1) throws Throwable {
	sendkeys(po.getV().getEmail_id(), "prakashmano");
    sendkeys(po.getV().getPassword(), "9841492682");
    clickelement(po.getV().getLogin());
   
}

@Given("^Select location as in test data\\(TC-(\\d+)\\)$")
public void select_location_as_in_test_data_TC(int arg1) throws Throwable {
	dropdown(po.getV().getLocation(), "index", "1");
   
}

@Given("^Select hotel as in test data\\.\\(TC-(\\d+)\\)$")
public void select_hotel_as_in_test_data_TC(int arg1) throws Throwable {
	dropdown(po.getV().getHotels(), "index", "1");
   
}

@Given("^Select room type as in test data\\.\\(TC-(\\d+)\\)$")
public void select_room_type_as_in_test_data_TC(int arg1) throws Throwable {
	dropdown(po.getV().getRoomtype(), "index", "1");
   
}

@Given("^Select no-of-rooms as in test data\\.\\(TC-(\\d+)\\)$")
public void select_no_of_rooms_as_in_test_data_TC(int arg1) throws Throwable {
	dropdown(po.getV().getRoom(), "index", "1");
   
}

@Given("^Enter check-out-date as in test data\\.\\(TC-(\\d+)\\)$")
public void enter_check_out_date_as_in_test_data_TC(int arg1) throws Throwable {
	sendkeys(po.getC().getCheckout(), "16/10/2019");
   
}

@Given("^Select No-of-adults as in test data\\.\\(TC-(\\d+)\\)$")
public void select_No_of_adults_as_in_test_data_TC(int arg1) throws Throwable {
	dropdown(po.getC().getAdultroom(), "index", "1");
   
}

@Given("^Select No-of-children as in test data\\.\\(TC-(\\d+)\\)$")
public void select_No_of_children_as_in_test_data_TC(int arg1) throws Throwable {
	dropdown(po.getC().getChildroom(), "index", "0");
   
}

@Given("^Click on Search button\\.\\(TC-(\\d+)\\)$")
public void click_on_Search_button_TC(int arg1) throws Throwable {
	clickelement(po.getC().getSearch());
   
}

@Given("^Verify that check-indate and check-outdates are the same as selected in search hotel form\\.\\(TC-(\\d+)\\)$")
public void verify_that_check_indate_and_check_outdates_are_the_same_as_selected_in_search_hotel_form_TC(int arg1) throws Throwable {
    
	String j=po.getC().getArriveddate().getAttribute("value");
	String t1 = j.replaceAll("/", "");
	
	String a="14102019";
	
	String k=po.getC().getDeparturedate().getAttribute("value");
	String t2 = k.replaceAll("/", "");
	String d="16102019";
	System.out.println(t1);
	System.out.println(t2);
	
   if(t1.equals(a)) {
	System.out.println("Checkin date and Arriving date are same");
}
   if (t2.equals(d)) {
	System.out.println("Checkin date and Arriving date are same");
}
}



}
