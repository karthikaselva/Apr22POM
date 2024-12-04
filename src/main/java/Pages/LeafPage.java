package Pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafPage {
  static WebDriver driver;

	public static void main(String[] args) {
		ChromeOptions chromeoption=new ChromeOptions();
		  chromeoption.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeoption);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		

 //driver.findElement(By.xpath("//*[text()='Open with delay']")).click();
 System.out.println(driver.getTitle());
 WebElement elt = driver.findElement(By.xpath("//*[text()='Images']"));

//Get text 
 System.out.println(elt.getText());
 
/* Set <String> allWindowHandles = driver.getWindowHandles();
 String parentWindowHandle = driver.getWindowHandle();

 for (String windowhandle: allWindowHandles)
 {
   
	if(!windowhandle.equals(parentWindowHandle)) {
       

 driver.switchTo().window(windowhandle);
 driver.close();*/ 
		
     }

}
