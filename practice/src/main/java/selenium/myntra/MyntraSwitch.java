package selenium.myntra;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraSwitch {
	
public static WebDriver driver;

	
	
	public void init() {
		
		System.setProperty("webdriver.driver.chrome","C:\\Users\\SHRESSIN\\eclipse-workspace\\practice\\chromedriver.exe" );
		driver = new ChromeDriver();
	}

	public void load()
	{
		driver.get("https://www.myntra.com/");
	}
	
	
	public void title()
	{
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	}
	
	public void switching(String xpath)
	
{
		
	
		//WebElement men = driver.findElement(By.xpath());
		//men.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		
		
		
		
	
	//*[@id="desktop-header-cnt"]/div[2]/nav/div/div[2]/div/a
	
	WebElement women = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[2]/div/a"));
	women.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
	
	ArrayList<String> womenindex = new ArrayList<String>(driver.getWindowHandles());
	
	driver.switchTo().window(womenindex.get(2));
    System.out.println(driver.getTitle());
    
    
 
    
    WebElement kids = driver.findElement(By.xpath(" //*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[3]/div/a"));
	kids.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
	
	ArrayList<String> kidsindex = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(kidsindex.get(3));
    System.out.println(driver.getTitle());
    
    
  
    
    WebElement living = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[4]/div/a"));
   	living.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
   	
   	ArrayList<String> livinindex = new ArrayList<String>(driver.getWindowHandles());
   	
   	driver.switchTo().window(livinindex.get(4));
       System.out.println(driver.getTitle());
	
	
     
       

       WebElement beauty = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[5]/div/a"));
      	beauty.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
      	
      	ArrayList<String> beautyindex = new ArrayList<String>(driver.getWindowHandles());
      	
      	driver.switchTo().window(beautyindex.get(5));
          System.out.println(driver.getTitle());
          
         
       
       
	}
	
	public void switchingtab()
	{
ArrayList<String> menindex = new ArrayList<String>(driver.getWindowHandles());
		
		for(int i = 0 ; i <=menindex.size()-1 ; i++)
		{
			driver.switchTo().window(menindex.get(i));
			System.out.println(driver.getTitle());
		}
	}
	
	public void teardown()
	{
		driver.close();
		driver.quit();
	}
}








/*public void openSectionTabs() throws InterruptedException {



List<WebElement> we = driver.findElements(By.xpath("//div[@class='desktop-navContent']/div/a"));



for (int i = 0; i < we.size(); i++) {
((WebElement) we.get(i)).sendKeys(Keys.chord(Keys.CONTROL, Keys.RETURN));
Thread.sleep(3000);
}
}



public void switchWindow() throws InterruptedException {
ArrayList<String> allwin = new ArrayList<String>(driver.getWindowHandles());
for (int i = 0; i < allwin.size(); i++) {
driver.switchTo().window(allwin.get(i));
Thread.sleep(3000);
System.out.println(driver.getTitle());
}



}*/
