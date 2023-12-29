package com.page.demonblaze;

import org.openqa.selenium.WebDriver;

public class HomePage {
	public static String logo_text = "PRODUCT STORE";
	public static String HOME = "//div[@id='navbarExample']//a[text()='Home ']";
	public static String CONTACT = "//a[text()='Contact']";
	public static String ABOUTUS = "//a[text()='About us']";
	public static String CART = "Cart";
	public static String LOGIN = "Log in";
	public static String LOGOUT = "Log out";
	public static String SIGNUP = "Sign up";
	public static String CATEGORIES = "CATEGORIES";
	public static String PHONES = "Phones";
	public static String LAPTOPS = "Laptops";
	public static String MONITORS = "Monitors";
	public static String ABOUTUS_FOOTER = "About Us";
	public static String GETINTOUCH = "Get in Touch";	
	public static String COPYRIGHT ="Copyright © Product Store 2017";
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	
}
