package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.AddCart;
import Objects.Cart;
import Objects.Checkout;
import Objects.FinishCheckout;
import Objects.Login;

public class TestMethods {

	WebDriver driver ;
	
	@BeforeTest
	public void beforeTest() {
		
		driver = new ChromeDriver();
		
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	

	
	@Test(priority = 1)
	public void Shopping(){
		Login form = new Login(driver);
		form.Login_in("standard_user","secret_sauce");
	
	}
	
	
	@Test(priority = 2)
	public void AddingItems() {
		AddCart add = new AddCart(driver);
		add.AddItem();
		
	}
	
	@Test(priority = 3)
	public void Cart() {
		Cart cart = new Cart(driver);
		cart.Checkout();
	}
	
	@Test(priority =4)
	public void checkout(){
		Checkout check = new Checkout(driver);
		check.verifyCheckoutFormValidation();
		check.Fillform();
		
	}
	
	
	@Test(priority = 5)
	public void Finish() {
		FinishCheckout finish = new FinishCheckout(driver);
		finish.getItemPrices();
		finish.TaxAndTotalSum();
		finish.Success_message();
	}
	

}
