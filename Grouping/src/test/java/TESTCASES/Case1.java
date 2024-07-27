package TESTCASES;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import OBJECTS.CommonUI;
import OBJECTS.LoginPage;
@Test(groups={"SanityTest","SmokeTest"})
public class Case1 extends CommonUI{
	static WebDriver driver;
	@Test(groups="Sanity")
	public void sample()
	{
		driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		String str = driver.getTitle();
		if(str.equals("JPetStore Demo"))
		{
			System.out.println("VALID URL");
		}
		driver.close();
	}
	@Test(groups="Smoke")
	public void testing1()
	{
		CommonUI c = new CommonUI();
		c.propReadrer();
		driver = c.driverInit(prop.getProperty("url"));
		LoginPage l = new LoginPage(driver);
		l.SignClick();
		l.username(prop.getProperty("user1"));
		l.pass(prop.getProperty("pass1"));
		l.LoginClick();
		l.printing(prop.getProperty("user1"), prop.getProperty("pass1"));
		l.valid(prop.getProperty("validTxt"));
		c.driverClose(driver);
		}

}
