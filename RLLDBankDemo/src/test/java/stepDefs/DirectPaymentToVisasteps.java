package stepDefs;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.DirectPaymentToVisa;
import pagefactory.TestBase;

public class DirectPaymentToVisasteps extends TestBase {
	private static final Logger logger = LogManager.getLogger(DirectPaymentToVisasteps.class);
	SoftAssert s=new SoftAssert();
	//WebDriver driver; 
	//WebDriver driver = new ChromeDriver();
	
	DirectPaymentToVisa dv = new DirectPaymentToVisa(driver);
	
	
	@When("I am on the dbankwebpage")
	public void i_am_on_the_dbankwebpage() {
		logger.info("T am on DBankDemo homepage");
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		try {
            getBrowser();
        } catch (Exception ex) {
            Assert.fail("Unable to open browser");
        }
		
		//driver.get("http://dbankdemo.com/bank/login");
	}

	@Then("I sign in using valid credentials")
	public void i_sign_in_using_valid_credentials() {
		logger.info("Signin successfully");
		
		driver.findElement(By.id("username")).sendKeys("sumanarpita31@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Arpita1505@");
		driver.findElement(By.id("submit")).click();
		
	  
	}

	@Then("I enter on the Home Page")
	public void i_enter_on_the_home_page() {
		logger.info("i am on the Homepage");
		System.out.println("title of the is page is : "+ driver.getTitle());
		
	}

	@Then("I  click on Direct Transer to visa")
	public void i_click_on_direct_transer_to_visa() throws InterruptedException {
		logger.info("Clicked on Direct Transfer to visa");
	    Thread.sleep(3000);
		dv.VisaDirectTransfer();
	    Thread.sleep(3000);
	}

	@Then("I select the visa account number")
	public void i_select_the_visa_account_number() throws InterruptedException {
		logger.info("Selecting the visa account number");
	    Thread.sleep(3000);

		dv.VisaAccountNumber();
	}

	@Then("I give the transfer amount as {string}")
	public void i_give_the_transfer_amount_as(String Amount) {
		logger.info("Giving the transfer amount");
	    dv.enterAmount(Amount);
	}

	@Then("I click on  submit")
	public void i_click_on_submit() {
		logger.info("click on submit");
	    dv.clickSubmit();
	    
	    
	}
	@Then("I will get result as {string}")
	public void i_will_get_result_as(String result) {
		String expected = result;
		String actualText = dv.Message();
	    Assert.assertEquals(actualText, expected);
	   //String expected = Base.getDriver().getTitle();
	   //String actual = result;
	   //Assert.assertEquals(actual, expected);
	   //System.out.println(actual);
	   
	   
	}
	
	   
	   
	   
	
}