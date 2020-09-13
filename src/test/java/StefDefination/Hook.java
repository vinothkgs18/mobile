package StefDefination;

import java.util.concurrent.TimeUnit;

import Base.Base;
import Pojo.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends Base{
	
	@Before
	public void launchBrowser() {
		System.out.println("Before Hooks");
		getDriverAcces();
		//getDriverAccesFireFox();
		LaunchUrl("https://www.flysas.com/en/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePage h= new HomePage();
		click(h.getClose());
	}
	
	@After
	public void quitebrowser() {
		System.out.println("After Hooks");
		driver.quit();
	}

}
