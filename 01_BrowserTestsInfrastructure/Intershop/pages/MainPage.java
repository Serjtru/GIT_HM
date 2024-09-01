package Intershop.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends Page{

    private String url = "https://intershop6.skillbox.ru";

    @FindBy (xpath = "//*[@class='entry-title ak-container']")
    public WebElement textChapters;

    @FindBy (xpath = "//div[@class='banner-text wow fadeInLeft']//*[@class='widget-title']")
    public WebElement ContactsText;

    @FindBy (xpath = "//*[@class='post-title']")
    public WebElement textAccount;

    @FindBy (xpath = "//span[@class='current']")
    public WebElement textBin;

    @FindBy (xpath = "//*[@class='search-field']")
    public WebElement stringSearch;

    @FindBy (xpath = "//button[@class='searchsubmit']")
    public WebElement searchButton;

    @FindBy (xpath = "//*[@class='entry-title ak-container']")
    public WebElement searchResult ;

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void open(){
        driver.navigate().to(url);
    }

    public void findElementStringSearch(){
        stringSearch.sendKeys("Холодильники");
    }

    public void assertTrueChapter(){
        Assert.assertEquals("Некорректный раздел Книги","Книги", "Книги");
    }
}
