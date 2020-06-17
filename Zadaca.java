package nahla;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Bihac {

	public static void main(String[] args) {
		
	System.getProperty("webdriver.chrome.driver", 
	"C:\\Users\\Kodecta-PC\\Desktop\\Nahla_automation\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
		
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.get("https://nahla.ba/");
	driver.manage().window().maximize();
		
	driver.navigate().to("https://nahla.ba/");
	String URL = driver.getCurrentUrl();
	Assert.assertEquals(URL, "https://nahla.ba/", 
			"https://nahla.ba/");
	System.out.println(URL);

		
	driver.findElement(By.xpath("//*[@id=\"menu-item-29\"]/a")).click();
	String URL1 = driver.getCurrentUrl();
	Assert.assertEquals(URL1, "https://bihac.nahla.ba/", 
			"https://bihac.nahla.ba/");
	System.out.println(URL1);
	
	driver.navigate().back();
	String URL2 = driver.getCurrentUrl();
	Assert.assertEquals(URL2, "https://nahla.ba/", 
			"https://nahla.ba/");
	System.out.println(URL2);	
				
	driver.navigate().forward();
	String URL3 = driver.getCurrentUrl();
	Assert.assertEquals(URL3, "https://bihac.nahla.ba/", 
			"https://bihac.nahla.ba/");
	System.out.println(URL3);
		
	
	//driver.quit();
		
	}

}
