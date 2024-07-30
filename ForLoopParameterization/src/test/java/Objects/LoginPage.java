package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends CommonUI {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// FUNCTIONALITY BASED REUSABLE COMPONENTS
	public void signClick() {
		xpathClick(prop.getProperty("signXpath"));
	}

	public void username(String val) {
		xpathInput(prop.getProperty("userXpath"), val);
	}

	public void password(String val) {
		xpathInput(prop.getProperty("passXpath"), val);
	}

	public void LoginClick() {
		xpathClick(prop.getProperty("loginXpath"));
	}

	public void valid(String txt) {
		String s = xpathEle(prop.getProperty("validXpath")).getText();
		if (!s.equals(txt)) {
			System.out.println("INVALID USERNAME AND PASSWORD");
		} else {
			System.out.println("VALID USERNAME AND PASSWORD");
		}
	}

	// OPERATION BASED REUSABLE COMPONENTS
	public void xpathClick(String x) {
		driver.findElement(By.xpath(x)).click();
	}

	public void xpathInput(String x, String v) {
		driver.findElement(By.xpath(x)).clear();
		driver.findElement(By.xpath(x)).sendKeys(v);
	}

	public WebElement xpathEle(String x) {
		WebElement e = driver.findElement(By.xpath(x));
		return e;
	}
}
