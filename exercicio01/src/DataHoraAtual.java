import java.time.LocalDate;
import java.time.LocalTime;

public class DataHoraAtual {
    public static void main(String[] args){
        LocalDate data = LocalDate.now();
        LocalTime hora = LocalTime.now();

        System.out.println("Data atual: " + data);
        System.out.println("Hora atual: " + hora);
    }
}
