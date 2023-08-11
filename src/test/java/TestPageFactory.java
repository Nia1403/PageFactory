import PageFactoryPages.DasvenebaPage;
import PageFactorySteps.AvtorizaciaSteps;
import PageFactorySteps.DasvenebaSteps;
import PageFactorySteps.RegistraciaSteps;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestPageFactory {
    public WebDriver driver;
    @BeforeTest
    public void before(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void hereIsTest(){
        AvtorizaciaSteps avtorizaciaSteps = new AvtorizaciaSteps(driver);
        avtorizaciaSteps.openHomepage()
                .chlickOnShesvla()
                .emailisSheyvana()
                .passwortisSheyvana()
                .cklickOnAvtorizacia()
                .assertMessageText()
                .assertParoliField();

        RegistraciaSteps registraciaSteps = new RegistraciaSteps(driver);
        registraciaSteps.cklickOnRegistracia()
                .checkFizikuriPiri()
                .cklickOnRegistracButtonBelow()
                .checkTheCheckBox()
                .sheiyvaneSaxeliisVisible();

        DasvenebaSteps dasvenebaSteps = new DasvenebaSteps(driver);
        dasvenebaSteps.cklickOnDasvenebaButton()
                .scrollDown()
                .putDanRange()
                .putMdeRange()
                .chlickOnDzebna();

    }
    @AfterTest
    public void after(){
        driver.quit();
    }






}
