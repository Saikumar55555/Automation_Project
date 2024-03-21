package Task2;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

public class AddingCart_to_the_Product {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		 //Get TittleName
		String getpage = driver.getTitle();								      
		if(getpage.equals("Demo Web Shop")) {
			System.out.println("Entered a Correct Web Page = " + getpage);
		}
		else {
			System.out.println("Check Once Your Url");
		}
		
		//Clicking to the login Page
		
		driver.findElement(By.xpath("//a[@class=\"ico-login\"]")).click();
		
		//The Web Page has to Wait Certain Amount Of time (3000LongSec = 3Sec)
		Thread.sleep(3000);
		
		//Giving Correct Credentials and then Login to Web Page
		
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("mynameismike@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("@#$aikumar123");
		driver.findElement(By.xpath("//div[@class=\"buttons\"]/input[@type=\"submit\"]")).submit();
		
		Thread.sleep(3000);
		
		//Go to Apparel & Shoes category and click on Casual Golf Belt, Add it to the Cart
		
		
		
		
		//We Have to TakeScreenShot at the end
		
	   File srcfile3 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(srcfile3, new File("C:\\\\Users\\\\RS-EMP\\\\eclipse-workspace\\\\AutomationProject\\\\Screenshot\\\\CartCompleted1243.jpg"));
		
	}
	

	 

}
