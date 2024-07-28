package DependsOnMethods;

import org.testng.annotations.Test;

public class DependsOnMethodsClass {
	@Test
	public void Login()
	{
		System.out.println("Login");
		}
	@Test
	public void AddToCart()
	{
		System.out.println("AddToCart");
	}
	@Test
	public void WishList()
	{
		System.out.println("WishList");
	}
	@Test(dependsOnMethods={"Login","AddToCart"})
	public void Payment1()
	{
		System.out.println("Payment1");
	}
	@Test(dependsOnMethods={"Login","WishList"})
	public void Payment2()
	{
		System.out.println("Payment2");
	}

}
