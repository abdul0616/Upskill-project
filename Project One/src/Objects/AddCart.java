package Objects;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCart {
	
	WebDriver driver;
	
	public AddCart(WebDriver driver) {
		
		this.driver = driver;
		
		
		
	}
	
	
	
	
	By item1 = By.id("add-to-cart-sauce-labs-backpack");
	
	By item2 = By.id("add-to-cart-sauce-labs-bike-light");
	
	By item3 = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
	
	By numb = By.cssSelector("[data-test=\"shopping-cart-badge\"]");
	
	
	

	
	public void AddItem() {
		

		driver.findElement(item1).click();
		WebElement ItemAdded = driver.findElement(By.cssSelector("[data-test=\"shopping-cart-badge\"]"));
		Assert.assertEquals(ItemAdded.getText(), "1");
		driver.findElement(item2).click();
		Assert.assertEquals(ItemAdded.getText(), "2");
		driver.findElement(item3).click();
		Assert.assertEquals(ItemAdded.getText(), "3");
		
		
		
		
//		try {
//		Thread.sleep(1000);
//		List<WebElement> elements = driver.findElements(By.id("add-to-cart"));
//        System.out.println(elements);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	
		
//	      WebDriverWait wait = new WebDriverWait(driver, 10);
	        

//	        // Click on the first three elements
//	        for (int i = 0; i < 3; i++) {
//	            if (i < elements.size()) {
//	                elements.get(i).click();
//	            }
//	        }

		
	}
	
	


}



