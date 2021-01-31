import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.nicor.generic.BaseTest;

public class Apsrtc_Livetrack extends BaseTest
{
	/*String chrome_key="webdriver.chrome.driver"; 
	String chrome_value="./drivers/chromedriver.exe";
	String gecko_key="webdriver.gecko.driver";
	String gecko_value="C:\\Users\\Admin\\Desktop\\NICOR\\Nicor Repo\\NICOR\\NICOR\\drivers\\geckodriver.exe";
	
	System.setProperty (chrome_key,chrome_value);
	
	System.setProperty(chrome_key, chrome_value);
	System.setProperty(gecko_key, gecko_value);
	
	driver = new ChromeDriver();
	//driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	*/
	
	@Test()
	public static void liveTrack() throws InterruptedException 
	{
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("/html/body/app-root/app-contact/app-header/header/div[3]/div/ul/li[2]/a/span")).click();
		
		//driver.findElement(By.xpath("//mat-select")).click();
		
		Thread.sleep(5000);
		
	  // driver.findElement(By.xpath("//input[@formcontrolname='myControl17']")).sendKeys("6557");
	   
	  // driver.findElement(By.className("mat-form-field-infix")).sendKeys("6557");
		
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/section/div[1]/div[1]/div[2]/div/mat-radio-group/mat-radio-button[2]/label/div[2]/span")).click();
	   
	  // driver.findElement(By.id("mat-input-9")).sendKeys("6557");
	   
	   Thread.sleep(5000);
	   
	   
	}

}
