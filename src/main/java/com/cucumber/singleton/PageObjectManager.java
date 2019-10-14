package com.cucumber.singleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumber.adactinPOM.AdactinLogin;
import com.cucumber.adactinPOM.CheckIn_CheckOut;
import com.cucumber.adactinPOM.Searchvalidation2;
import com.cucumber.adactinPOM.VerifyLocation;
import com.cucumber.adactinPOM.Searchvalidation;
import com.cucumber.runner.TestRunner;

import cucumber.deps.com.thoughtworks.xstream.converters.ErrorReporter;

public class PageObjectManager {
	public static WebDriver driver;
	
	private AdactinLogin a;
	private Searchvalidation s;
	private Searchvalidation2 er;
	private VerifyLocation v; 
	private CheckIn_CheckOut c;
	
public CheckIn_CheckOut getC() {
	if (c==null) {
		c=new CheckIn_CheckOut(driver);
	}
		return c;
	}


public VerifyLocation getV() {
	if (v==null) {
		v=new VerifyLocation(driver);
	}
		return v;
	}


public Searchvalidation getS() {
	if (s==null) {
		s=new Searchvalidation(driver);
	}
		return s;
	}


public AdactinLogin getA() {
	if (a==null) {
		a=new AdactinLogin(driver);
	}
		return a;
	}



public Searchvalidation2 getEr() {
	if (er==null) {
		er=new Searchvalidation2(driver);
		
	}
	return er;
}


public PageObjectManager(WebDriver ldriver) {
	this.driver=ldriver;
}
	
}
