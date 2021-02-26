package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
public static WebDriver driver;
String Exp="The Knowledge Arcade";
String Exp1="Please complete this required field.";
String Exp2="Please select an option from the dropdown menu.";
@BeforeMethod
public void Pre()
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.growthengineering.co.uk/");
}
@AfterMethod
public void Post()
{
	//driver.quit();
}
}
