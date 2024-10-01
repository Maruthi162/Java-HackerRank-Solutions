package JavaCoreConcepts;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JavaDaateTimeFormstter {
    public static void main(String[] args){
        //defining date formatter
        DateTimeFormatter dateFormatter= DateTimeFormatter.ofPattern("yyyy:MM:dd");
        //defining time formatter
        DateTimeFormatter timeFormatter=DateTimeFormatter.ofPattern("HH:mm:ss");
        //defining datetime formatter
        DateTimeFormatter datetimeFormatter=DateTimeFormatter.ofPattern("yyyy:MM:dd HH:mm:ss");
        
        //formatting date
        LocalDate date= LocalDate.now();
        String formattedDate=date.format(dateFormatter);
        System.out.println("Fornatted date is "+formattedDate);

        //formatting time
        LocalTime time= LocalTime.now();
        String formattedTime=time.format(timeFormatter);
        System.out.println("Formatted time: "+formattedTime);

        //formating date and time
        LocalDateTime datetime=LocalDateTime.now();
        String formatteddateTime=datetime.format(datetimeFormatter);
        System.out.println("Formatted date and time: "+formatteddateTime);

    }
}
