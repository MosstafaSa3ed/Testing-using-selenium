package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login 
{

	public static boolean login1(WebDriver driver)//Right userdata , pass
	{
		driver.get("http://localhost/library-master/member/index.php");
		String A,B;
		A="http://localhost/library-master/member/index.php";
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("jahidd26");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		B=driver.getCurrentUrl();
		if(A.equals(B))
			return false;
		return true;
	}
	public static boolean login2(WebDriver driver)// wrong user name
	{
		driver.get("http://localhost/library-master/member/index.php");
		String A,B;
		A="http://localhost/library-master/member/index.php";
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("jahidd22");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		B=driver.getCurrentUrl();
		if(A.equals(B))
			return true;
		return false;
	}
	public static boolean login3(WebDriver driver)//submit with empty data...pass
	{
		driver.get("http://localhost/library-master/member/index.php");
		String A,B;
		A="http://localhost/library-master/member/index.php";
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("jahidd22");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		B=driver.getCurrentUrl();
		//System.out.println(B);
		if(A.equals(B))
			return true;
		return false;
	}
	public static boolean login4(WebDriver driver)//logOut pass
	{
		driver.get("http://localhost/library-master/member/index.php");
		String B;
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("jahidd26");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[7]/a")).click();
		B=driver.getCurrentUrl();
		System.out.println(B);
		if(B.equals("http://localhost/library-master/index.php"))
			return true;
		return false;
	}
	public static boolean login5(WebDriver driver)//pass...test l session
	{
		driver.get("http://localhost/library-master/member/dashboard.php");
		String B;
		B=driver.getCurrentUrl();
		if(B.equals("http://localhost/library-master/member/index.php"))
			return true;
		return false;
	}
	public static boolean login6(WebDriver driver)//after logout user can invke any page .. pass
	{
		driver.get("http://localhost/library-master/member/index.php");
		String B;
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("jahidd26");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[7]/a")).click();
		return login5(driver);
	}
	public static void runTestLogin()
	{
		String exePath = "C:\\fci.cu\\3rd year\\testing\\geckodriver-v0.20.1-win32\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", exePath);
		WebDriver driver=new FirefoxDriver();
		login1(driver);
		login2(driver);
		login3(driver);
		login4(driver);
		login5(driver);

	}
	

}
