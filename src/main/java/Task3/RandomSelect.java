package Task3;

import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RandomSelect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		//Clicking to the login Page
		
		driver.findElement(By.xpath("//a[@class=\"ico-login\"]")).click();
				
		//The Web Page has to Wait Certain Amount Of time (3000LongSec = 3Sec)
		Thread.sleep(3000);
				
		//Giving Correct Credentials and then Login to Web Page
				
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("masthshadesunyai@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("@#$aikumar123");
		driver.findElement(By.xpath("//div[@class=\"buttons\"]/input[@type=\"submit\"]")).submit();
				
		Thread.sleep(3000);
		
	//Click Books Category and Adding a random product to the cart
		
		
		driver.findElement(By.xpath("//li[@class=\"inactive\"]//a[normalize-space()=\"Books\"]")).click();
		
		Random ran = new Random();
		List<WebElement> Product = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		int var = Product.size();
		int list = ran.nextInt(var);
		Product.get(list).click();
		
		//Thread.sleep(3000);
		
		
			
	//Click Jewerly and Adding a random product to the cart
		
		/*driver.findElement(By.xpath("//li[@class=\"active\"]/a[normalize-space()='Digital downloads']")).click();
		
		Random ran1 = new Random();
		List<WebElement> productsone = driver.findElements(By.xpath("(//input[@type=\"button\"])[3]"));
		int var1 = productsone.size();
		int a = ran1.nextInt(var1);
		productsone.get(a).click();*/
		
		//Thread.sleep(2000);
		
		
	//driver.findElement(By.xpath("//span[@class=\"cart-label\"]")).click();
		
		driver.findElement(By.xpath("//a[@class=\"ico-cart\"]/span[normalize-space()='Shopping cart']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]")).click();
		//driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@name=\"updatecart\"]")).click();
		
		
		
		
		
	}
}
