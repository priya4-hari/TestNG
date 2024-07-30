package ForLoop;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Objects.CommonUI;
import Objects.LoginPage;

public class TestCase1 extends CommonUI {
	static WebDriver driver;
	@Test
	public void Case() {
		String[][] arr = { { "j2ee", "j2ee" }, { "j2ee", "mani" }, { "mani", "j2ee" }, { "", "j2ee" }, { "j2ee", "" },
				{ "", "" } };
		for (int i = 0; i < arr.length; i++) {
			CommonUI c = new CommonUI();
			c.propReader();
			driver = c.driverInit(prop.getProperty("url"));
			LoginPage l = new LoginPage(driver);
			l.signClick();
			l.username(arr[i][0]);
			l.password(arr[i][1]);
			l.LoginClick();
			l.valid(prop.getProperty("validTxt"));
			c.driverClose(driver);
		}
	}

}
