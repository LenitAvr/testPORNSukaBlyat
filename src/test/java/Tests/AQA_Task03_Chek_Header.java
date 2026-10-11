package Tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;

public class AQA_Task03_Chek_Header {

    @Test
    void chekHeaderinGithub() throws InterruptedException {

        Selenide.open("https://github.com");
        Selenide.$(byText("Solutions")).hover();
        Selenide.$(byText("Enterprises")).click();
        Selenide.$$("h1").findBy(text("GitHub Enterprise")).shouldBe(visible);


    }
}
