package locator;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoIt {

	
	public static void main(String[] args) throws IOException, InterruptedException{
		 
		     
		     System.setProperty("webdriver.gecko.driver", "C:\\tools\\seleniumtools\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		     WebDriver driver = new FirefoxDriver();
		     driver.manage().window().maximize();  
		     driver.get("https://opensource-demo.orangehrmlive.com/");       // Testing webpage
		 
		     WebElement browser = driver.findElement(By.xpath("//input[@id='pimCsvImport_csvFile']"));   //Browse button
		     browser.click();                                
		     System.out.println("1");
		  
		  
		     Runtime.getRuntime().exec("C:\\tools\\seleniumtools\\FileUpload.exe");
		     System.out.println("2");
		     Thread.sleep(3000);
		  
		     WebElement upload = driver.findElement(By.id("btnSave"));            //Upload button
		     upload.click();
		     System.out.println("3");     
		   
		     System.out.println("File Uploaded Successfully");   

	}

}
