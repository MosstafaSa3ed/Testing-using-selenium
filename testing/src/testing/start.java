package testing;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class start {
	
	static void login(WebDriver driver)
	{
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("jahidd26");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
	}
	
	
	static boolean searchBookValid_1(WebDriver driver)
	{

		driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div[3]/div[1]/div[2]/div/label/input")).clear();
		driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div[3]/div[1]/div[2]/div/label/input")).sendKeys("Computer Graphics");;
		String s=driver.findElement(By.xpath("//*[@id=\"example_info\"]")).getText();
		Scanner scan=new Scanner(s);
		scan.next();scan.next();scan.next();
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
			if(!driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div[3]/table/tbody/tr["+i+"]/td[2]")).getText().contains("Computer Graphics"))
					return false;
				
		return true;
	}
	
	static boolean searchBookValid_2(WebDriver driver)
	{

		driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div[3]/div[1]/div[2]/div/label/input")).clear();
		driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div[3]/div[1]/div[2]/div/label/input")).sendKeys("comPuter gRaphics");;
		String s=driver.findElement(By.xpath("//*[@id=\"example_info\"]")).getText();
		Scanner scan=new Scanner(s);
		scan.next();scan.next();scan.next();
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
			if(!driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div[3]/table/tbody/tr["+i+"]/td[2]")).getText().contains("Computer Graphics"))
				return false;
		return true;
	}
	
	static boolean searchBookValid_3(WebDriver driver)
	{
		driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div[3]/div[1]/div[2]/div/label/input")).clear();
		driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div[3]/div[1]/div[2]/div/label/input")).sendKeys("computer");;
		String s=driver.findElement(By.xpath("//*[@id=\"example_info\"]")).getText();
		Scanner scan=new Scanner(s);
		scan.next();scan.next();scan.next();
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
			if(!driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div[3]/table/tbody/tr["+i+"]/td[2]")).getText().contains("Computer"))
				return false;
		return true;
	}
	
	static boolean searchBookInValid_1(WebDriver driver)
	{

		driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div[3]/div[1]/div[2]/div/label/input")).clear();
		driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div[3]/div[1]/div[2]/div/label/input")).sendKeys("lol");;
		String s=driver.findElement(By.xpath("//*[@id=\"example_info\"]")).getText();
		Scanner scan=new Scanner(s);
		scan.next();scan.next();scan.next();
		int n=scan.nextInt();
		if(n!=0)
			return false;
		return true;
	}
	
	static boolean searchBookInValid_2(WebDriver driver)
	{
		driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div[3]/div[1]/div[2]/div/label/input")).clear();
		driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div[3]/div[1]/div[2]/div/label/input")).sendKeys(" ");;
		String s=driver.findElement(By.xpath("//*[@id=\"example_info\"]")).getText();
		Scanner scan=new Scanner(s);
		scan.next();scan.next();scan.next();
		int n=scan.nextInt();
		if(n!=0)
			return false;
		return true;
	}
	
	
	public static void RunTestSearchBook()
	{
		String exePath="C:\\fci.cu\\3rd year\\testing\\geckodriver-v0.20.1-win32\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",  exePath);
		WebDriver driver = new FirefoxDriver();
		
		// Create a new instance of the Firefox driver
			
	        //Launch the Online Store Website
			driver.get("http://localhost/library-master/member");
			login(driver);
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[4]/a")).click();
			//////TC21
			if(searchBookValid_1(driver))
				System.out.println("TC21 Pass");
			else 
				System.out.println("TC21 Fail");
			//////TC22	
			if(searchBookValid_2(driver))
				System.out.println("TC22 Pass");
			else 
				System.out.println("TC22 Fail");
			//////TC23
			if(searchBookValid_3(driver))
				System.out.println("TC23 Pass");
			else 
				System.out.println("TC23 Fail");
			//////TC24
			if(searchBookInValid_1(driver))
				System.out.println("TC24 Pass");
			else 
				System.out.println("TC24 Fail");
			//////TC25
			if(searchBookInValid_2(driver))
				System.out.println("TC25 Pass");
			else 
				System.out.println("TC25 Fail");
			
			
			// driver.quit();

	}

}
