package TESTCASES;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import OBJECTS.CommonUI;
import OBJECTS.LoginPage;
@Test(groups="InvalidInput")
public class Case2 extends CommonUI{
	static WebDriver driver;
	@Test(groups="Regression")
	public void testing2()
	{
		CommonUI c = new CommonUI();
		c.propReadrer();
		driver = c.driverInit(prop.getProperty("url"));
		LoginPage l = new LoginPage(driver);
		l.SignClick();
		l.username(prop.getProperty("user2"));
		l.pass(prop.getProperty("pass2"));
		l.LoginClick();
		l.printing(prop.getProperty("user2"), prop.getProperty("pass2"));
		l.valid(prop.getProperty("validTxt"));
		c.driverClose(driver);
		}
	@Test(groups="Regression")
	public void testing3()
	{
		CommonUI c = new CommonUI();
		c.propReadrer();
		driver = c.driverInit(prop.getProperty("url"));
		LoginPage l = new LoginPage(driver);
		l.SignClick();
		l.username(prop.getProperty("user3"));
		l.pass(prop.getProperty("pass3"));
		l.LoginClick();
		l.printing(prop.getProperty("user3"), prop.getProperty("pass3"));
		l.valid(prop.getProperty("validTxt"));
		c.driverClose(driver);
		}

}
