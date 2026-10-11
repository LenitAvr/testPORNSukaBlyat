package Tests;

import com.codeborne.selenide.DragAndDropOptions;
import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AQA_Task04_DragAndDrop_in_Task {

    @Test
    public void ShouldHuyuold() throws InterruptedException{

        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").shouldBe(visible);
        $("#column-a").dragAndDrop(DragAndDropOptions.to("#column-b"));

        //Метод при котором почему-то не переместилось ничего
//        Selenide.actions().moveToElement($("#drag1")).clickAndHold().moveToElement($("#div1")).release().perform();


    }




}
