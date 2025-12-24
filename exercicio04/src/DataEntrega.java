import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataEntrega {
    public static void main(String [] args){
        LocalDate dataInicio = LocalDate.now();
        int prazo = 15;
        LocalDate dataEntraga = dataInicio.plusDays(prazo);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Data de entrega: " + dataEntraga.format(formato));

    }
}
