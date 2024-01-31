package com_ERP_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_BasePage_ERP.Basepage_erp;


public class ERP_Login extends Basepage_erp {

	//1.Page Factory or Object Repo
	
	@FindBy (name = "email")
	WebElement user_email;

	@FindBy(name= "password")
	WebElement user_password;
	
	@FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
	WebElement login_button;
	
	
	public ERP_Login() {
		
		PageFactory.initElements(driver, this);

		//"driver" here driver is use for initialize browser for all WebElement that we initialize above with @FindBy
		//"this"   here this is for refer/pointing  to current class object
	}
	
	//3.Action
	

	public void erp_login(String user_name_erp, String user_pass_erp) {
		
		user_email.sendKeys(user_name_erp);
		user_password.sendKeys(user_pass_erp);
		
	}
	
	public ERP_Homepage erp_button() {
		
		login_button.click();
		return new ERP_Homepage();
	}
}


/*


public ERP_Homepage erp_login(String user_name_erp, String user_pass_erp) {
	
	user_email.sendKeys(user_name_erp);
	user_password.sendKeys(user_pass_erp);
	login_button.click();
	return new ERP_Homepage();

*/