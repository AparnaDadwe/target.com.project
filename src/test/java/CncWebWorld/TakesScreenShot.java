package CncWebWorld;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakesScreenShot {
@Test
	public void test1() throws IOException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		
		driver.manage().window().maximize();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File  src = ts.getScreenshotAs(OutputType.FILE);
		
		File des=new File("D:\\Eclipse Workspace\\target.com.project\\src\\test\\resources\\screenshots\\screnshot.png");
		
		FileUtils.copyFile(src, des);

	
	}
}
