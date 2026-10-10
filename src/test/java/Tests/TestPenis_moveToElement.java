package Tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.DragAndDropOptions;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class TestPenis_moveToElement {

    @Test
    void imRealdontKnowWathWariteHier() throws InterruptedException {
        //Drag&Drop:
        Configuration.browser = "firefox";

        Selenide.open("https://seleniumbase.io/other/drag_and_drop");
        Selenide.$("#drag1").shouldBe(visible);

        Selenide.$("#drag1").dragAndDrop(DragAndDropOptions.to("#div1"));

        //Метод при котором почему-то не переместилось ничего
        //Selenide.actions().moveToElement($("#drag1")).clickAndHold().moveToElement($("#div1")).release().perform();

    }


}
