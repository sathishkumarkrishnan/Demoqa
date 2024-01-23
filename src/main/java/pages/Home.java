package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;
import base.BaseTest;

public class Home extends Base{
	
    @FindBy(xpath = "//h5[text()='Elements']")
    private WebElement elementsPageLink;
    
    @FindBy(xpath = "//h5[text()='Forms']")
    private WebElement formsPageLink;
    
    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    private WebElement alertFrameWindowsPageLink;
    
    @FindBy(xpath = "//h5[text()='Widgets']")
    private WebElement widgetsPageLink;
    
    @FindBy(xpath = "//h5[text()='Interactions']")
    private WebElement interactionsLink;
    
    @FindBy(xpath = "//h5[text()='Book Store Application']")
    private WebElement bookStoreApplicationLink;

    public Home(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    
    public void goToElementPage()
    {
    	elementsPageLink.click();
    }
    
    public void goToFormsPage()
    {
    	formsPageLink.click();
    }
    
}
