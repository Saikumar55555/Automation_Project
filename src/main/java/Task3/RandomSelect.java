package Task3;

import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

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


		WebElement element = driver.findElement(By.id("small-searchterms"));
		element.sendKeys("Build");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@id=\"ui-id-2\"]")).click();

		//Scroll Upto 300Px
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300);");
		Thread.sleep(3000);

		//Computer
		driver.findElement(By.cssSelector("[for=\"product_attribute_72_5_18_65\"]")).click();
		driver.findElement(By.cssSelector("[id=\"product_attribute_72_6_19_91\"]")).click();
		driver.findElement(By.cssSelector("[id=\"product_attribute_72_3_20_58\"]")).click();
		driver.findElement(By.cssSelector("[id=\"product_attribute_72_8_30_93\"]")).click();
		driver.findElement(By.cssSelector("[id=\"product_attribute_72_8_30_94\"]")).click();
		driver.findElement(By.cssSelector("[id=\"product_attribute_72_8_30_95\"]")).click();
		WebElement ele = driver.findElement(By.xpath("//input[@value=\"1\"]"));
		ele.clear();
		ele.sendKeys("3");
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-72']")).click();
		JavascriptExecutor sj = (JavascriptExecutor)driver;
		sj.executeScript("window.scrollBy(0,-500);");



		//Click Jewerly and Adding a random product to the cart
		//Jewelry
		WebElement nun = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		nun.sendKeys("Jewelry");
		driver.findElement(By.xpath("//a[@class=\"ui-corner-all\"]")).click();
		JavascriptExecutor a = (JavascriptExecutor)driver;
		a.executeScript("window.scrollBy(0,300);");
		Select sel = new Select(driver.findElement(By.xpath("//select[@id=\"product_attribute_71_9_15\"]")));
		sel.selectByValue("46");
		driver.findElement(By.xpath("//input[@id=\"product_attribute_71_10_16\"]")).sendKeys("25cm");
		driver.findElement(By.id("product_attribute_71_11_17_49")).click();
		WebElement b = driver.findElement(By.xpath("//input[@id=\"addtocart_71_EnteredQuantity\"]"));
		b.clear();b.sendKeys("3");
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-71']")).click();

		//Adding all those Products to the Cart
		driver.findElement(By.xpath("//a[@class=\"ico-cart\"]//span[@class=\"cart-qty\"]")).click();




	}
}
