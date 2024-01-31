package com_stepdefinition;


import org.junit.Assert;


import com_BasePage_ERP.Basepage_erp;
import com_ERP_Pages.ERP_ContactPage;
import com_ERP_Pages.ERP_Homepage;
import com_ERP_Pages.ERP_Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Step_Homepage extends Basepage_erp {

	ERP_Login erp_login;
	ERP_Homepage erp_homepage= new ERP_Homepage();
	ERP_ContactPage erpcontact;
	
	
	
	public Step_Homepage() {
		
		this.erp_homepage = new ERP_Homepage();
	}


	@Given("User should be rediredt to homepage")
	public void user_should_be_rediredt_to_homepage() {

	
		String homepagetitle = erp_homepage.validate_erphomepagetitle();
		Assert.assertEquals("Cogmento CRM", homepagetitle);
	}

	@Then("User clicks on the create contact button")
	public void user_clicks_on_the_create_contact_button() {
		
		
		erpcontact = erp_homepage.erp_validatecontact_link();
		erp_homepage.erp_validatenewcontact_butn();
	}



	
}
