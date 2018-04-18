package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SignUpTesting {
	
	static boolean SignUpValid_1(WebDriver driver)
	{
		driver.get("http://localhost/library-master/student_form.php");
		
		driver.findElement(By.name("firstname")).sendKeys("First Name");
		driver.findElement(By.name("lastname")).sendKeys("Last Name");
		driver.findElement(By.name("username")).sendKeys("User_Name");
		driver.findElement(By.name("address")).sendKeys("3nwan");
		driver.findElement(By.name("roll")).sendKeys("123");
		driver.findElement(By.name("contact")).sendKeys("324512345");
		driver.findElement(By.name("password")).sendKeys("password");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div/div/div[11]/div/button")).click();
		
		String Url=driver.getCurrentUrl();
		if(!Url.equals("http://localhost/library-master/success.php"))
			return false;
		
		return true;
	}
	
	static boolean SignUpValid_2(WebDriver driver)
	{
		driver.get("http://localhost/library-master/teacher_form.php");
		
		driver.findElement(By.name("firstname")).sendKeys("First Name");
		driver.findElement(By.name("lastname")).sendKeys("Last Name");
		driver.findElement(By.name("username")).sendKeys("User_Name");
		driver.findElement(By.name("address")).sendKeys("3nwan");
		driver.findElement(By.name("contact")).sendKeys("324512345");
		driver.findElement(By.name("password")).sendKeys("password");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div/div/div[9]/div/button")).click();
		
		String Url=driver.getCurrentUrl();
		if(!Url.equals("http://localhost/library-master/success.php"))
			return false;
		
		return true;
	}
	
	
	static boolean SignUpInValid_1(WebDriver driver)
	{
		driver.get("http://localhost/library-master/student_form.php");
		
		driver.findElement(By.name("firstname")).sendKeys("First Name");
		driver.findElement(By.name("lastname")).sendKeys("Last Name");
		driver.findElement(By.name("username")).sendKeys("User_Name");
		driver.findElement(By.name("address")).sendKeys("3nwan");
		driver.findElement(By.name("roll")).sendKeys("123");
		driver.findElement(By.name("contact")).sendKeys("324512345");
		driver.findElement(By.name("password")).sendKeys("password");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div/div/div[11]/div/button")).click();
		
		String Url=driver.getCurrentUrl();
		if(Url.equals("http://localhost/library-master/success.php"))
			return false;
		
		return true;
	}
	
	static boolean SignUpInValid_2(WebDriver driver)
	{
		driver.get("http://localhost/library-master/student_form.php");
		
		driver.findElement(By.name("firstname")).sendKeys(" ");
		driver.findElement(By.name("lastname")).sendKeys(" ");
		driver.findElement(By.name("username")).sendKeys(" ");
		driver.findElement(By.name("address")).sendKeys(" ");
		driver.findElement(By.name("roll")).sendKeys(" ");
		driver.findElement(By.name("contact")).sendKeys(" ");
		driver.findElement(By.name("password")).sendKeys(" ");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div/div/div[11]/div/button")).click();
		
		String Url=driver.getCurrentUrl();
		if(Url.equals("http://localhost/library-master/success.php"))
			return false;
		
		return true;
	}
	
	static boolean SignUpInValid_3(WebDriver driver)
	{
		driver.get("http://localhost/library-master/student_form.php");
		
		driver.findElement(By.name("firstname")).sendKeys("First Name");
		driver.findElement(By.name("lastname")).sendKeys("Last Name");
		driver.findElement(By.name("username")).sendKeys("User_Name");
		driver.findElement(By.name("address")).sendKeys("3nwan");
		driver.findElement(By.name("roll")).sendKeys("dsadas");
		driver.findElement(By.name("contact")).sendKeys("324512345");
		driver.findElement(By.name("password")).sendKeys("password");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div/div/div[11]/div/button")).click();
		
		String Url=driver.getCurrentUrl();
		if(!Url.equals("http://localhost/library-master/success.php"))
			return false;
		
		return true;
	}
	
	static void runSignUpTesting()
	{
		String exePath="C:\\fci.cu\\3rd year\\testing\\geckodriver-v0.20.1-win32\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",  exePath);
		WebDriver driver = new FirefoxDriver();
		
		///TC26
		if(SignUpValid_1(driver))
			System.out.println("TC26 Pass");
		else
			System.out.println("TC26 Fail");
		///TC27
		if(SignUpValid_2(driver))
			System.out.println("TC27 Pass");
		else
			System.out.println("TC27 Fail");
		///TC28
		if(SignUpInValid_1(driver))
			System.out.println("TC28 Pass");
		else
			System.out.println("TC28 Fail");
		///TC29
		if(SignUpInValid_2(driver))
			System.out.println("TC29 Pass");
		else
			System.out.println("TC29 Fail");
		///TC30
		if(SignUpInValid_3(driver))
			System.out.println("TC30 Pass");
		else
			System.out.println("TC30 Fail");

	}
	
}
