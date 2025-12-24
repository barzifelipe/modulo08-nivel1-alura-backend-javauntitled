import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataEvento {
    public static void main(String[] args){
        LocalDate dataEvento = LocalDate.of(2025, 12, 10);
        LocalDate dataAtual = LocalDate.now();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Data do evento: " + dataEvento.format(formato));
        System.out.println("Data atual: " +dataAtual.format(formato));

        if(dataEvento.isBefore(dataAtual)){
            System.out.println("O evento já ocorreu");
        }
        else{
            System.out.println("O evento ainda vai acontecer");
        }
    }
}
