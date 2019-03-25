package summaclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class Ajex {
	
	@Test
	public  void example() throws IOException
    {
    		File source = new  File("C:\\Users\\VISHNU\\Desktop\\DDT.xlsx");
		  
		  FileInputStream Excel = new FileInputStream(source);
		  
		  //Accessing Excel file 
		  XSSFWorkbook wb = new XSSFWorkbook(Excel);
		  
		  //Directing to Sheet in excel 
		  XSSFSheet sheetnumber = wb.getSheetAt(0);
		  
		  //Read total number of rows in sheet 
		  int rowcount = sheetnumber.getLastRowNum();
		  
		  System.out.println("Total number of rows : " + rowcount);
		  
		  Assert.assertEquals(3,rowcount);
		  
		  String zzz = Integer.toString(rowcount);
		  
		  System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDrivers\\chromedriver_win32\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver(); 
		  driver.get("https://www.yahoo.com");
		  driver.findElement(By.id("uh-search-box")).sendKeys(zzz);
		  
    }
}
