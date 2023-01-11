package seleniumwebdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWebTable {

	public static void main(String[] args) {
       
		
		
//		
//		System.setProperty("webdriver.chrome.driver",
//		"C:\\Users\\Saiful Chowdhury\\OneDrive\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
//		
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		
//		driver.get("https://www.timeanddate.com/worldclock/?continent=namerica");				
//		
//		
//		//List<WebElement>rows=driver.findElements(By.xpath  //List is a class,webElement is DataType					
//			//	("//table[@class='zebra fw tb-theme']/tbody/tr"));//This is giving us list of all the rows					
//		
//		
//		
//		List<WebElement>rows=driver.findElements(By.xpath("//table[@class='zebra fw tb-theme']/tbody/tr"));
//		int totalrows=rows.size();
//		System.out.println("Total rows is:"+totalrows);
//		
//		
//		List<WebElement>columes=driver.findElements(By.xpath("//table[@class='zebra fw tb-theme']/tbody/tr[1]/td"));
//	    int totalcolumns=columes.size();
//	    System.out.println("Total columns is:"+totalcolumns);
//		
//		
//		
//		
//		
//		
//		
//		
//        for(int i=1;i<=totalrows;i++) {
//        	driver.findElements(By.xpath("//table[@class='zebra fw tb-theme']/tbody/tr"));
//        for(int j=1;j<=totalcolumns;j++) {					
//        	driver.findElements(By.xpath("//table[@class='zebra fw tb-theme']/tbody/tr[1]/td"));									
//  					
//      }					
//        System.out.println();					
//        System.out.println("==========");					
//     }					
//        System.out.println("North Amarica Time is captured");					
//       }					
//					
//      }
//
//

		
		
		
		
		
		
		
		
		
		
					

		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Saiful Chowdhury\\OneDrive\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
			
		
							
					
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));					
 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));					
					
 driver.get("https://www.timeanddate.com/worldclock/?continent=namerica");					
					
 //Find out rows					
					
 List<WebElement>rows=driver.findElements(By.					
 xpath("//table[@class='zebra fw tb-theme']/tbody/tr"));					
 int totalRows=rows.size();					
 System.out.println("Total rows of the table are:"+totalRows);					
					
 
//Find out column
 
 List<WebElement>columns=driver.findElements(By.					
 xpath("//table[@class='zebra fw tb-theme']/tbody/tr[1]/td"));					
 int totalColumns=columns.size();					
 System.out.println("Total columns in this table are:"+totalColumns);					
					
 
 
 
 for(int i=1;i<=totalRows;i++) { for(int j=1;j<=totalColumns;j++) {					
					
 String value=driver.findElement(By.					
 xpath("//table[@class='zebra fw tb-theme']/tbody/tr["+i+"]/td["+j+"]")).					
 getText(); System.out.println(value + " ");					
					
 }					
					
 System.out.println(); System.out.println("================");					
					
 }					
					
 System.out.println("North Amarice Time is captured");					
					
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		