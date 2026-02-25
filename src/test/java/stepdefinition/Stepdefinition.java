package stepdefinition;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.*;
import hooks.hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import program.Pom;

public class Stepdefinition {
	Baseclass bas=new Baseclass();
//	public static WebDriver driver;
	Pom object;
	
	@Given("launch facebook page {string}")
	public void launch_facebook_page(String string) {
	
	    // Write code here that turns the phrase above into concrete actions
		//driver=bas.Chrome();
		bas.Launch(string);
		
		object=new Pom();
	   
	}


	@When("Logging into the facebook by one dim list")
	public void logging_into_the_facebook_by_one_dim_list(io.cucumber.datatable.DataTable dataTable) {

	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<String> list1=dataTable.asList();
		WebElement fname=object.getFname();
		
		fname.sendKeys(list1.get(0));
		WebElement lname=object.getLname();
		lname.sendKeys(list1.get(1));

		WebElement bday=object.getDay();
		String dob=list1.get(2);
		String[] dobarr=dob.split("-");
		String day=dobarr[0];
		String month=dobarr[1];
		String  year=dobarr[2];
		bday.sendKeys(day);
		WebElement bmonth =object.getMonth();
		bmonth.sendKeys(month);
		WebElement byear=object.getYear();
		byear.sendKeys(year);
		String gender=list1.get(3);
		System.out.println(gender);
		WebElement Female=object.getFemale();//.findElement(By.xpath("//input[@type='radio' and @value='1']"));
		WebElement male=object.getMale();//.findElement(By.xpath("//input[@type='radio' and @value='2']"));
		WebElement custom=object.getCustom();//.findElement(By.xpath("//input[@type='radio' and @value='-1']"));
		if(gender.equals("Female"))
		{
			Female.click();
			
		}
		else if (gender.equals("Male"))
		{
			male.click();
		}
		else
		{
			custom.click();
			
		}
		
		WebElement email=object.getEmail();//.findElement(By.name("reg_email__"));
		email.sendKeys(list1.get(4));
		WebElement password =object.getPass();//.findElement(By.name("reg_passwd__"));
		password.sendKeys(list1.get(5));
		WebElement submit=object.getSubmit();//.findElement(By.name("websubmit"));
		submit.click();
		

	    
	}
	
	

@When("Taking screenshot of the page")
public void taking_screenshot_of_the_page() throws IOException, InterruptedException {
   
bas.screenShot();
   Thread.sleep(2000);
}

@When("Logging into the facebook by one map")
public void logging_into_the_facebook_by_one_map(io.cucumber.datatable.DataTable dataTable) {
 Map<String,String> map= dataTable.asMap();
  String name1= map.get("First name");

  WebElement fname=object.getFname();
	fname.sendKeys(name1);
	WebElement lname=object.getLname();
	lname.sendKeys(map.get("Surname"));

	WebElement bday=object.getDay();
	String dob=map.get("dob");
	String[] dobarr=dob.split("-");
	String day=dobarr[0];
	String month=dobarr[1];
	String  year=dobarr[2];
	bday.sendKeys(day);
	WebElement bmonth =object.getMonth();
	//bmonth.sendKeys(month);
	WebElement byear=object.getYear();
	//WebElement bmonth =driver.findElement(By.name("birthday_month"));
	bmonth.sendKeys(month);
	//WebElement byear=driver.findElement(By.name("birthday_year"));
	byear.sendKeys(year);
	
	String gender=map.get("Gender");
	System.out.println(gender);
	WebElement Female=object.getFemale();//.findElement(By.xpath("//input[@type='radio' and @value='1']"));
	WebElement male=object.getMale();//.findElement
	WebElement custom=object.getCustom();//.findElement(By.xpath("//input[@type='radio' and @value='-1']"));
	if(gender.equals("Female"))
	{
		Female.click();
		
	}
	else if (gender.equals("Male"))
	{
		male.click();
	}
	else
	{
		custom.click();
		
	}
	
	WebElement email=object.getEmail();//.findElement(By.name("reg_email__"));
	//email.sendKeys(list1.get(4));
	WebElement password =object.getPass();//.findElement(By.name("reg_passwd__"));
	//password.sendKeys(list1.get(5));
	WebElement submit=object.getSubmit();//.findElement(By.name("websubmit"));
	//submit.click();
	
//	WebElement email=driver.findElement(By.name("reg_email__"));
email.sendKeys(map.get("email"));
	//WebElement password =driver.findElement(By.name("reg_passwd__"));
password.sendKeys(map.get("password"));
//	WebElement submit=driver.findElement(By.name("websubmit"));
submit.click();
}

@When("Taking screenshot of the page2")
public void taking_screenshot_of_the_page2() throws IOException, InterruptedException {
	bas.screenShot();
	Thread.sleep(2000);
}



@When("Logging into the facebook with bunch of data enters {string}")
public void logging_into_the_facebook_with_bunch_of_data_enters(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("Logging into the facebook with bunch of data enters {string} {string} {string} {string} {string} {string}")
public void logging_into_the_facebook_with_bunch_of_data_enters(String string, String string2, String string3, String string4, String string5, String string6) {

 // Write code here that turns the phrase above into concrete actions
	 WebElement fname=object.getFname();
	 
		fname.sendKeys(string);
		WebElement lname=object.getLname();

		lname.sendKeys(string2);

		WebElement bday=object.getDay();

		String dob=string3;
		System.out.println("imdob"+dob);
		String[] dobarr=dob.split("-");
		String day=dobarr[0];
		String month=dobarr[1];
		String  year=dobarr[2];
		bday.sendKeys(day);
		WebElement bmonth =object.getMonth();
		//bmonth.sendKeys(month);
		WebElement byear=object.getYear();
		bmonth.sendKeys(month);
		//WebElement byear=driver.findElement(By.name("birthday_year"));
		byear.sendKeys(year);
		String gender=string4;
		System.out.println(gender);
		WebElement Female=object.getFemale();//.findElement(By.xpath("//input[@type='radio' and @value='1']"));
		WebElement male=object.getMale();//.findElement
		WebElement custom=object.getCustom();
		if(gender.equals("Female"))
		{
			Female.click();
			
		}
		else if (gender.equals("Male"))
		{
			male.click();
		}
		else
		{
			custom.click();
			
		}
		
		WebElement email=object.getEmail();//.findElement(By.name("reg_email__"));
		//email.sendKeys(list1.get(4));
		WebElement password =object.getPass();//.findElement(By.name("reg_passwd__"));
		//password.sendKeys(list1.get(5));
		WebElement submit=object.getSubmit();//.findElement(By.name("websubmit"));
		//submit.click();
		
		//WebElement email=driver.findElement(By.name("reg_email__"));
		email.sendKeys(string5);
		//WebElement password =driver.findElement(By.name("reg_passwd__"));
		password.sendKeys(string6);
		//WebElement submit=driver.findElement(By.name("websubmit"));
		submit.click();


}

@When("Taking screenshot of the page3")
public void taking_screenshot_of_the_page3() throws IOException {

	bas.screenShot();
	
		


}







}
