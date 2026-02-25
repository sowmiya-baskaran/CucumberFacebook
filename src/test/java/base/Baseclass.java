package base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static WebDriver driver;
	public static WebDriver Chrome()
	
	
	{
		WebDriverManager.chromedriver().setup();
	
			ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");
	        options.addArguments("--start-maximized");
	        driver=new ChromeDriver(options);
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
		return driver;
		
		
	}
	
	public static void Launch(String url)
	{
		driver.get(url);
		WebElement create=driver.findElement(By.xpath("//a[text()='Create new account']"));
		create.click();

	}

	public static void Maximize()
	{
		driver.manage().window().maximize();

		
		
	}
	public static void screenShot() throws IOException {

		TakesScreenshot tk=(TakesScreenshot)driver;
		File souce=tk.getScreenshotAs(OutputType.FILE);
		File ddes=new File("C:\\Users\\sowmiya17\\CucumberMyntra\\target\\ss"+Math.random()+".png");
		FileUtils.copyFile(souce, ddes);
	}
	/*public static void close()
	{
		if(driver!=null) {
		driver.close();
		}
	}*/

	public static void quit()
	{
		driver.quit();
	}
}
