package Task6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModificationsOfProduct {
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
		
		//Type Computers In Search Box
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

		//Adding all those Products to the Cart
		driver.findElement(By.xpath("//a[@class=\"ico-cart\"]/span[contains(text(),'Shopping cart')]")).click();
		
		
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
		
		//Printing the Specifications of a Computer(1st time Printing)
		WebElement web1 = driver.findElement(By.xpath("//a[@class='product-name']"));
		String a1 = web1.getText();
		//System.out.println(a1);
		WebElement web2 = driver.findElement(By.xpath("//td[@class='product']//div[@class='attributes']"));
		String b1 = web2.getText();
		//System.out.println(b1);
		
		//Printing the Features Of Jewelry (1st time Printing)
		WebElement web3 = driver.findElement(By.xpath("(//a[@class='product-name'][normalize-space()='Create Your Own Jewelry'])[1]"));
		String c1 = web3.getText();
		System.out.println("     ");
		//System.out.println(c1);
		//WebElement web4 = driver.findElement(By.xpath("//td[@class='product']//div[@class='attributes'][normalize-space()='Material: Gold (1 mm)Length: 25cmPendant: Heart']"));
		//String d1 = web4.getText();
		//System.out.println(d1);
		
		//Now We have to Modify the Computer features 
		driver.findElement(By.xpath("(//div[@class=\"edit-item\"]/a[contains(text(),'Edit')])[1]")).click();
		WebElement xy2 = driver.findElement(By.id("product_attribute_72_5_18_53"));
		xy2.click();
		WebElement xy3 = driver.findElement(By.id("product_attribute_72_6_19_55"));
		xy3.click();
		WebElement xy4 = driver.findElement(By.id("product_attribute_72_3_20_57"));
		xy4.click();
		WebElement xy5 = driver.findElement(By.xpath("//input[@id='product_attribute_72_8_30_93']"));
		xy5.click();
		JavascriptExecutor are = (JavascriptExecutor)driver;
		are.executeScript("window.scrollBy(0,200);");
		WebElement xy6 = driver.findElement(By.id("product_attribute_72_8_30_94"));
		xy6.click();
		driver.findElement(By.xpath("//input[@id=\"add-to-cart-button-72\"]")).click();
		
		//Adding all those Products to the Cart
		driver.findElement(By.xpath("//a[@class=\"ico-cart\"]/span[contains(text(),'Shopping cart')]")).click();
		
		//Printing Computer Data
		WebElement data =	driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div[1]"));
		String Modify1 = data.getText();
		System.out.println(a1+">>>>>>>");
		System.out.println("    ");
		System.out.println(Modify1);
		
		//Now We have to Modify the Jewelry Details 
		driver.findElement(By.xpath("(//div[@class=\"edit-item\"]/a[contains(text(),'Edit')])[2]")).click();
		WebElement element1 = driver.findElement(By.xpath("//input[@id=\"product_attribute_71_10_16\"]"));
		element1.clear();
		element1.sendKeys("30cm");
		WebElement element2 = driver.findElement(By.xpath("//input[@id=\"product_attribute_71_11_17_50\"]"));
		element2.click();
		WebElement b11 = driver.findElement(By.xpath("//input[@id=\"addtocart_71_EnteredQuantity\"]"));
		b11.clear();b11.sendKeys("3");
		driver.findElement(By.xpath("//input[@id=\"add-to-cart-button-71\"]")).click();

		
		//Adding all those Products to the Cart
		driver.findElement(By.xpath("//a[@class=\"ico-cart\"]/span[contains(text(),'Shopping cart')]")).click();
		
		//Printing the Jewelry Product
		WebElement out = driver.findElement(By.xpath("//td[@class='product']//div[@class='attributes'][normalize-space()='Material: Gold (1 mm)Length: 30cmPendant: Star']"));
		String out1 = out.getText();
		System.out.println(" ");
		System.out.println(c1+">>>>>>>>");
		System.out.println("   ");
		System.out.println(out1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
