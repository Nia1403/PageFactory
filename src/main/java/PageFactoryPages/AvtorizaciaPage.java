package PageFactoryPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AvtorizaciaPage {
    @FindBy (id = "emailinp")
    public WebElement emailInput;

    @FindBy (id = "feed-password")
    public WebElement passwortInput;

    @FindBy (id = "AuthBtn")
    public WebElement avtorizaciaButton;

    @FindBy (id = "authInfo")
    public WebElement messageTextId;

    @FindBy (id = "placeholder")
    public WebElement hiddenPasswordField;

    public AvtorizaciaPage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }

}
