package Task7;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompareList {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://demowebshop.tricentis.com/";
		driver.get(url);

		//Clicking to the login Button
		driver.findElement(By.xpath("//a[@class=\"ico-login\"]")).click();

		//The Web Page has to Wait Certain Amount Of time (3000LongSec = 3Sec)
		Thread.sleep(3000);

		//Giving Valid Email and Valid Password
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("saikuasicb@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("@#$QWEasd");
		driver.findElement(By.xpath("//input[@id=\"RememberMe\"]")).submit();
		
		//Clicking on the Computers	
		driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Computers')]")).click();
		driver.findElement(By.xpath("(//h2[@class='title'])[2]")).click();
		driver.findElement(By.xpath("//img[@alt=\"Picture of 14.1-inch Laptop\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"button-2 add-to-compare-list-button\"]")).click();
		
		//Printing the Name and Price
		WebElement ele = driver.findElement(By.xpath("//td[@class=\"a-center\"][normalize-space()='14.1-inch Laptop']"));
		String one = ele.getText();
		System.out.println("LapTop Name : "+one);
		WebElement ele1 = driver.findElement(By.xpath("//td[normalize-space()='1590.00']"));
		String two = ele1.getText();
		System.out.println("Price Of that Product : "+two);
		
		
		
		//New Page
		driver.switchTo().newWindow(WindowType.TAB);
		
		//Getting New Tab in that Same Window 
		String url1 = "https://demo.nopcommerce.com/";
		driver.get(url1);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//ul[@class=\"top-menu notmobile\"]//child::a)[1]")).click();
		driver.findElement(By.xpath("//img[@alt=\"Picture for category Desktops\"]")).click();
		Random ran = new Random();
		List<WebElement> list = driver.findElements(By.xpath("//div[@class=\"picture\"]"));
		int ranindex = list.size();
		int var = ran.nextInt(ranindex);
		list.get(var).click();
		driver.findElement(By.xpath("//button[@class=\"button-2 add-to-compare-list-button\"]")).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000);");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class='list']//a[contains(text(),'Compare products list')]")).click();
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,200);");
		WebElement ele2 = driver.findElement(By.xpath("//tr[@class=\"product-name\"]//child::a"));
		String st = ele2.getText();
		System.out.println("Computer Name : "+st);
		WebElement ele3 = driver.findElement(By.xpath("(//tr[@class=\"product-price\"]//child::td)[2]"));
		String st1 = ele3.getText();					
		System.out.println("Computer Name : "+st1);
		if(one == st) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}
}
