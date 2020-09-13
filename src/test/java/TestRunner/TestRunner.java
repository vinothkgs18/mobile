package TestRunner;





import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;

import StefDefination.JVMReports;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/resources/SASHome.feature",glue="StefDefination",monochrome=true)
public class TestRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
	/*@AfterClass
	public static void reports() {
		JVMReports.generateReports("target/jsonreports.json");
	}*/

}
