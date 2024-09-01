package Intershop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPanel {

    @FindBy(xpath = "//li[@id='menu-item-26']//a")
    public WebElement menuMain;

    @FindBy(xpath = "//li[@id='menu-item-30']//a")
    public WebElement menuAccount;

    @FindBy(xpath = "//li[@id='menu-item-29']//a")
    public WebElement menuBin;

    @FindBy(xpath = "//*[@id='menu-item-363']//a")
    public  WebElement menuBonus;

    public HeaderPanel (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
