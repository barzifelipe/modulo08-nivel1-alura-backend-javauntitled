import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LembretePagamento {
    public static void main(String[] args){
        LocalDate dataAtual = LocalDate.now();
        int prazo1 = 10;
        int prazo2 = 5;

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        if(dataAtual.getDayOfMonth()<=20){
            LocalDate lembrete = dataAtual.minusDays(prazo1);
            System.out.println("Data do lembrete: " + lembrete.format(formato));
        }
        else if(dataAtual.getDayOfMonth() > 20){
            LocalDate lembrete = dataAtual.minusDays(prazo2);
            System.out.println("Data do lembrete: " + lembrete.format(formato));
        }
    }
}
