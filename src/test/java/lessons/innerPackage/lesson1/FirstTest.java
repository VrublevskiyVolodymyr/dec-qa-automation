package lessons.innerPackage.lesson1;

import com.codeborne.selenide.Selenide;
import config.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class FirstTest extends BaseTest {

    @Test
    public void test() {

//        $(By.tagName("input")).append("asdas");
//        $(By.tagName("input")).append("asdas");
//        $(By.id("user-name")).append("asdasd");
//        $(By.name("password")).append("asd");
//        $(By.className("btn_action")).click();

        $(By.xpath("//input[@id='user-name']")).append("standard_user");
        $(By.xpath("//input[@placeholder='Password']")).append("secret_sauce");
        $(By.xpath("//input[@value='LOGIN']")).click();

//        System.out.println($(By.xpath("//div[text()='Sauce Labs Backpack']")).getOwnText());
        //or
//        System.out.println($(By.xpath("//*[text()='Sauce Labs Backpack']")).getOwnText());
//        $(By.xpath("//div[@class='inventory_item']/child::div[@class='inventory_item_img']")).click();
        //div[@class='inventory_item']/child::div[@class='inventory_item_img']/descendant::a - множина нащадків
        //div[@class='inventory_item']/descendant-or-self::div - влючає сам елемент від якого відштовхуємся
        //div[@class='inventory_item_name']/ancestor::div[@class='inventory_list'] - множина батьків
        //div[@class='inventory_item']/parent::div- шукає батька на 1 сходинку догори
        //div[@class='inventory_item_img']/following-sibling::div - наступний сусід на одному рівні
        //     (//div[@class='pricebar']/preceding-sibling::div)[1] - попередній сусід на одному рівні
                //button[contains(@class, 'btn_inventory')] - елемент який містить класс...
        //nav/child::a[text()='Logout']
      //  (//nav/child::a[text()='Logout']/following-sibling::a/preceding-sibling::a)[2]
        $(By.xpath("(//div[@class='inventory_item']//div[@class='inventory_item_name'])[4]")).click();
    }

}
