package testing;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SearchAndTrans {

	
	static void login(WebDriver driver)
	{
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("jahidd26");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
	}
	
	static boolean AdvSearch1(WebDriver driver) //book title bs   
	{
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).sendKeys("Computer Graphics");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[3]/div/button")).click();
		String s=driver.findElement(By.xpath("//*[@id=\"example_info\"]")).getText();
		Scanner scan= new Scanner(s);
		scan.next();scan.next();scan.next();
		int num= scan.nextInt();
		if (num>0)
			return false;
		return true;
	}
	
	static boolean AdvSearch2(WebDriver driver) //book title w auther wa7d bs  
	{
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).sendKeys("Computer Graphics");
		driver.findElement(By.xpath("//*[@id=\"inputPassword\"]")).sendKeys("Donald Hearn");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[3]/div/button")).click();
		
		String s=driver.findElement(By.xpath("//*[@id=\"example_info\"]")).getText();
		Scanner scan= new Scanner(s);
		scan.next();scan.next();scan.next();
		int num= scan.nextInt();
		System.out.println(num);
	
		for(int i=1 ; i<=num ; i++)
		{
			if(!driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div[3]/table/tbody/tr["+i+"]/td[2]")).getText().contains("Computer Graphics")  || !driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div[3]/table/tbody/tr["+i+"]/td[4]")).getText().contains("Donald Hearn"))
				return false;
		}
		
		return true;
	}
	
	static boolean AdvSearch3(WebDriver driver) //with no data
	{
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"inputPassword\"]")).sendKeys("");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[3]/div/button")).click();
		
		String s=driver.findElement(By.xpath("//*[@id=\"example_info\"]")).getText();
		Scanner scan= new Scanner(s);
		scan.next();scan.next();scan.next();
		int num= scan.nextInt();
		if (num>0)
			return false;
		return true;
	}
	static boolean AdvSearch4(WebDriver driver) //book category not book title
	{
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).sendKeys("Graphics Design ");
		driver.findElement(By.xpath("//*[@id=\"inputPassword\"]")).sendKeys("Donald Hearn");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[3]/div/button")).click();
		
		String s=driver.findElement(By.xpath("//*[@id=\"example_info\"]")).getText();
		Scanner scan= new Scanner(s);
		scan.next();scan.next();scan.next();
		int num= scan.nextInt();
		for(int i=1 ; i<=num ; i++)
		{
			if(!driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div[3]/table/tbody/tr["+i+"]/td[2]")).getText().contains("Graphics Design")  || !driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div[3]/table/tbody/tr["+i+"]/td[4]")).getText().contains("Donald Hearn"))
				return false;
		}
		return true;
	}
	static boolean AdvSearch5(WebDriver driver) //book category & book title
	{
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).sendKeys("Computer Graphics");
		driver.findElement(By.xpath("//*[@id=\"inputPassword\"]")).sendKeys("Graphics Design");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[3]/div/button")).click();
		
		String s=driver.findElement(By.xpath("//*[@id=\"example_info\"]")).getText();
		Scanner scan= new Scanner(s);
		scan.next();scan.next();scan.next();
		int num= scan.nextInt();
		if (num>0)
			return false;
		return true;
	}
	
	static boolean Tranaction1(WebDriver driver) ///search by emal in borrowed books
	{
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[3]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div[3]/div[1]/div[2]/div/label/input")).sendKeys("jahidd26@gmail.com");
		
		String s=driver.findElement(By.xpath("//*[@id=\"example_info\"]")).getText();
		Scanner scan= new Scanner(s);
		scan.next();scan.next();scan.next();
		int num= scan.nextInt();
		for(int i=1 ; i<num ; i++)
		{
			if(!driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div[3]/table/tbody/tr["+i+"]/td[5]")).getText().contains("jahidd26@gmail.com"))
				return false;
		}
		return true;
	}
	
	static boolean Tranaction2(WebDriver driver)
	{
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[3]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div[3]/div[1]/div[2]/div/label/input")).sendKeys("Fifth Year");
		String s=driver.findElement(By.xpath("//*[@id=\"example_info\"]")).getText();
		Scanner scan= new Scanner(s);
		scan.next();scan.next();scan.next();
		int num= scan.nextInt();
		if(num> 0)
			return false;
		return true;
	}
	static boolean Tranaction3(WebDriver driver)
	{
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[3]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div[3]/div[1]/div[2]/div/label/input")).sendKeys("Computer Graphics");
		String s=driver.findElement(By.xpath("//*[@id=\"example_info\"]")).getText();
		Scanner scan= new Scanner(s);
		scan.next();scan.next();scan.next();
		int num= scan.nextInt();
		for(int i=1 ; i<=num ; i++)
		{
			if(!driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div[3]/table/tbody/tr["+i+"]/td[1]")).getText().contains("Computer Graphics"))
				return false;
		}
		return true;
	}
	static boolean Tranaction4(WebDriver driver)
	{
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[3]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div[3]/div[1]/div[2]/div/label/input")).sendKeys("2015-12-17");
		String s=driver.findElement(By.xpath("//*[@id=\"example_info\"]")).getText();
		Scanner scan= new Scanner(s);
		scan.next();scan.next();scan.next();
		int num= scan.nextInt();
		if(num==0)
			return false;
		return true;
	}
	static boolean Tranaction5(WebDriver driver)
	{
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[3]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div[3]/div[1]/div[2]/div/label/input")).sendKeys("jahid mahmud");
		String s=driver.findElement(By.xpath("//*[@id=\"example_info\"]")).getText();
		Scanner scan= new Scanner(s);
		scan.next();scan.next();scan.next();
		int num= scan.nextInt();
		for(int i=1 ; i<=num ; i++)
		{
			if(!driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div[3]/table/tbody/tr["+i+"]/td[2]")).getText().contains("jahid mahmud"))
				return false;
		}
		return true;
	}
	
	static void mainMaii()
	{
		String exePath = "C:\\fci.cu\\3rd year\\testing\\geckodriver-v0.20.1-win32\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", exePath);
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost/library-master/member");
		login(driver);
		
		if(!AdvSearch1(driver))
			System.out.println("TC11 pass el7");
		if(AdvSearch2(driver))
			System.out.println("TC12 pass el7");
		if(!AdvSearch3(driver))
			System.out.println("TC13 fail :'(");
		if(!AdvSearch4(driver))
			System.out.println("TC14 fail :'(");
		if(!AdvSearch5(driver))
			System.out.println("TC15 fail :'(");
		
		if(Tranaction1(driver))
			System.out.println("TC16 pass el7");
		if(Tranaction2(driver))
			System.out.println("TC17 pass el7");
		if(Tranaction3(driver))
			System.out.println("TC18 pass el7");
		if(!Tranaction4(driver))
				System.out.println("TC19 fail :'(");
		if(Tranaction5(driver))
			System.out.println("TC20 pass el7");
	}

}
