package com_BasePage_ERP;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com_UtilityPage_ERP.TestUtils_erp;

public class Basepage_erp {


	public static WebDriver driver;
	public static Properties prop;

	

	
	//Super class Constructor
	public Basepage_erp() {

		try {

			prop = new Properties();
			FileInputStream ip=new FileInputStream("C:\\Users\\info\\eclipse-workspace\\CRM_CucumberBDD_POM_Maven\\src\\main\\java\\com_qa_ConfigureProperties\\config.properties");
			prop.load(ip);	

		}catch (FileNotFoundException e) {


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	// Initializing / Invoke browser
	@SuppressWarnings("deprecation")
	public static void initialize() {

		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
		}



		//Waits
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtils_erp.Page_LOAD_TIMEOUTS, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils_erp.IMPLICIT_WAITS,TimeUnit.SECONDS);


		driver.get(prop.getProperty("url"));
	}
}
