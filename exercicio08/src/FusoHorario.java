
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FusoHorario {
    public static void main(String[] args){
        ZonedDateTime horaTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Horário atual em Tóquio: "+horaTokyo.format(formato));
    }
}
