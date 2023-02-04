package Page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class EtsyPage {

    public EtsyPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="global-enhancements-search-query")
    public WebElement searchBox;

    @FindBy (xpath = "//div[@data-id='search-bar']//button[@type='submit']")
    public WebElement searchButton;






}
