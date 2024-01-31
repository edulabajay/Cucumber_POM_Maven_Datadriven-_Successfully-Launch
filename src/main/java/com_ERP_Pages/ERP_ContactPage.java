package com_ERP_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_BasePage_ERP.Basepage_erp;

public class ERP_ContactPage extends Basepage_erp {

	//1.Page 	Factory or Object Repo


	@FindBy(xpath="//input[@name='first_name']")
	WebElement erp_firstname;

	@FindBy(xpath="//input[@name='last_name']")
	WebElement erp_lastname;

	@FindBy(xpath="//input[@name='middle_name']")
	WebElement erp_middlename;

	@FindBy(xpath="//div[@name='company']//input[@type='text']")
	private WebElement erp_companyname;

	@FindBy(xpath="//div[@name='status']//i[@class='dropdown icon']")
	private WebElement erp_status_dropdown;

	@FindBy(xpath = "//button[@class='ui linkedin button']")
	private WebElement erp_save_btn;



	//2.driver and this for current class reference
	public ERP_ContactPage() {
		PageFactory.initElements(driver, this);

		//"driver" here driver is use for initialize browser for all WebElement that we initialize above with @FindBy
		//"this"   here this is for refer/pointing  to current class object
	}



	//3.Action 



	public String validate_erpcontactpagetitle() {
		return driver.getTitle();
	}

	public void erp_add_conatct_details(String first_name, String last_name, String middle_name, String company_name) {
		erp_firstname.sendKeys(first_name); 
		erp_lastname.sendKeys(last_name);
		erp_middlename.sendKeys(middle_name);
		erp_companyname.sendKeys(company_name);
		erp_save_btn.click();

	}

}
