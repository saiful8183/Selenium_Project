package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLink {

	public static void main(String[] args) {
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Saiful Chowdhury\\OneDrive\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
//		
//		WebElement gmailLink=driver.findElement(By.linkText("Gmail"));
//		
//		boolean status=gmailLink.isDisplayed();
//		
//		System.out.println("Gmail link is displayed:"+status);
//		status=gmailLink.isEnabled();
//		System.out.println("Gmail link isenabled:"+status);
//		
//		String linkName=gmailLink.getText();
//		System.out.println("The link name is:"+linkName);
//		
//		gmailLink.click();
//		
//	System.out.println(driver.getTitle());	
//		
//	System.out.println(driver.getCurrentUrl());
//		
//		
//		
//		
		

		WebElement LinkText=driver.findElement(By.linkText("Gmail"));
		boolean status=LinkText.isDisplayed();
		System.out.println("The link is displays:"+status);
		
		status=LinkText.isEnabled();
		System.out.println("The link is enabled:"+status);
		
		String linkName=LinkText.getText();
		System.out.println("The link name is:"+linkName);
		
		LinkText.click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		
		
		
		
		
		
		
		
		
	}

}
