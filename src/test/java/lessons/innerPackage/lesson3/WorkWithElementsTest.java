package lessons.innerPackage.lesson3;

import com.codeborne.selenide.*;
import config.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class WorkWithElementsTest extends BaseTest {

@BeforeTest
public void download() {
    Configuration.fileDownload = FileDownloadMode.FOLDER;
}

    public static String getFilePathByName(String fileName) {
        return new File("src/main/resources/files/" + fileName).getAbsolutePath();
    }

    @Test
    public void test() {
        Selenide.sleep(1000);
////
/// // ______________________________________________________________________________________________________
        //hover
        $(By.xpath("//nav//div[1]")).hover();
        List<String> coursesList = $$(By.xpath("//nav//div[1]//a")).texts();
        System.out.println(coursesList);

        $(By.xpath("//nav//div[1]//a[text()='JavaScript']")).click();

 // ______________________________________________________________________________________________________
//        $(By.xpath("//input[@placeholder='Username']")).append("standard_user");
//        $(By.xpath("//input[@placeholder='Password']")).append("secret_sauce");
//       // $(By.xpath("//input[@id='login-button']")).submit();
//      // $(By.xpath("//input[@type='submit']")).click();
//        Selenide.actions().sendKeys(Keys.ENTER).perform();
//        Selenide.sleep(1000);
//
//        $(By.xpath("//select[@class='product_sort_container']")).click();
//        SelenideElement selenideElement = $(By.xpath("//select[@class='product_sort_container']/descendant::option"));
//        List<String> texts = $$(By.xpath("//select[@class='product_sort_container']/option")).texts();

//        System.out.println(selenideElement.text());
//        System.out.println(texts);
//        Selenide.actions().sendKeys(Keys.ESCAPE).perform();
       // ______________________________________________________________________________________________________
//відкриваєм ще одне вікно в ютуб
//        Selenide.actions().keyDown( Keys.LEFT_CONTROL).perform();
//        $(By.xpath("//*[@id='logo-icon']//div")).click();
//        Selenide.actions().keyUp( Keys.LEFT_CONTROL).perform();
// // ______________________________________________________________________________________________________
// завантаження файлів
//        $(By.xpath("(//h3//a)[1]")).scrollTo();
////
//        Selenide.sleep(2000);
////
//        try {
//            File download = $(By.xpath("(//h3//a)[1]")).download();
//            Selenide.sleep(5000);
//
//            String path = download.getPath();
//
//            System.out.println(path);
////
//            FileUtils.deleteDirectory(new File("build/downloads"));
////
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        // ______________________________________________________________________________________________________
        //double click
//
//        $(By.xpath("//div[@id='clickMe']")).doubleClick();
//        Selenide.sleep(1000);
//        $(By.xpath("//div[@id='reset']")).click();

        // ______________________________________________________________________________________________________
        //робота з чекбоксами

//        ElementsCollection checkboxesCollection = $$(By.xpath("//input[@type='checkbox']"));
//        for (int i = 0; i <= checkboxesCollection.size(); i++) {
//            checkboxesCollection.get(i).click();
//        }
        // ______________________________________________________________________________________________________
        //завантаження файлу на сторінку

//        $(By.xpath("//input[1]")).uploadFile(new File(getFilePathByName("annual-enterprise-survey-2021-financial-year-provisional-csv.csv")));
        // ______________________________________________________________________________________________________
//        $(By.xpath("//input[@placeholder='Username']")).append("standard_user");
//        $(By.xpath("//input[@placeholder='Password']")).append("secret_sauce");

//        $(By.xpath("//input[@type='submit']")).submit();
//        $(By.xpath("//input[@type='submit']")).click();

//        Selenide.actions().sendKeys(Keys.ENTER).perform();
//
//        Selenide.sleep(1000);
//
//        $(By.xpath("//select[@class='product_sort_container']")).click();

//        String optionText = $(By.xpath("//option[2]")).text();
//        List<String> optionTexts = $$(By.xpath("//option")).texts();
//
//        System.out.println(optionTexts);
//

//        Selenide.actions().sendKeys(Keys.ESCAPE).perform();

        // ______________________________________________________________________________________________________
        //робота з колекціями веб елементів
//        ElementsCollection mainItems = $$(By.xpath("//div[@class='inventory_item_name']"));
//        $(By.xpath("(//div[@class='inventory_item_name'])[2]")).click();

//        mainItems.get(0).click();
//    // ______________________________________________________________________________________________________
//        Selenide.actions().keyDown($(By.xpath("from element")), Keys.SHIFT).perform();
//
//        Selenide.actions().keyUp($(By.xpath("to element")), Keys.SHIFT).perform();


//        $(By.xpath("//*[@id='logo-icon']//div")).click();

//        Selenide.actions().keyDown($(By.xpath("//*[@id='logo-icon']//div")), Keys.LEFT_CONTROL).perform();
//
//        $(By.xpath("//*[@id='logo-icon']//div")).click();
//
//        Selenide.actions().keyUp(Keys.LEFT_CONTROL).perform();


    }

}

