package TESTCASES;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import OBJECTS.CommonUI;
import OBJECTS.LoginPage;
@Test(groups="BlankInputs")
public class Case3 extends CommonUI{
	static WebDriver driver;
	@Test(groups="Regression")
	public void testing4()
	{
		CommonUI c = new CommonUI();
		c.propReadrer();
		driver = c.driverInit(prop.getProperty("url"));
		LoginPage l = new LoginPage(driver);
		l.SignClick();
		l.username(prop.getProperty("user4"));
		l.pass(prop.getProperty("pass4"));
		l.LoginClick();
		l.printing(prop.getProperty("user4"), prop.getProperty("pass4"));
		l.valid(prop.getProperty("validTxt"));
		c.driverClose(driver);
		}
	@Test(groups="Regression")
	public void testing5()
	{
		CommonUI c = new CommonUI();
		c.propReadrer();
		driver = c.driverInit(prop.getProperty("url"));
		LoginPage l = new LoginPage(driver);
		l.SignClick();
		l.username(prop.getProperty("user5"));
		l.pass(prop.getProperty("pass5"));
		l.LoginClick();
		l.printing(prop.getProperty("user5"), prop.getProperty("pass5"));
		l.valid(prop.getProperty("validTxt"));
		c.driverClose(driver);
		}
	@Test(groups="Regression")
	public void testing6()
	{
		CommonUI c = new CommonUI();
		c.propReadrer();
		driver = c.driverInit(prop.getProperty("url"));
		LoginPage l = new LoginPage(driver);
		l.SignClick();
		l.username(prop.getProperty("user6"));
		l.pass(prop.getProperty("pass6"));
		l.LoginClick();
		l.printing(prop.getProperty("user6"), prop.getProperty("pass6"));
		l.valid(prop.getProperty("validTxt"));
		c.driverClose(driver);
		}

}
