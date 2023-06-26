package testPackage.innerPackage;

import com.codeborne.selenide.Selenide;
import config.BaseTest;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    @Test(description = "TEST-25: Verify user is able to open URL of google.com")
    public void test() {
        Selenide.open("https://www.google.com/");
    }

}
