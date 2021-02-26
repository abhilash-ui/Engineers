package POM;

import java.awt.RenderingHints.Key;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class POM_002_conatact_us {
	WebDriver driver;
	public POM_002_conatact_us(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[text()='Contact Us']")
	WebElement Contact;
	public void conatct() {
		Contact.click();
	}
	@FindBy(xpath = "//*[@type='submit']")
	WebElement submit;
	@FindBy(xpath = "(//*[text()='Please complete this required field.'])[1]")
	WebElement error1;
	@FindBy(xpath = "//*[@name='firstname']")
	WebElement Name;
	@FindBy(xpath = "//input")
	List<WebElement> list;
	public void FirstName(String e) {
	
try {
			
		submit.click();
			Thread.sleep(5000);
			String Act = error1.getText();
			SoftAssert s=new SoftAssert();
			s.assertEquals(Act, e);
			Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.moveToElement(Name).click().perform();
		Name.sendKeys("abhilash");
			s.assertAll();
			
		
}
catch(Exception e1)
{
	System.out.println(e1.getMessage());
}
		
		
		}
	@FindBy(xpath = "(//*[text()='Please complete this required field.'])[2]")
	WebElement error2;
	@FindBy(xpath = "//*[@name='lastname']")
	WebElement LName;
	public void LasttName(String e) {
		
		try {
					
				submit.click();
					Thread.sleep(1000);
					String Act = error2.getText();
					SoftAssert s=new SoftAssert();
					s.assertEquals(Act, e);
					Thread.sleep(1000);
				Actions act=new Actions(driver);
				act.moveToElement(LName).click().perform();
				LName.sendKeys("gowda");
					s.assertAll();
		}
		catch(Exception e1)
		{
			System.out.println(e1.getMessage());
		}
		}
	
	@FindBy(xpath = "//*[@name='email']")
	WebElement mail;
	@FindBy(xpath = "(//*[text()='Please complete this required field.'])[3]")
	WebElement error3;
	public void Email(String e) {
		try {
			
			submit.click();
				Thread.sleep(1000);
				String Act = error3.getText();
				SoftAssert s=new SoftAssert();
				s.assertEquals(Act, e);
				Thread.sleep(1000);
			Actions act=new Actions(driver);
			act.moveToElement(mail).click().perform();
			mail.sendKeys("abhilashg436@gmail.com");
				s.assertAll();
	}
	catch(Exception e1)
	{
		System.out.println(e1.getMessage());
	}
	}
	
	
	@FindBy(xpath = "//*[@name='phone']")
	WebElement phone;
	@FindBy(xpath = "(//*[text()='Please complete this required field.'])[3]")
	WebElement error4;
	
	public void PhNo(String e) {
		
try {
			
			submit.click();
				Thread.sleep(1000);
				String Act = error4.getText();
				SoftAssert s=new SoftAssert();
				s.assertEquals(Act, e);
				Thread.sleep(1000);
			Actions act=new Actions(driver);
			act.moveToElement(phone).click().perform();
			phone.sendKeys("9876543210");
				s.assertAll();
	}
	catch(Exception e1)
	{
		System.out.println(e1.getMessage());
	}
	}
	
	@FindBy(xpath = "//*[@name='company']")
	WebElement Comp;
	@FindBy(xpath = "(//*[text()='Please complete this required field.'])[2]")
	WebElement error5;
	public void Company(String e) {
		try {
			
			submit.click();
				Thread.sleep(1000);
				String Act = error5.getText();
				SoftAssert s=new SoftAssert();
				s.assertEquals(Act, e);
				Thread.sleep(1000);
			Actions act=new Actions(driver);
			act.moveToElement(Comp).click().perform();
			Comp.sendKeys("xyzabc");
				s.assertAll();
	}
	catch(Exception e1)
	{
		System.out.println(e1.getMessage());
	}
	}
	@FindBy(xpath = "//*[@name='country_']")
	WebElement country;
	@FindBy(xpath = "//*[text()='Please select an option from the dropdown menu.']")
	WebElement error6;
	public void Country(String e) {
	try {	
		submit.click();
		Thread.sleep(1000);
		String Act = error6.getText();
		SoftAssert s=new SoftAssert();
		s.assertEquals(Act, e);
		Select ss=new Select(country);
		ss.selectByVisibleText("India");
		s.assertAll();
	}
	catch(Exception e1)
	{
		System.out.println(e1.getMessage());
	}
	}
	
	@FindBy(xpath = "(//*[@class='hs-form-radio-display'])[2]")
	WebElement audi;
	public void Audience() {
		audi.click();
	}
	@FindBy(xpath = "//*[@name='role_description']")
	WebElement Roles;
	@FindBy(xpath = "(//*[text()='Please select an option from the dropdown menu.'])[1]")
	WebElement error7;
	public void Responsibility(String e) {
		try {	
			submit.click();
			Thread.sleep(1000);
			String Act = error7.getText();
			SoftAssert s=new SoftAssert();
			s.assertEquals(Act, e);
		Select ss=new Select(Roles);
		ss.selectByIndex(1);
		s.assertAll();
	}
		catch(Exception e1)
		{
			System.out.println(e1.getMessage());
		}
	}
	@FindBy(xpath = "//*[@name='what_is_the_purpose_of_your_enquiry_']")
	WebElement enq;
	@FindBy(xpath = "//*[text()='Please select an option from the dropdown menu.']")
	WebElement error8;
	public void Enquiry(String e) {
		try {	
			submit.click();
			Thread.sleep(1000);
			String Act = error8.getText();
			SoftAssert s=new SoftAssert();
			s.assertEquals(Act, e);
		Select ss=new Select(enq);
		ss.selectByIndex(2);
		s.assertAll();
	}
		catch(Exception e1)
		{
			System.out.println(e1.getMessage());
		}
	}
	@FindBy(xpath = "(//*[@class='hs-input'])[9]")
	WebElement bttn;
	@FindBy(xpath = "(//*[text()='Please complete this required field.'])[2]")
	WebElement error9;
	public void Button(String e) {
		try {	
			
			
		bttn.click();

		}
		catch(Exception e1)
		{
			System.out.println(e1.getMessage());
		}
	}
}
