package TestCases;


import org.testng.annotations.Test;

import POM.POM_001_links;

public class TC_001_Links extends Base{

@Test(enabled=true)
public void Top_links() throws InterruptedException {
	POM_001_links p=new POM_001_links(driver);
	p.Our_Product(Exp);
	Thread.sleep(1000);
	p.Our_Approch();
	Thread.sleep(1000);
	p.Resource();
	Thread.sleep(1000);
	p.About();
}
}
