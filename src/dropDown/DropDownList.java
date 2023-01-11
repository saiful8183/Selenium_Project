package dropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class DropDownList {

	public static void main(String[] args) throws InterruptedException {
		

		
		
		
		
		
		                 // DroDown test
		
		
		
		
		
		
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saiful Chowdhury\\Downloads\\chromedriver_win32\\chromedriver.exe");
//       
//      ChromeDriver driver=new  ChromeDriver();
//      
//      driver.manage().window().maximize();
//      driver.get("https://www.wikipedia.org/");
//      
//      
//      
//      
//      List<WebElement>values=driver.findElements(By.tagName("option"));
//     int totalItems= values.size();
//     System.out.println("Total languages are:"+totalItems);
//      
//      
// 
//     
//     
//   List<WebElement>value= driver.findElements(By.tagName("a"));
//     int totalItem=value.size();
//     System.out.println("Total links under the page are:"+totalItem);
//      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
       //To find out DroDown itlms
       
       
    // List<WebElement> values=driver.findElements(By.tagName("option"));
    // int totalItems= values.size();
     //System.out.println("Total langues on the dropdown are:"+totalItems);
    // System.out.println(values.get(22).getText());
     
     
     //To print all 71
     
    // for(int i=0;i<totalItems;i++) {
     //System.out.println(values.get(i).getText());
     
     
     
     // //To find out total links
     
   //List<WebElement>value= driver.findElements(By.tagName("a"));
   //int totalItem=value.size();
   //System.out.println("Total links under the page are:"+totalItem);
     
     

//driver.close();
     
     
     
     
     
     
     
     
     
                                               // Headless test
     
     
     
     
     
     
     
//     System.getProperty("webdriver.chrome.driver","C:\Users\Saiful Chowdhury\Downloads\chromedriver_win32\chromedriver.exe");
//     		
//     
//     
//    ChromeOptions options=new  ChromeOptions();
//    options.setHeadless(true);
//     
//    WebDriver driver=new ChromeDriver(options);
//    // ChromeDriver driver=new ChromeDriver();
//     
//     driver.manage().window().maximize();
//     
//     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//     
//     
//     
//     
//     driver.get("https:/www.amazon.com/");
//     
//     System.out.println(driver.getTitle());
//     
     
     
     
     
	                                   	//Field Validation
		
		
		
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saiful Chowdhury\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://gcreddy.com/project/admin/login.php");
//		
		
//		
//
//		WebElement userName = driver.findElement(By.name("username"));
//	boolean status=	userName.isDisplayed();                   //returns 'Element' is display or not
//	System.out.println("The field is displayed:"+status);	
//	boolean condition=	userName.isEnabled();	
//	System.out.println("The field is enabled:"+condition);//returns 'Element' is enable or not
//		
//	String typeofInput=userName.getAttribute("type");
//	
//	System.out.println("The type field is :"+typeofInput);
//	
//	userName.sendKeys("I am Enabled");
//	
//	Thread.sleep(3000);
	//driver.quit();
	

//		
//	WebElement userName = driver.findElement(By.name("username"));
//	boolean status=	userName.isDisplayed();                   //returns 'Element' is display or not
//	System.out.println("The field is displayed:"+status);	
//	boolean condition=	userName.isEnabled();	
//	System.out.println("The field is enabled:"+condition);//returns 'Element' is enable or not
//		
//	String typeofInput=userName.getAttribute("type");
//	
//	System.out.println("The type field is :"+typeofInput);
//	
//	userName.sendKeys("I am Enabled");
//		
//	
//		
//		
//		WebElement pass = driver.findElement(By.name("password"));
//		boolean status2=	pass.isDisplayed();                   //returns 'Element' is display or not
//		System.out.println("The field is displayed:"+status2);	
//		
//		boolean conditions=	pass.isEnabled();	
//		System.out.println("The field is enabled:"+conditions);//returns 'Element' is enable or not
//			
//		String typeofInputs=pass.getAttribute("type");
//		
//		System.out.println("The type field is :"+typeofInputs);
//		
//		pass.sendKeys("I am Enabled");
//		
//		Thread.sleep(300);
//		//driver.close();
//		
		
		
		
		
	                      
		
		
		
		                           // TestLink
		
		
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saiful Chowdhury\\Downloads\\chromedriver_win32\\chromedriver.exe");
//
//		WebDriver driver = new ChromeDriver();
//
//		driver.manage().window().maximize();
//
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
//		driver.get("https://www.google.com/");	
//		
//		  WebElement gmailLink=driver.findElement(By.linkText("Gmail"));
//		  
//		  
//		   boolean status=gmailLink.isDisplayed();
//		  System.out.println("Gmail link is displayed: "+status);
//		  status=gmailLink.isEnabled();//Checking enabled status
//		  System.out.println(("Gmail link is enabled:"+status));//Printing enabled status
//		  
//		  String linkName=gmailLink.getText();//Getting the the name of the link
//		  
//		  System.out.println("The link name is:"+linkName); //printing the name of the  link
//		  
//		  Thread.sleep(20000);
//		  gmailLink.click();//Clicking on the link being tested
//		  System.out.println(driver.getTitle());//Print the title of landing page
//		  
//		 System.out.println(driver.getCurrentUrl());//Print the Url of landing page
//		 
//		 
//		 //driver.quit();
		
		
		/*
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saiful Chowdhury\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();		
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
		driver.get("https://www.google.com");
		
		
		WebElement gmaillink=driver.findElement(By.className("gb_d"));
		              
		
		
		
		boolean status=gmaillink.isDisplayed();
		System.out.println("The link is displayed:"+status);
		
		
		boolean status2=gmaillink.isEnabled();
        System.out.println("The link is enabled:"+status2);
		
		
        String linkName=gmaillink.getText();
		System.out.println("The name of the link is:"+linkName);
		
		
	    Thread.sleep(2000);
		
	    gmaillink.click();
		
	    //System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl();	
	   
	       String s= driver.getTitle();
	        System.out.println("The title of gmail is:"+s);
	  		String t=driver.getCurrentUrl();
	  		System.out.println("The current url of gmail is:"+t);
		//driver.close();		
		
		
				
		
	  }
	           
    }
	*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		/*
		 * System.setProperty(
		 * "webdriver.chrome.driver","C:\\Users\\Saiful Chowdhury\\Downloads\\chromedriver_win32\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.manage().window().maximize();
		 * 
		 * driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		 * driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		 * 
		 * driver.get("https://www.google.com/"); WebElement
		 * gmailLink=driver.findElement(By.linkText("Gmail")); boolean
		 * status=gmailLink.isDisplayed();
		 * 
		 * System.out.println("Gmail link is displayed: "+status);
		 * status=gmailLink.isEnabled();
		 * 
		 * String linkName=gmailLink.getText();
		 * System.out.println("The name of the link is:"+linkName);
		 * 
		 * 
		 * Thread.sleep(2000);
		 * 
		 * gmailLink.click();
		 */
		
	    //System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl();	
	   
		/*
		 * String s= driver.getTitle(); System.out.println("The title of gmail is:"+s);
		 * String t=driver.getCurrentUrl();
		 * System.out.println("The current url of gmail is:"+t); driver.close();
		 */	
		
	 
		
		                     
		
		
		
		
		                            //Test Relative Locatores
		
		

//System.setProperty("webdriver.chrome.driver","C:\\Users\\Saiful Chowdhury\\Downloads\\chromedriver_win32\\chromedriver.exe");


//Opening the URL

//Creating an object of chrome driver class
//WebDriver driver = new ChromeDriver();
//Maximize the window
//driver.manage().window().maximize();// method chaining

//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//driver.get("https://demoqa.com/automation-practice-form");
		
	
 //Relative locators 'above'
 
 //driver.findElement()
 
 
 
                           

                                       //above
                                   //  Below to up\\
                                 //driver.findElement(By.id("dateOfBirthInput")));
								



								 // WebElement above=driver.findElement(RelativeLocator.with(By.xpath(
								 // "//*[@id=\"userNumber\"]")) .above(By.id("dateOfBirthInput")));
								  
								  //above.sendKeys("+13472386233");
								 						  
								  
									/*
									 * // This portion is InComplete
									 * 
									 * 
									 * //Below // up to Below //
									 * 
									 * WebElement below= driver.findElement(RelativeLocator
									 * .with(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]"))
									 * .below(By.id("dateOfBirthInput")));
									 * 
									 * 
									 * Wait<WebDriver>wait= new FluentWait< WebDriver>(driver)//wait is a class
									 * .withTimeout(Duration.ofSeconds(30)) .pollingEvery(Duration.ofSeconds(5))
									 * 
									 * .ignoring(ElementNotInteractableException.class);
									 * 
									 * wait.until(ExpectedConditions.elementToBeClickable(below)).
									 * sendKeys("below");
									 */
								 
								  
								  
								  
								  
								  
								  
								  
								  
System.setProperty("webdriver.firefox.driver","C:\\Users\\Saiful Chowdhury\\Documents\\geckodriver-v0.32.0-win32\\geckodriver.exe");				  
								  
WebDriver driver=new EdgeDriver()	;
			
			driver.manage().window().maximize();
			
			
			
driver.get("https://demoqa.com/automation-practice-form");					  
								  
								  
WebElement above=driver.findElement(RelativeLocator.with(By.xpath("//*[@id=\"userNumber\"]")).above(By.id("dateOfBirthInput")));			  
								  
above.sendKeys("13472386233") ;
								  
								  
								  
								  
								  
								  //not completed
								// WebElement below=driver.findElement(RelativeLocator.with(By.id("dateOfBirthInput")).below(By.xpath("//*[@id=\"userNumber\"]")));			  
								  
								 //below.sendKeys("10-30-2019");		  
								  
 }

}
	
		
		

		

		
		
		
		






		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
     
     


