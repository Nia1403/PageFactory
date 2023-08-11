package PageFactoryPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DasvenebaPage {
    @FindBy(how = How.XPATH, using = "//li[@class=\"MoreCategories\"]//*[@href=\"/category/24/dasveneba\"]")
    public WebElement dasvenebaButton;

    @FindBys({
    @FindBy(xpath = "//div[@class=\"submit-button\"]"),
    @FindBy(linkText = "ძებნა")
    })
    public WebElement dzebnaButton;

    @FindBys({
    @FindBy(id = "sidebar"),
    @FindBy(id = "minprice")
    })
    public WebElement danButton;


    @FindBys ({
    @FindBy(id = "sidebar"),
    @FindBy(id = "maxprice")
    })
    public WebElement mdeButton;

    public DasvenebaPage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
