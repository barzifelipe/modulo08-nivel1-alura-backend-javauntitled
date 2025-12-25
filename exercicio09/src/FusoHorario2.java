import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FusoHorario2 {
    public static void main(String[]args){
        ZonedDateTime horarioLocal = ZonedDateTime.now();
        ZonedDateTime horarioSydney = horarioLocal.withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Horário atual no sistema: " + horarioLocal.format(formato));
        System.out.println("Horário atual em Sydney: " + horarioSydney.format(formato));
    }
}
