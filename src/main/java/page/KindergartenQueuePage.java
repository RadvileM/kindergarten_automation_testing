package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KindergartenQueuePage extends AbstractPage {
	WebDriverWait wait = new WebDriverWait(driver, 5);

	/* Nav bar link */
	@FindBy(css = "#root > nav > ul > li:nth-child(1) > a")
	public WebElement kinderGartenQueueButton;

	/* buttons */
	@FindBy(xpath = "//button[@class='col-12 btn btn-success m-1']")
	public WebElement createKindergartenQueue;

	@FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
	public WebElement confirmCreateQueueButton;

	@FindBy(xpath = "//button[@class='col-12 btn btn-lg btn-secondary m-1']")
	public WebElement cancelCreatedQueueButton;

	@FindBy(xpath = "//button[@class='swal-button swal-button--cancel']")
	public WebElement cancelConfirmCreateQueueButton;

	/* texts */
	@FindBy(css = "#root > div > div > div > div > div > div:nth-child(1) > div > p:nth-child(1)")
	public WebElement registeredChildNumber;


	/* methods */
	public void clickKindergartenQueuePage() {
		kinderGartenQueueButton.click();
	}

	public String textOnKindergartenQueueButton() {
		return createKindergartenQueue.getText();
	}

	public void clickCreateKindergartenQueueButton() {
		createKindergartenQueue.click();
		//wait.until(ExpectedConditions
				//.presenceOfElementLocated(By.xpath("//button[@class='swal-button swal-button--confirm']")));
	}

	public void clickConfirmButtonCreateQueue() {
		confirmCreateQueueButton.click();
		//wait.until(ExpectedConditions.presenceOfElementLocated(
			//	By.cssSelector("#root > div > div > div > div > div > div:nth-child(1) > div > p:nth-child(1)")));
	}

	public void clickCancelCreatedQueueButton() {
		cancelCreatedQueueButton.click();
		//wait.until(ExpectedConditions.presenceOfElementLocated(
				//By.cssSelector("#root > div > div > div > div > div > div:nth-child(1) > div > p:nth-child(2)")));
	}

	public void clickCancelConfirmCreateQueueButton() {
		cancelConfirmCreateQueueButton.click();
	}

	public String registeredChildNumber() {
		return registeredChildNumber.getText();
	}

	public String cancelQeueButtonText() {
		return cancelCreatedQueueButton.getText();
	}

	/* waits */

	public void waitForCreateQueueButton() {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(this.createKindergartenQueue));
	}
	
	public void waitForConfirimCreateQueueButton() {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(this.confirmCreateQueueButton));
	}
	
	public void waitForCancelCreateQueueButton() {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(this.cancelCreatedQueueButton));
	}
	
	public KindergartenQueuePage(WebDriver driver) {
		super(driver);
	}

}
