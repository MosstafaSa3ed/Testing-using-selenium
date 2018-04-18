package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Functionalities 
{
	public static boolean functionality1(WebDriver driver)//TC6 .. display all users
	{
		driver.get("http://localhost/library-master/member/index.php");
		String B;
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("jahidd26");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[2]/ul/li[1]/a")).click();
		B=driver.findElement(By.xpath("//*[@id=\"example_info\"]")).getText();
		for(int i=0;i<B.length();i++)
		{
			if(B.charAt(i)=='f')
			{
				if(B.charAt(i+2)=='0')
					return true;
			}
		}
		return false;
	}
	public static boolean functionality2(WebDriver driver)//TC7 .. search with year only
	{
		driver.get("http://localhost/library-master/member/index.php");
		String B;
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("jahidd26");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[6]/a")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div[1]/div/input")).sendKeys("2014");
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div[2]/div/input")).sendKeys("2015");
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div[3]/div/button")).click();
		B=driver.findElement(By.xpath("//*[@id=\"example_info\"]")).getText();
		for(int i=0;i<B.length();i++)
		{
			if(B.charAt(i)=='f')
			{
				if(B.charAt(i+2)=='0')
					return false;
			}
		}
		return true;
	}
	public static boolean functionality3(WebDriver driver)//TC8 .. search with full date
	{
		driver.get("http://localhost/library-master/member/index.php");
		String B;
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("jahidd26");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[6]/a")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div[1]/div/input")).sendKeys("2014-10-6");
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div[2]/div/input")).sendKeys("2015-10-6");
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div[3]/div/button")).click();
		B=driver.findElement(By.xpath("//*[@id=\"example_info\"]")).getText();
		for(int i=0;i<B.length();i++)
		{
			if(B.charAt(i)=='f')
			{
				if(B.charAt(i+2)=='0')
					return false;
			}
		}
		return true;
	}
	public static boolean functionality4(WebDriver driver)//TC10 .. search with empty date
	{
		driver.get("http://localhost/library-master/member/index.php");
		String B;
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("jahidd26");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[6]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div[1]/div/input")).sendKeys("2014-10-6");
//		driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div[2]/div/input")).sendKeys("2015-10-6");
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/form/div[3]/div/button")).click();
		B=driver.findElement(By.xpath("//*[@id=\"example_info\"]")).getText();
		for(int i=0;i<B.length();i++)
		{
			if(B.charAt(i)=='f')
			{
				if(B.charAt(i+2)=='0')
					return true;
			}
		}
		return false;
	}
	public static void runTestFubctionalities()
	{
		String exePath = "C:\\fci.cu\\3rd year\\testing\\geckodriver-v0.20.1-win32\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", exePath);
		WebDriver driver=new FirefoxDriver();
		functionality1(driver);
		functionality2(driver);
		functionality3(driver);
		functionality4(driver);

	}
	
}
