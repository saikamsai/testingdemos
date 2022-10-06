package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\seleniumtools\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    //Locating 'browse' button
	    WebElement browse = driver.findElement(By.id("uploadfile"));
	    //pass the path of the file to be uploaded using Sendkeys method
	    browse.sendKeys("C:\\tools\\seleniumtools\\sample.docx");
  
	}

}
