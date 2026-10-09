package Tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;

public class HomeTask_notPorn {

    @Test
    void broArturWhereMyWork() throws InterruptedException {

        Selenide.open("https://github.com");
        Selenide.$(byText("Solutions")).hover();
        Selenide.$(byText("Enterprises")).click();
        Selenide.$$("h1").findBy(text("GitHub Enterprise")).shouldBe(visible);


    }
}
