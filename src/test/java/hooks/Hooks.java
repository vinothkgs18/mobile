package hooks;

import java.util.concurrent.TimeUnit;

import Base.Base;
import Pojo.HomePage;
import io.cucumber.java.Before;

public class Hooks extends Base {
	@Before
	public void homePage() {
		getDriverAcces();
		LaunchUrl("https://www.flysas.com/en/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePage h= new HomePage();
		click(h.getClose());
		
	}
}
