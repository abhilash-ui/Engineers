package POM;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class POM_001_links {
	WebDriver driver;
	public POM_001_links(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//*[@class='elementor-item has-submenu'])[1]")
	WebElement product;
	@FindBy(xpath = "//li")
	List<WebElement> links;
	
	public void Our_Product(String s) {
		product.click();
		for (int i = 0; i < links.size(); i++) {
			String ss=links.get(i).getText();
			if(ss.equalsIgnoreCase("The Knowledge Arcade"))
			{
				links.get(i).click();
				Assert.assertEquals(ss, s);
			}
		
		}
		
	}
	@FindBy(xpath = "(//*[@class='elementor-item has-submenu'])[2]")
	WebElement Approch;

	public void Our_Approch() {
		Approch.click();
		for (int i = 0; i < links.size(); i++) {
			String ss=links.get(i).getText();
			if(ss.equalsIgnoreCase("Brain Science"))
			{
				links.get(i).click();		
			}
		}
		driver.navigate().back();
			}
	
	@FindBy(xpath = "(//*[@class='elementor-item has-submenu'])[3]")
	WebElement Resource;
	
	public void Resource() {
		Resource.click();
		for (int i = 0; i < links.size(); i++) {
			String ss=links.get(i).getText();
			if(ss.equalsIgnoreCase("Downloads"))
			{
				links.get(i).click();		
			}
		}
		driver.navigate().back();
	}
	
	@FindBy(xpath = "(//*[@class='elementor-item has-submenu'])[4]")
	WebElement About_Us;
	public void About() {
	About_Us.click();
	for (int i = 0; i < links.size(); i++) {
		String ss=links.get(i).getText();
		if(ss.equalsIgnoreCase("Our Story"))
		{
			links.get(i).click();		
		}
	}
	
	}
	

}
