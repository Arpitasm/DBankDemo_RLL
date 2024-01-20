package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DirectPaymentToVisa {

	//private final WebDriver driver;

	@FindBy(id = "visa-transfer-menu-item")
	private WebElement TransfertoVisa;

	@FindBy(id = "extAccount")
	private WebElement selectAccount;

	@FindBy(id = "extAmount")
	private WebElement Amount;

	@FindBy(xpath = "//button[@class='btn btn-primary btn-sm']")
	private WebElement submitButton;
	
	@FindBy(xpath = "//span[@class='badge badge-pill badge-danger']")
	WebElement msg;

	

	public DirectPaymentToVisa(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void VisaDirectTransfer() {
		TransfertoVisa.click();
		
	}
	public void VisaAccountNumber() {
		Select dn  = new Select(selectAccount);
		
		
		

       dn.selectByIndex(1);
      

	}
	
	
	public void enterAmount(String money) {
		Amount.sendKeys(money);
	}
	public void clickSubmit() {
		submitButton.click();
	}
	public String Message() {
		String result = msg.getText();
		return result;

	}

	
}