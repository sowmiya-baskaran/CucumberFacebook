package program;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Baseclass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Pom {

	
	public Pom()
	{
		PageFactory.initElements(Baseclass.driver, this);
	}
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement fname;
	@FindBy(name="lastname")
	private WebElement lname;
	
	@FindBy(name="birthday_day")
	private WebElement day;
	@FindBy(name="birthday_month")
	private WebElement month ;
	@FindBy(name="birthday_year")
	private WebElement year;
	
	@FindBy(xpath="//input[@type='radio' and @value='1']")
	private WebElement Female;
	@FindBy(xpath="//input[@type='radio' and @value='2']")
	private WebElement male;
	@FindBy(xpath="//input[@type='radio' and @value='-1']")
	private WebElement custom;
	@FindBy(name="reg_email__")
	private WebElement email;

	@FindBy(name="reg_passwd__")
	private WebElement pass;

	@FindBy(name="websubmit")
	private WebElement submit;
	
	public WebElement getFname() {
		return fname;
	}



	public WebElement getLname() {
		return lname;
	}

	

	public WebElement getDay() {
		return day;
	}

	

	public WebElement getMonth() {
		return month;
	}

	
	public WebElement getYear() {
		return year;
	}

	

	public WebElement getFemale() {
		return Female;
	}


	public WebElement getMale() {
		return male;
	}

	

	public WebElement getCustom() {
		return custom;
	}

	public WebElement getEmail() {
		return email;
	}

	

	public WebElement getPass() {
		return pass;
	}

	

	public WebElement getSubmit() {
		return submit;
	}

	
	

	
}

