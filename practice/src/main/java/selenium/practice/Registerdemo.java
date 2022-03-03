package selenium.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registerdemo {
	
	public static WebDriver driver ;
	
	
	public void setup()
	{
		System.setProperty("webdriver.driver.chrome","C:\\Users\\SHRESSIN\\eclipse-workspace\\practice\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000 , TimeUnit.SECONDS);
		
	}

	
	public void register()
	{
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("shreshtha");
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Singhal");
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("xyz");
		
		driver.findElement(By.xpath("//input[@type = 'email']")).sendKeys("123abc@gmail.com");
		
		driver.findElement(By.xpath("//input[@type = 'tel']")).sendKeys("9876543456");
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")).click();
		
		driver.findElement(By.xpath("//input[@id = 'checkbox2']")).click();
		
		
	}
	
	public void dropdown()
	{
		//driver.findElement(By.xpath("//*[@id=\"msdd\"]")).click();
		WebElement lang = driver.findElement(By.xpath("//*[@id=\"msdd\"]"));
		lang.click();
		//lang.sendKeys("English");
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]/a")).click();
		
		
		Select skill = new Select(driver.findElement(By.id("Skills")));
		skill.selectByVisibleText("Java");
		
		Select country = new Select(driver.findElement(By.id("countries")));
		country.selectByVisibleText("Select Country");
		
		//driver.findElement(By.className("select2-selection select2-selection--single")).click();
		//driver.findElement(By.className("select2-search__field")).sendKeys("India");
		
		Select year = new Select(driver.findElement(By.id("yearbox")));
		year.selectByVisibleText("1996");
		
		Select month = new Select(driver.findElement(By.xpath("//Select[@placeholder='Month']")));
		month.selectByVisibleText("May");
		
		Select day = new Select(driver.findElement(By.id("daybox")));
		day.selectByVisibleText("30");
		
		driver.findElement(By.id("firstpassword")).sendKeys("First");
		driver.findElement(By.id("secondpassword")).sendKeys("first");
		
		driver.findElement(By.id("submitbtn")).click();
		
		
		
		
	}
}
