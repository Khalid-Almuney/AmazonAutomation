import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) throws InterruptedException {
	String projectpath=System.getProperty("user.dir");
		
	System.setProperty("webdriver.chrome.driver",projectpath+"/drivers/chromedriver/chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
		
	driver.get("https://www.amazon.com/");
	
	WebElement SearchBox=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	WebElement SearchButton=driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
	
	SearchBox.sendKeys("IPHONE");
	SearchButton.click();
	
	System.out.println("these are Types of Iphone");
	
	System.out.print("completed");
	
	Thread.sleep(3000);
	
	driver.close();
	
	}
}
