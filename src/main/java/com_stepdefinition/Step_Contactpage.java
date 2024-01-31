package com_stepdefinition;



import org.junit.Assert;

import com_BasePage_ERP.Basepage_erp;
import com_ERP_Pages.ERP_ContactPage;
import com_ERP_Pages.ERP_Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Step_Contactpage extends Basepage_erp {
	ERP_Login erp_login;

	ERP_ContactPage erpcontact = new ERP_ContactPage();



	public Step_Contactpage() {

		this.erpcontact = new ERP_ContactPage();
	}


	@Given("User should be redirect to contact page")
	public void user_should_be_redirect_to_contact_page() {

	  
		String homepagetitle = erpcontact.validate_erpcontactpagetitle();
		Assert.assertEquals("Cogmento CRM", homepagetitle);
	}

	@Then("User enters \\\"(.*)\\\", \\\"(.*)\\\", \\\"(.*)\\\", and \\\"(.*)\\\"$")
	public void user_enters_and(String first_name, String last_name, String middle_name, String company_name) {
	 
		erpcontact.erp_add_conatct_details(first_name, last_name, middle_name, company_name);

	}





}
