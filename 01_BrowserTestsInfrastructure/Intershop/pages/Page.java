package Intershop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {

    protected WebDriver driver;
    public HeaderPanel header;

    @FindBy(xpath = "(//div[@class='promo-widget-wrap']//a)[1]")
    public WebElement chapterBooks;

    @FindBy(xpath = "(//div[@class='promo-widget-wrap']//a)[2]")
    public WebElement chapterTablets;

    @FindBy(xpath = "(//div[@class='promo-widget-wrap']//a)[3]")
    public WebElement chapterCameras;

    public Page(WebDriver driver) {
        this.driver = driver;
        header = new HeaderPanel(driver);
        PageFactory.initElements(driver, this);
    }
}
