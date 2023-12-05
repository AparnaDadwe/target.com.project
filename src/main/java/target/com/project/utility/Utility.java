package target.com.project.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {
	
	public static WebDriver getDriver() {
		
		WebDriver driver=new ChromeDriver();
		return driver;
	}
	
	public static String getProperty(String key) {
		File file=new File("src/test/resources/config.properties");
		FileInputStream fileInputStream=null;
		try {
			fileInputStream= new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties properties= new Properties();
		try {
			properties.load(fileInputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties.getProperty(key);
	  
		
	}
	public static  void clickElementByJs(WebDriver driver, WebElement element) {
		//click action
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);	
		
	}
	
	
	public static void implicitWaitFunction(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}
	public static List<String> readExcelFile() throws IOException {

		File file = new File("src/test/resources/registration.xls");

		FileInputStream fileInputStream = new FileInputStream(file);

		List<String> userRegistrationDetails = new ArrayList<String>();

		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(fileInputStream);
	

		HSSFSheet sheet = hssfWorkbook.getSheetAt(0);

		int lastRowNumber = sheet.getLastRowNum();

		int lastCellNumber = 0;

		for (int i = 1; i <= lastRowNumber; i++) {
			HSSFRow row = sheet.getRow(i);// ek ek row iterate hoga
			lastCellNumber = row.getLastCellNum(); // row ke andar cell hote hai isliye getLastCellNum() method
			for (int j = 0; j < lastCellNumber; j++) // it will iterate all cell inside the row
			{

				userRegistrationDetails.add(row.getCell(j).getStringCellValue());
				
//				switch(cell.getCellType()) {
//		  		  case
//		  		  STRING:System.out.print(cell.getStringCellValue()+"   ");
//		  		  break; 
//		  		  case
//		  		  NUMERIC:System.out.print(cell.getNumericCellValue()+"  ");
//		  		  break; 
//		  		  case
//		  		  BOOLEAN:System.out.print(cell.getBooleanCellValue()+" "); 
//		  		  }

			}
		}
		return userRegistrationDetails;
	}

	
	public static void getScreenShot(WebDriver driver , String screenshotName) {
		
		TakesScreenshot takeScreenShot=(TakesScreenshot) driver;
		File srcfile=takeScreenShot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile, new File("src/test/resources/screenshots/"+ screenshotName +".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


