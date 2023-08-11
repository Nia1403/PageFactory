package PageFactoryPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistraciaPage {
    @FindBy (how = How.XPATH, using = "//*[@class=\"profile-tabs__item ui-state-default ui-corner-top\"]")
    public WebElement regisrtraciaArea;

    @FindBy (how = How.XPATH, using = "//*[@class=\"profile-tabs__link\"]")
    public WebElement FizikuriPiri;

    @FindBy (how = How.XPATH, using = "//input[@checked]")
    public WebElement checkBoxWithText;

    @FindBy (id = "physicalInfoMassage")
    public WebElement messageSheiyvSaxeli;

    @FindBy (how = How.XPATH, using = "//a[@onclick=\"checkPhysicalFormSubmit()\"]")
    public WebElement registraciaButtonBelow;

    public RegistraciaPage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }


}
