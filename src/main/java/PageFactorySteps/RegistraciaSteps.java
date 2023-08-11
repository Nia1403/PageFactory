package PageFactorySteps;

import PageFactoryPages.RegistraciaPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistraciaSteps {
    public WebDriver driver;
    RegistraciaPage registraciaPage;

    public RegistraciaSteps (WebDriver driver){
        this.driver = driver;
        registraciaPage = new RegistraciaPage(driver);
    }

    @Step
    public RegistraciaSteps cklickOnRegistracia(){
        registraciaPage.regisrtraciaArea.click();
        return this;
    }
    @Step
    public RegistraciaSteps checkFizikuriPiri(){
        registraciaPage.FizikuriPiri.isEnabled();
        return this;
    }

    @Step
    public RegistraciaSteps cklickOnRegistracButtonBelow(){
        registraciaPage.registraciaButtonBelow.click();
        return this;
    }

    @Step
    public RegistraciaSteps checkTheCheckBox(){
        registraciaPage.checkBoxWithText.isSelected();
        return this;
    }

    @Step
    public RegistraciaSteps sheiyvaneSaxeliisVisible(){
        registraciaPage.messageSheiyvSaxeli.isDisplayed();
        return this;
    }
}
