package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureErrorMessage {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\"
	+ "Users\\Saiful Chowdhury\\OneDrive\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
         driver.get("https://gcreddy.com/project/login.php");
         
         driver.findElement(By.xpath("//*[@id=\"tdb1\"]/span[2]")).click();
         
        WebElement erroemessage= driver.findElement(By.className("messageStackError"));
      // String message=erroemessage.getText();
      //   System.out.println("The error message is:"+message);
         
         
        System.out.println(erroemessage.getText());
      
         

	}

}
