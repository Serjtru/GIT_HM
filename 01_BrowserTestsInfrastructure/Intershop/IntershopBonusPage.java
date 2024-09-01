package Intershop;

import Intershop.pages.BonusPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class IntershopBonusPage extends TestBase {

    @Test
    public void checkMenuBonus() {
        //arrange
        var page = new BonusPage(driver);

        //act
        page.open();
        page.header.menuBonus.click();
        page.textDiscount.getText();

        //assert
        page.assertCheckMenuBonus();
    }
    @Test
    public void checkMandatoryPhone() {
        //arrange
        var page = new BonusPage(driver);

        //act
        page.open();
        page.header.menuBonus.click();
        page.findElementFormName();
        page.findElementButtonClick();
        page.textMandatoryPhone.getText();

        //assert
        page.assertCheckMandatoryPhone();
    }
    @Test
    public void checkMandatoryName() {
        //arrange
        var page = new BonusPage(driver);

        //act
        page.open();
        page.header.menuBonus.click();
        page.findElementFormPhone();
        page.findElementButtonClick();
        page.textMandatoryName.getText();

        //assert
        page.assertCheckMandatoryName();
    }

    @Test
    public void checkWrongPhoneNumber() {
        //arrange
        var page = new BonusPage(driver);

        //act
        page.open();
        page.header.menuBonus.click();
        page.findElementFormName();
        page.findElementFormPhoneWrong();
        page.findElementButtonClick();
        page.textWrongPhone.getText();

        //assert
        page.assertCheckWrongPhoneNumber();
    }

    @Test
    public void checkOurCardReady() {
        //arrange
        var page = new BonusPage(driver);

        //act
        page.open();
        page.header.menuBonus.click();
        page.findElementFormName();
        page.findElementFormPhone();
        page.findElementButtonClick();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='bonus_main']/h3")));
        page.textCardIsReady.getText();

        //assert
        page.assertCheckOurCardReady();
    }
}
