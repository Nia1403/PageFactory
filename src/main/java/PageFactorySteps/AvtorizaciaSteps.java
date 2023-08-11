package PageFactorySteps;
import Data.PersonData;
import PageFactoryPages.AvtorizaciaPage;
import PageFactoryPages.MainPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AvtorizaciaSteps {
    public WebDriver driver;
    PersonData personData;
    AvtorizaciaPage avtorizaciaPage;
    MainPage mainPage;

    public AvtorizaciaSteps(WebDriver driver){
        this.driver = driver;
        personData = new PersonData();
        avtorizaciaPage = new AvtorizaciaPage(driver);
        mainPage = new MainPage(driver);
    }

    @Step
    public AvtorizaciaSteps openHomepage(){
        driver.get(personData.link);
        return this;
    }
    @Step
    public AvtorizaciaSteps chlickOnShesvla(){
        mainPage.shesvla.click();
        return this;
    }
    @Step
    public AvtorizaciaSteps emailisSheyvana(){
        avtorizaciaPage.emailInput.sendKeys(personData.emalAdress);
        return this;
    }

    @Step
    public AvtorizaciaSteps passwortisSheyvana(){
        avtorizaciaPage.passwortInput.sendKeys(personData.passwort);
        return this;
    }

    @Step
    public AvtorizaciaSteps cklickOnAvtorizacia(){
        avtorizaciaPage.avtorizaciaButton.click();
        return this;
    }

    @Step
    public AvtorizaciaSteps assertMessageText(){
        Assert.assertEquals(avtorizaciaPage.messageTextId.getText(), personData.MessageText);
        return this;
    }

    @Step
    public AvtorizaciaSteps assertParoliField(){
       Assert.assertEquals(avtorizaciaPage.hiddenPasswordField, "პაროლი");
       return this;
    }


}
