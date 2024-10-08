package OBJECTS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonUI {
	private WebDriver driver;
	public static Properties prop;
	FileInputStream file;
	public void propReadrer()
	{
		try {
			prop = new Properties();
			file = new FileInputStream("C:\\Users\\admin\\My_Projects\\GroupingInTestNG\\src\\test\\java\\UTILITIES\\input.properties");
			prop.load(file);
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} catch (IOException e) {
			System.out.println("IO Found");
		}	
	}
	public WebDriver driverInit(String url)
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
	public void driverClose(WebDriver driver)
	{
		driver.close();
	}

}
