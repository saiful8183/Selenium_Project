package seleniumwebdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlartCapture {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\"
	+ "Users\\Saiful Chowdhury\\OneDrive\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
         driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
         
         
         driver.findElement(By.name("proceed")).click();
//         
//         Alert popup=driver.switchTo().alert();
//        System.out.println(popup.getText());
//        popup.accept();
//        
        
//         
//        Alert popup= driver.switchTo().alert();
//         
//        System.out.println(popup.getText());
//        popup.accept();
//         
//         Thread.sleep(1000);
//         driver.quit();
         
         
       Alert popup= driver.switchTo().alert();
       System.out.println(popup.getText());
       popup.accept();
       driver.quit();
   
   
   
   
   
   
   
   
   
         
         
         
	}

}
