package Priority;

import org.testng.annotations.Test;

public class PriorityClass {
		@Test(priority=-1)
		public void SignUp()
		{
			System.out.println("SignUp");
		}
		@Test(priority=0)
		public void Login()
		{
			System.out.println("Login");
		}
		@Test(priority=1)
		public void SearchFlight()
		{
			System.out.println("SearchFlight");
		}
		@Test(priority=2)
		public void BookTicket()
		{
			System.out.println("BookFlight");
		}
		@Test(priority=3)
		public void SaveTicket()
		{
			System.out.println("SaveTicket");
		}
		@Test(priority=4)
		public void Logout()
		{
			System.out.println("Logout");
		}
	}

