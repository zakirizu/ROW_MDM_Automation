package factory;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReport {
	public static ExtentSparkReporter reporter;
	public static ExtentReports extent;
	public static ExtentReports extendReportsUtils() {
		String Reportspath 				= factory.Constants.REPORTS;
		String Env 							= factory.Constants.Environment;
		
		reporter 	= new ExtentSparkReporter(Reportspath);
		reporter.config().setDocumentTitle("Bluestone Automation");
		reporter.config().setReportName("Orange HRM Application");
		reporter.config().setTheme(Theme.STANDARD);
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);	
		extent.setSystemInfo("Application", "Orange HRM");
		extent.setSystemInfo("Manager Name", "Zakir Hussain Shaik");
		extent.setSystemInfo("Tester Name", "Bluestone Student");
		extent.setSystemInfo("Environment", Env);
		
		return extent;
		
	}
	

}
