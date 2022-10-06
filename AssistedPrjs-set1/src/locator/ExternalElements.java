package locator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExternalElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\seleniumtools\\chromedriver_win32\\chromedriver.exe");
		
		//To click on ‘OK’ button in pop up
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:5500/ph5-Ass-set1.html");
		
		driver.findElement(By.xpath("//*[@id='rgstr_btn']")).click();
		
		Alert alertRef = driver.switchTo().alert(); // give the alert box reference
		System.out.println(alertRef.getText()); // alert box content
		alertRef.accept(); // click ok bututon of alert box
		driver.close(); // close the application.
		
		//To click on ‘Cancel’ button in pop up   
//		driver.switchTo().alert().dismiss();
		
		//To Capture the alert message
//		driver.switchTo().alert().getText();
		
		//To enter the information
//		driver.switchTo().alert().sendKeys("text");
		
//		To exit from the popup
//		driver.close();
		
//		//Opening new tab
//		driver.findElement(By.id("xyz")).sendKeys(Keys.CONTROL + "t");
//		
//		//Opening new window
//		driver.findElement(By.id("xyz")).sendKeys(Keys.CONTROL + "w");
		

	}

}
