package JavaCoreConcepts;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class JavaLocalDateClass {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        // adding days to to current date, also we can add months and weeks and years
        // using plusMonths(), plusWeeks() and plusYears()
        LocalDate updatedDate = today.plusDays(10);
        int year = today.getYear();
        System.out.println("--> year of the todays date: " + today + " is" + year);
        int dayOfMonth = updatedDate.getDayOfMonth();
        System.out.println(
                "--> Day of the month after adding 10 days to the ccureent date" + today + " is " + dayOfMonth);
        // getting the day of the week
        DayOfWeek dayOfWeek = updatedDate.getDayOfWeek();
        System.out.println("--> week day of the updated date " + updatedDate + " is " + dayOfWeek);
        // subtracting the months from the current date using .minusMonths() method, lly
        // we can use minusDays(), minusWeeks() and minusYears()
        LocalDate subtractedDate = today.minusMonths(2);
        System.out
                .println("--> Date after subtracting 2 month from the current date " + today + " is " + subtractedDate);
    }
}
