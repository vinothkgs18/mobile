package StefDefination;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReports {
	public static void generateReports(String jason) {
		File f=new File("C:\\Users\\bebom\\eclipse-workspaces-new\\AfterLockDown\\CucumberSAS\\JVMReports");
		Configuration con=new Configuration(f,"JVM Reports");
		con.addClassifications("Browser", "Chrome");
		con.addClassifications("Browser Version", "Chrome 79.0.3945.36");
		con.addClassifications("Platform", "Windows");
		con.addClassifications("Sprint", "1");
		List<String>li=new ArrayList();
		li.add(jason);
		ReportBuilder r=new ReportBuilder(li, con);
		r.generateReports();
		

	}

}
