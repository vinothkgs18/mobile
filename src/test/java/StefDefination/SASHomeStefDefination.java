package StefDefination;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import Base.Base;
import Pojo.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SASHomeStefDefination extends Base {
	HomePage h= new HomePage();
	@Given("user is on home page")
	public void user_is_on_home_page() {
	  System.out.println("Hooks");
	  
	}
	
	

	@When("user has enter the username and password")
	public void user_has_enter_the_username_and_password(DataTable table) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		click(h.getLogin());
		
		List<Map<String, String>> mp = table.asMaps();
		for(int i=0;i<mp.size();i++) {
			Map<String, String> map = mp.get(i);
			String string = map.get("userName");
			String string2 = map.get("Password");
			
			
		fill(h.getUsr(), string);
		fill(h.getPass(), string2);
		System.out.println(string);
		System.out.println(string2);
		click(h.getLogbut());
	
		List er= new ArrayList<>();
		er.add("Sorry, we couldn't find you with this login ID and password combination. Please try again.");
		er.add("Unfortunately, your account has been locked. To unlock it, please use the Forgot password link.");
	
			for(int j=0;j<=er.size()-1;j++) {	
		//Assert.assertEquals(er.get(j), getText(h.getError()));
				Assert.assertEquals(getText(h.getError()), er.get(j));
			}
			
		h.getUsr().clear();
		h.getPass().clear();
			
		
		}
	}

	@Then("user getting error message")
	public void user_getting_error_message() {
		
		
	}

	@When("user has check the panner text")
	public void user_has_check_the_panner_text() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*HomePage h= new HomePage();*/
		Assert.assertEquals(getText(h.getStravel()),"SAS SAFE TRAVEL");
	    
	}

	@When("user has check the panner link")
	public void user_has_check_the_panner_link() {
		/*HomePage h= new HomePage();*/
		click(h.getSoi());
		Assert.assertEquals(driver.getTitle(), "SAS Safe Travel – Safety and well-being on board | SAS");
	   System.out.println("user has check the panner link \\t verified");
	   
	}

	@When("user has click the all submenu")
	public void user_has_click_the_all_submenu() {
		
		/*HomePage h= new HomePage();*/
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		mouseover(h.getBook());
		click(h.getCalander());
		Assert.assertEquals("https://www.flysas.com/en/low-fare-calendar/", driver.getCurrentUrl());
		mouseover(h.getBook());
		click(h.getYouthTickets());
		Assert.assertEquals("https://www.flysas.com/en/fly-with-us/youth-tickets/", driver.getCurrentUrl());
		mouseover(h.getBook());
		click(h.getuMiror());
		Assert.assertEquals("https://www.flysas.com/en/fly-with-us/unaccompanied-minors/", driver.getCurrentUrl());
	    System.out.println("user has click the all submenu");
	   
	}

}
