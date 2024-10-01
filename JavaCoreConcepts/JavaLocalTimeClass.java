package JavaCoreConcepts;

import java.time.LocalTime;

public class JavaLocalTimeClass {

    public static void main(String[] args){
        LocalTime currentTime=LocalTime.now();
        System.out.println("Current time is "+currentTime);
        LocalTime particularTime=LocalTime.of(02,30,20);
        System.out.println("time at specified time: "+particularTime);
        int hour=currentTime.getHour();
        int minute=currentTime.getMinute();
        int sec=currentTime.getSecond();
        System.out.println("hour using getHour() method: "+ hour);
        System.out.println("minute using getMinute() methos: "+minute);
        System.out.println("seconf using getSecond() method: "+ sec);
        //checing the time after the 2h 30m 20s from current time
        
        LocalTime newTime= currentTime.plusHours(2).plusMinutes(30).plusSeconds(20);

        System.out.println("After adding 2h 30min 20s to the current time "+currentTime+" new time is "+ newTime);

    }
    
}
