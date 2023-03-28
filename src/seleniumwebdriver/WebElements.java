package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElements {

	public static void main(String[] args) {

		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Saiful Chowdhury\\OneDrive\\Desktop\\Driver\\chromedriver.exe");





		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		
		
		WebElement fname=driver.findElement(By.name("firstname"));
		fname.sendKeys("Saiful");

		WebElement lname=driver.findElement(By.name("lastname"));
		lname.sendKeys("Chowdhury");
		
	   WebElement phone=driver.findElement(By.name("reg_email__"));
	   phone.sendKeys("3472386233");
	   
	  WebElement pass= driver.findElement(By.name("reg_passwd__"));
	   
	  pass.sendKeys("Chowdhury");
		
	  
	  
	
	  
	  
	  
	WebElement mon=	driver.findElement(By.name("birthday_month"));
	mon.sendKeys("september");
		
	WebElement day=	driver.findElement(By.name("birthday_day"));
		
	day.sendKeys("1");
		
		
	WebElement year=driver.findElement(By.name("birthday_year"));
	year.sendKeys("1983");
		
		
	  WebElement web=driver.findElement(By.className("_58mt"));web.click();
	
      Select selectBirth =new Select(driver.findElement(By.className("mtm mbs _2_68")));					
      selectBirth.getFirstSelectedOption(); //selectByVisibleText("September");					
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));					
	
		
		
		
		
		
	}

}
