package Intershop.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BonusPage extends Page{

    private String url = "https://intershop6.skillbox.ru";

    @FindBy (xpath = "//*[@class='post-title']")
    public WebElement textDiscount;

    @FindBy (xpath = "//*[@id='bonus_phone']")
    public WebElement formPhone;

    @FindBy (xpath = "//*[@id='bonus_username']")
    public WebElement formName;

    @FindBy (xpath = "//*[@id='bonus_main']/button")
    public WebElement buttonApplyOrder;

    @FindBy (xpath = "//*[@id='bonus_main']/h3")
    public WebElement textCardIsReady;

    @FindBy (xpath = "//*[@id='bonus_content']")
    public WebElement textMandatoryPhone;

    @FindBy (xpath = "//*[@id='bonus_content']")
    public WebElement textMandatoryName;

    @FindBy (xpath = "//*[@id='bonus_content']")
    public WebElement textWrongPhone;

    public BonusPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void open(){
        driver.navigate().to(url);
    }
    public void findElementFormName(){
        formName.sendKeys("Сергей");
    }
    public void findElementButtonClick(){
        buttonApplyOrder.click();
    }
    public void findElementFormPhone(){
        formPhone.sendKeys("89263305093");
    }
    public void findElementFormPhoneWrong(){
        formPhone.sendKeys("8926330509");
    }

    public void assertCheckMenuBonus(){
        Assert.assertEquals("Некорректный раздел 'Бонусная программа'", "БОНУСНАЯ ПРОГРАММА", "БОНУСНАЯ ПРОГРАММА");
    }

    public void assertCheckMandatoryPhone(){
        Assert.assertEquals("Не появился текст", "Поле \"Телефон\" обязательно для заполнения", "Поле \"Телефон\" обязательно для заполнения");
    }

    public void assertCheckMandatoryName(){
        Assert.assertEquals("Не появился текст", "Поле \"Имя\" обязательно для заполнения", "Поле \"Имя\" обязательно для заполнения");
    }

    public void assertCheckWrongPhoneNumber(){
        Assert.assertEquals("Не появился текст", "Введен неверный формат телефона", "Введен неверный формат телефона");
    }

    public void assertCheckOurCardReady() {
        Assert.assertEquals("Не появился текст", "Ваша карта оформлена!", "Ваша карта оформлена!");
    }
}