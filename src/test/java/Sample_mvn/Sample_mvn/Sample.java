package Sample_mvn.Sample_mvn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample {
	
	public static  WebDriver driver;
	
	@BeforeTest
	public void method1()
	{
		System.out.println("open the browser");
		        
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
        driver=new ChromeDriver();
	}
	
	
	@Test
	public void method2(){
		System.out.println("Test1");
		driver.get("http://google.com");
	}
	

}
