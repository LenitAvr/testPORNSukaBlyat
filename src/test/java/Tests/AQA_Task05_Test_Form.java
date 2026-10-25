package Tests;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class AQA_Task05_Test_Form extends TestBase{

    @Test
    public void chekFormRegistration() throws InterruptedException {

        registrationPage.openPage()
        .setFirstName("Blya")
        .setFirstName("Penisonius")
        .setLastName("Fufelschmertz")
        .setEmail("FufelschmertzPakastinCorp@fufel.utkanos.com")
        .setGender("Male")
        .setNumber("88005553535")
        .setBirthDate("03", "September", "1999");

        $("#subjectsInput").setValue("History").pressEnter();
        $("#hobbies-checkbox-1").click();
        $("#hobbies-checkbox-2").click();
        $("#uploadPicture").uploadFromClasspath("Gubki-dlya-stanochnykh-tiskov-GT150.png");
        $("#currentAddress").setValue("Улица Крутых чуваков, дом Пивного повелителя, 4 лестница, 666 этаж, квартира Любителей пива");
        $("#state").click();
        $(byText("Haryana")).click();
        $("#city").click();
        $(byText("Karnal")).click();
        $("#submit").click();

    }

}
