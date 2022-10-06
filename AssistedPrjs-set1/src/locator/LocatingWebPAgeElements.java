package locator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingWebPAgeElements {
	public static void main(String[] args) {

		WebDriver wd = null;

		System.setProperty("webdriver.chrome.driver", "C:\\tools\\seleniumtools\\chromedriver_win32\\chromedriver.exe");
		wd = new ChromeDriver();

		wd.manage().window().maximize();
		wd.get("http://localhost:5500/ph5-Ass-set1.html");
		String sourceCurrentPagePath = wd.getCurrentUrl();
		System.out.println("sourceCurrentPagePath:  " + sourceCurrentPagePath);
//		Registration form
 
//		Using ID as a Locator
//		Finding  Web element using Locator ID
		WebElement nameRef = wd.findElement(By.id("n"));
		nameRef.sendKeys("sai");

//		Using class name as a Locator
//		Finding  Web element using Locator ClassName
		WebElement ageRef = wd.findElement(By.className("age"));
		ageRef.sendKeys("20");

//		Using Name as a Locator
//		Finding  Web element using Locator Name
		WebElement emailIDRef = wd.findElement(By.name("email"));
		emailIDRef.sendKeys("sai@gmail.com");
		

//		Using Xpath as a Locator
//		Finding  Web element using Locator Xpath 
		wd.findElement(By.xpath("//*[@id='pw']")).sendKeys("123");
		wd.findElement(By.xpath("//*[@id='rgstr_btn']")).click();
//
//
		Alert alertRef = wd.switchTo().alert(); // give the alert box reference
		System.out.println(alertRef.getText()); // alert box content
		alertRef.accept();  // click ok bututon of alert box
		
//		Using LinkText as a Locator
//		Finding  Web element using Locator Link Text
		wd.findElement(By.linkText("Click here")).click();


//      Reset button 
//		WebElement resetButtonRef = wd.findElement(By.id("b"));
//		resetButtonRef.click();

	}

}
