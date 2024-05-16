package vtiger.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewCampaignPage {
	
	public CreatingNewCampaignPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="campaignname")
	private WebElement campaignNameTextField;
	
	@FindBy(xpath="//input[@title=\"Save [Alt+S]\"]")
	private WebElement campaignSaveButton;

	public WebElement getCampaignNameTextField() {
		return campaignNameTextField;
	}

	public WebElement getCampaignSaveButton() {
		return campaignSaveButton;
	}
	
	public void enterCampaignName(String campaignName) {
		campaignNameTextField.sendKeys(campaignName);
	}
	
	public void clickOnSaveButton() {
		campaignSaveButton.click();
	}

}
