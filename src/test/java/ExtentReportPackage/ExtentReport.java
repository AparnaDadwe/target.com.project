package ExtentReportPackage;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ExtentReport {
	@Test
	public void method1() {
		System.out.println("This is Method 1...................");
		Assert.assertTrue(true);
	}
	@Test
	public void method2() {
		System.out.println("This is Method 2...................");
		Assert.assertTrue(true);
	}
	
	@Test
    public void method3() {
		System.out.println("This is Method 3...................");
		Assert.assertTrue(false);
	}
	
	@Test

    public void method4() {
		System.out.println("This is Method 4...................");
		Assert.assertTrue(false);
	}
    
    @Test
    public void method5() {
    	System.out.println("This is Method 5...................");
    	//for skipped there is exception SkippedException 
    	  throw new SkipException("Test Skipped ");
	
    }

}
