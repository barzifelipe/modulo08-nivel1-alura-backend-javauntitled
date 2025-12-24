import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataVencimento {
    public static void main(String[] args){
        LocalDate dataOriginal = LocalDate.now();
        int meses = 2;
        LocalDate dataNova = dataOriginal.plusMonths(meses);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Nova data de vencimento: " + dataNova.format(formato));
    }
}
