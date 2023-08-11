package PageFactorySteps;

import Data.PersonData;
import PageFactoryPages.DasvenebaPage;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class DasvenebaSteps {
    public WebDriver driver;
    DasvenebaPage dasvenebaPage;
    PersonData personData;
    public DasvenebaSteps (WebDriver driver){
        this.driver = driver;
        personData = new PersonData();
        dasvenebaPage = new DasvenebaPage(driver);
    }


    @Step
    public DasvenebaSteps cklickOnDasvenebaButton(){
        dasvenebaPage.dasvenebaButton.click();
        return this;
    }

    @Step
    public DasvenebaSteps scrollDown(){
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        return this;
    }

    @Step
    public DasvenebaSteps putDanRange(){
        dasvenebaPage.danButton.sendKeys("170");
        return this;
    }

    @Step
    public DasvenebaSteps putMdeRange(){
        dasvenebaPage.mdeButton.sendKeys("180");
        return this;
    }

    @Step
    public DasvenebaSteps chlickOnDzebna(){
        dasvenebaPage.dzebnaButton.click();
        return this;
    }






}
