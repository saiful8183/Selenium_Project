package seleniumwebdriver;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTextERrorMessagePopup {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saiful Chowdhury\\OneDrive\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
//		driver.get("https://gcreddy.com/project/login.php");
//		
//		Capturing link\\
//		
//		WebElement footerText =driver.findElement(By.xpath("//*[@id=\"bodyWrapper\"]/div[6]/p"));
//	      
//		
//		System .out.println(footerText.getText());
//		
//		driver.findElement(By.xpath("//*[@id=\"tdb1\"]/span[2]")).click();
//		
//		
		
		
		
		
		
		//Capturing error message
		
		
		
//		WebElement errorMessage =driver.findElement(By.className("messageStackError"));
//		
//	String message=	errorMessage.getText();
//		
//	System .out.println("The error message is:"+message);
//	
//	
	
	
	
	
	
	
	
	
	
	//Nevigate to another url to handle alart.
	
	
	
	driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		
		
	Thread.sleep(1000);
		
	
	
	
	
	//Capturing alart and Handle the alart
	
	
	Alert popup=driver.switchTo().alert();
		
		System.out.println(popup.getText());
		popup.accept();
		
		
		//Thread.sleep(1000);
		//driver.quit();
	}

}
