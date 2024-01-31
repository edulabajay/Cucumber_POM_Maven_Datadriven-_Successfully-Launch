package com_stepdefinition;


import com_BasePage_ERP.Basepage_erp;
import com_ERP_Pages.ERP_Homepage;
import com_ERP_Pages.ERP_Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Step_Login extends Basepage_erp{
	// When you create an object, memory is allocated for its instance variables 
	ERP_Login erp_login = new ERP_Login();
	ERP_Homepage erp_homepage;


	@Given("User should be on the login page")
	public void user_should_be_on_the_login_page() {
		Basepage_erp.initialize();  
	}

	@Then("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) {

		erp_login = new ERP_Login();
		erp_login.erp_login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("User clicks on the login button")
	public void user_clicks_on_the_login_button() {


		erp_login = new ERP_Login();
		erp_homepage = erp_login.erp_button();

	}



}
