package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import base.Baseclass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooks {
	Baseclass base=new Baseclass();
//	public static WebDriver driver;
	
	@Before
	public void initialiazing(Scenario scenario)
	{
		base.driver =base.Chrome();
		TakesScreenshot screen=(TakesScreenshot)base.driver;
	  final byte[] imag=	screen.getScreenshotAs(OutputType.BYTES);
		scenario.attach(imag, "image/png", "Browser starts");
		
	}
	
	@After
	public void close(Scenario scenario)
	{
		if(base.driver!=null) {
			TakesScreenshot screen=(TakesScreenshot)base.driver;
			  final byte[] imag=	screen.getScreenshotAs(OutputType.BYTES);
				scenario.attach(imag, "image/png", "Browser end");
		   base.driver.close();
				}
	}
}
