package ParallelExe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Case1 {
	WebDriver driver;
	@Test
	public void testing1()
	{
		driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		System.out.println("Case 01 and Method 01 Thread count: "+Thread.currentThread().getId());
		driver.close();
	}
	@Test
	public void testing2()
	{
		driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		System.out.println("Case 01 and Method 01 Thread count: "+Thread.currentThread().getId());
		driver.close();
	}
}
