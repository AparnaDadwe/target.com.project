package ExtentReportPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.reporters.SuiteHTMLReporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportListner implements ITestListener{
	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	
	
	public void configureReport() {
		//configure report
		
		htmlReporter= new  ExtentSparkReporter("ExtentReportSample.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		// Add environmental details
		reports.setSystemInfo("Hostname", "LocalHost");
		reports.setSystemInfo("OS", "Window10");
		reports.setSystemInfo("Testers name", "Aparna");
		reports.setSystemInfo("Browser", "Chrome Browser");
		
		//configuration for look and change

		htmlReporter.config().setDocumentTitle("Automation Report");//Title of the report
		htmlReporter.config().setReportName("Functional Report");//report name
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTimeStampFormat("EEEE , MMMM dd,yyyy,hh:mm a'('zzz')'");
	  }
	

	public void onTestStart(ITestResult result) {
		System.out.println("Name of the test method Start :" + result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Name of the test method Success :" + result.getName());
		test = reports.createTest(result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel("Test Case Success", ExtentColor.ORANGE));
		test.fail(result.getThrowable());
	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println("Name of the test method Failed :" + result.getName());
		test = reports.createTest(result.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed", ExtentColor.RED));
		test.fail(result.getThrowable());
		
	}

	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Name of the test method Skipped :" + result.getName());
		test = reports.createTest(result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.GREEN));
		test.skip(result.getThrowable());
		
	}
	public void onStart(ITestContext result) {
		configureReport();
		System.out.println("On Start method invoked........................");
	
	}

	public void onFinish(ITestContext result) {
		configureReport();
		System.out.println("On Finish method invoked........................");
		reports.flush();
	}

}
