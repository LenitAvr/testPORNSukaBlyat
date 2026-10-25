package pages.Components;

import static com.codeborne.selenide.Selenide.$;

public class CalendarRegistration {
    public void setDate(String day, String month, String year) {

        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__day--0" + day + "(.react-datapicker__day--outside-month)").click();


    }
}
