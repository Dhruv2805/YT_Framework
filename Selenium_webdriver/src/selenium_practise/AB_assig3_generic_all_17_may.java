package selenium_practise;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AB_assig3_generic_all_17_may 
{
	 ChromeDriver driver;
	
	 String visibletext;
	
	 String value;
	@Before
	public void befo()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sushma\\Desktop\\chrome_version_83_selenium_driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println("before annotations executed properly");
	}
	
	@Test
	public void test()
	{
	
		WebElement firstname=driver.findElement(By.id("u_0_m"));
		firstname.sendKeys("dhruv");
		
		WebElement Surname=driver.findElement(By.name("lastname"));
		Surname.sendKeys("sharma");
		
		WebElement Mobile_number=driver.findElement(By.cssSelector("input#u_0_r"));
		Mobile_number.sendKeys("1234567898");
		
		WebElement password=driver.findElement(By.cssSelector("input#u_0_w"));
		password.sendKeys("singup@uto1"); 
		
		//GENERIC METHOD
		
		generic_sign_up_automate gsa=new generic_sign_up_automate();
		
		WebElement day=driver.findElement(By.id("day"));
		gsa.dropdown_index_selection(day, "28");
		
		WebElement month=driver.findElement(By.id("month"));
		gsa.dropdown_visibletext_selection(month, "May");
		
		WebElement Year=driver.findElement(By.cssSelector("select[title='Year']"));
		gsa.dropdown_value_selection(Year, "1994");
		
		WebElement sex=driver.findElement(By.id("u_0_7"));
		sex.click();
		System.out.println("test annotations executed properly");
	}
	
		public void dropdown_index_selection(WebElement dropdownelement,String index)
		{
			Select sel1=new Select(dropdownelement);
			sel1.selectByVisibleText(index);
		} 
	
			public void dropdown_visibletext_selection(WebElement dropdownelement,String visibletext)
		{
			Select sel2=new Select(dropdownelement);
			sel2.selectByVisibleText(visibletext);
		}	
		public void dropdown_value_selection(WebElement dropdownelement,String value)
		{
				Select sel3=new Select(dropdownelement);
				sel3.selectByVisibleText(value); 
		} 
	

@After
		public void afo()
	{
	System.out.println("after annotations executed properly");
		driver.close();

	}
}
