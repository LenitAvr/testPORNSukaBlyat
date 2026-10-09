package Tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Selenide.$;

public class TestPenis_moveToElement {

    @Test
    void imRealdontKnowWathWariteHier() throws InterruptedException {
        //Drag&Drop:
        Selenide.open("https://the-internet.herokuapp.com/drag_and_drop");
        Selenide.actions().moveToElement($("#column-a")).clickAndHold().moveByOffset(500, 0).release().perform();


        Thread.sleep(5000);
    }

    private Actions action() {
        return null;
    }
}
