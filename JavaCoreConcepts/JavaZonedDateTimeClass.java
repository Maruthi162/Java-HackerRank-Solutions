package JavaCoreConcepts;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class JavaZonedDateTimeClass {
    public static void main(String[] args){
        //getting current date and time along with zone
        ZonedDateTime currentZonedDate= ZonedDateTime.now();
        System.out.println("Current zoned datetime using now(): "+currentZonedDate);

        //getting date and time with zone for spesific values using of()
        ZonedDateTime specificZonedDateTime= ZonedDateTime.of(LocalDateTime.of(2012,12,31,23,59,59), ZoneId.of("America/New_York"));
        System.out.println("specific America zoned date and time using .of() method is "+specificZonedDateTime);

        //Converting from one zone to another zone
        ZonedDateTime IndianZone= specificZonedDateTime.withZoneSameInstant(ZoneId.of("Asia/Calcutta"));
        System.out.println("After converting "+ specificZonedDateTime +"to indian zone: "+IndianZone);

    }
}
