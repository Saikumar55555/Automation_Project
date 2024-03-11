package LoginUsingPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginPage {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login/");
		
		String S1 = "sairootshell@gmail.com";
		String S2 = "sairootshell@gmail.com";
		String S3 = "@#$aikumar123";
		String S4 = "@#$aikumar123";
		if(S1 == S2) {
			if(S3 == S4) {
			
			driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("sairootshell@gmail.com");
			driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("@#$aikumar123");
			driver.findElement(By.xpath("//div[@class=\"buttons\"]/input[@type=\"submit\"]")).submit();
			}
			else {
				System.out.println("Please Check");
			}
		}
		else {
			System.out.println("Please Check Your Email Id");
		}
		 
	}

	
		
	
}
		 
		 
		 
		


