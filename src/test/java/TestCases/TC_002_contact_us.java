package TestCases;

import org.testng.annotations.Test;

import POM.POM_002_conatact_us;




public class TC_002_contact_us extends Base {
@Test
public void Verify_login() throws InterruptedException {
	
	POM_002_conatact_us p2=new POM_002_conatact_us(driver);
	try {
	p2.conatct();
	Thread.sleep(1000);
	p2.FirstName(Exp1);
	Thread.sleep(1000);
	p2.LasttName(Exp1);
	Thread.sleep(1000);
	p2.Email(Exp1);
	Thread.sleep(1000);
	p2.PhNo(Exp1);
	Thread.sleep(1000);
	p2.Company(Exp1);
	Thread.sleep(1000);
	p2.Country(Exp2);
	Thread.sleep(1000);
	p2.Audience();
	Thread.sleep(1000);
	p2.Responsibility(Exp2);
	Thread.sleep(1000);
	p2.Enquiry(Exp2);
	Thread.sleep(1000);
	p2.Button(Exp1);
	}catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}


}
