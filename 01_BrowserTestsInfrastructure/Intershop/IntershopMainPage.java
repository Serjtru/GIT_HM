package Intershop;

import Intershop.pages.MainPage;
import org.junit.*;
import org.junit.Test;

public class IntershopMainPage extends TestBase {

    @Test
    public void openChapterBooks() {
        //arrange
        var page = new MainPage(driver);

        //act
        page.open();
        page.chapterBooks.click();
        page.textChapters.getText();

        //assert
        page.assertTrueChapter();
    }

    @Test
    public void openChapterTablets() {
        //arrange
        var page = new MainPage(driver);

        //act
        page.open();
        page.chapterTablets.click();
        page.textChapters.getText();

        //assert
        Assert.assertEquals("Некорректный раздел Планшеты", "Планшеты", "Планшеты");
    }

    @Test
    public void openChapterCameras() {
        //arrange
        var page = new MainPage(driver);

        //act
        page.open();
        page.chapterCameras.click();
        page.textChapters.getText();

        //assert
        Assert.assertEquals("Некорректный раздел Фотоаппараты", "Фотоаппараты", "Фотоаппараты");
    }

    @Test
    public void clickMenuMain() {
        //arrange
        var page = new MainPage(driver);

        //act
        page.open();
        page.header.menuMain.click();
        page.ContactsText.getText();

        //assert
        Assert.assertEquals("Не переходит на главную страницу при нажании ГЛАВНАЯ", "Контактная информация", "Контактная информация");
    }

    @Test
    public void clickMenuAccount() {
        //arrange
        var page = new MainPage(driver);

        //act
        page.open();
        page.header.menuAccount.click();
        page.textAccount.getText();

        //assert
        Assert.assertEquals("Не переходит на страницу моего аккаунта при нажании МОЙ АККАУНТ", "Мой аккаунт", "Мой аккаунт");
    }

    @Test
    public void clickMenuBin() {
        //arrange
        var page = new MainPage(driver);

        //act
        page.open();
        page.header.menuBin.click();
        page.textBin.getText();

        //assert
        Assert.assertEquals("Не переходит в корзину при нажании КОРЗИНА", "Корзина", "Корзина");
    }

    @Test
    public void search() {
        //arrange
        var page = new MainPage(driver);

        //act
        page.open();
        page.findElementStringSearch();
        page.searchButton.click();
        page.searchResult.getText();

        //assert
        Assert.assertEquals("Не отобразился текст при поиске", "РЕЗУЛЬТАТЫ ПОИСКА: “ХОЛОДИЛЬНИКИ”", "РЕЗУЛЬТАТЫ ПОИСКА: “ХОЛОДИЛЬНИКИ”");
    }

}