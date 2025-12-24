import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataHoraFormatado {
    public static void main(String[] args){
        LocalDate data = LocalDate.now();
        LocalTime hora = LocalTime.now();

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println(data.format(formatoData));
        System.out.println(hora.format(formatoHora));
    }
}
