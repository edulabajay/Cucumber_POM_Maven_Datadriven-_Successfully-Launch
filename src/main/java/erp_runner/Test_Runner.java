package erp_runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(

features = "C:\\Users\\info\\eclipse-workspace\\ERP_CucumberBDD_PageObjectModel_Junit\\src\\main\\java\\com_erp\\contact_erp.feature",
glue = {"com_stepdefinition"},
plugin = {"pretty","html:test-output"},
monochrome=true, // to display console in  readable output
dryRun = false

)




public class Test_Runner {

}
