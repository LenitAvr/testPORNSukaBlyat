package Tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.DragAndDropOptions;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;

public class PeredelalBlyat {

    @Test
    public void ShouldHuyuold() throws InterruptedException{

        Configuration.browser = "firefox";

        Selenide.open("https://the-internet.herokuapp.com/drag_and_drop");
        Selenide.$("#column-a").shouldBe(visible);

        Selenide.$("#column-a").dragAndDrop(DragAndDropOptions.to("#column-b"));

        //Метод при котором почему-то не переместилось ничего
        //Selenide.actions().moveToElement($("#drag1")).clickAndHold().moveToElement($("#div1")).release().perform();


    }




}
