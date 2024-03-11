package Task5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class geturl {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String url = "https://demowebshop.tricentis.com/";
		driver.get(url);
	}

}
