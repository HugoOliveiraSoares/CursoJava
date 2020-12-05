import java.util.*;
import java.text.*;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class Main {

    public static void main(String args[]) {
        
        SimpleDateFormat ftbase = new SimpleDateFormat("HH:mm");
        
        Calendar hora1 = new GregorianCalendar();
        Calendar hora2 = new GregorianCalendar();

        String start = "10:00";
        String ending = "10:30";

        System.out.println("Começa em "+start+" termina em "+ending);
        Date init;
        Date end;

        try {
            init = ftbase.parse(start);
            end = ftbase.parse(ending);

            hora1.setTime(init);
            hora2.setTime(end);

            long resHour = (hora2.getTime()).getTime() - (hora1.getTime()).getTime();
            // long resminute = hora2.get(Calendar.MINUTE) - hora1.get(Calendar.MINUTE);

            System.out.println(resHour / (1000*60));

        } catch (ParseException e) {
            e.printStackTrace();
        }

        
    }
}