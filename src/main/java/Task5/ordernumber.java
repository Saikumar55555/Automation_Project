package Task5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ordernumber {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[@class=\"ico-login\"]")).click();
		
		//The Web Page has to Wait Certain Amount Of time (3000LongSec = 3Sec)
		Thread.sleep(3000);
				
		//Giving Invalid Email and Valid Password
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("saikuasicb@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("@#$QWEasd");
		driver.findElement(By.xpath("//input[@id=\"RememberMe\"]")).submit();
		
		driver.get("https://demowebshop.tricentis.com/customer/orders");
		
		//this is the another one xpath of for order number 
		WebElement ordernum2 = driver.findElement(By.xpath("(//div[@class=\"title\"])[2]"));
		String order2 = ordernum2.getText();				
		System.out.println(order2);
	}

}
