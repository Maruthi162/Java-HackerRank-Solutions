package JavaCoreConcepts;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JavaLocalDateTimeClass {

    public static void main(String[] args){
        //getting current date and time
        LocalDateTime currentDateTime= LocalDateTime.now();
        System.out.println("Current date time using .now() method= "+ currentDateTime);

        //specific date and time
        LocalDate date= LocalDate.of(2012,12,31);
        LocalTime time=LocalTime.of(23,59,59);
        LocalDateTime dateTime=LocalDateTime.of(date,time);
        System.out.println("date and time of sepcific date and time using .of() method is "+ dateTime);

        //convetting LocalDateTime to LocalDate
        LocalDate ConvertedDate=dateTime.toLocalDate();
        System.out.println("After converting datetime "+dateTime+ " to LocalDate "+ ConvertedDate);

        //Converting LocalDateTime to LocalTime
        LocalTime ConvertedTime=dateTime.toLocalTime();
        System.out.println("after converting datetime "+dateTime+"to LocalTime "+ ConvertedTime);
    }
    
}
