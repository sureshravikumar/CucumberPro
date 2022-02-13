package org.jvm;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void jvmReportGenerate(String jsonpath) {
		File f = new File("C:\\Users\\Suresh\\eclipse-workspace\\MavenCucum\\Reports\\JVMReport");
		Configuration c = new Configuration(f, "FaceBook Application");
		c.addClassifications("Browser", "Chrome");
		c.addClassifications("Platform", "Windows");
		c.addClassifications("Framework", "Cucumber");
		List<String> l = new LinkedList<String>();
		l.add(jsonpath);
		ReportBuilder r = new ReportBuilder(l, c);
		r.generateReports();
	}
}
