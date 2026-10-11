package Tests;

import com.codeborne.selenide.DragAndDropOptions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AQA_Task04_1_DragAndDrop_in_Selenide {

    @Test
    void imRealdontKnowWathWariteHier() throws InterruptedException {

        open("https://seleniumbase.io/other/drag_and_drop");
        $("#drag1").shouldBe(visible);
        $("#drag1").dragAndDrop(DragAndDropOptions.to("#div1"));

    }


}
