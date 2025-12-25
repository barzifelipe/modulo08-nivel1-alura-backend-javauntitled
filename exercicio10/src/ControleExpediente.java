import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ControleExpediente {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Digite o hoário de entrada (HH:mm): ");
        LocalTime entrada = LocalTime.parse(scan.next(), formatter);
        System.out.println("Digite a carga horária diária: ");
        int cargaHoraria = scan.nextInt();
        System.out.println("Digite o horário real de saída: ");
        LocalTime saidaReal = LocalTime.parse(scan.next(), formatter);

        LocalTime saidaPrevista = entrada.plusHours((cargaHoraria));

        Duration diferenca = Duration.between(saidaPrevista, saidaReal);
        long horasExtras = diferenca.toHours();
        long minutosExtras = diferenca.toMinutesPart();

        System.out.println("Horário de entrada: " + entrada.format(formatter));
        System.out.println("Horário de saída previsto: " + saidaPrevista.format(formatter));
        System.out.println("Horário de saída real: " + saidaReal.format(formatter));

        if(horasExtras == 0 && minutosExtras == 0){
            System.out.println("Saldo de horas: 0h 0min");
        }
        else{
            String sinal;

            if(horasExtras > 0 || minutosExtras > 0){
                sinal = "+";
            }
            else{
                sinal = "-";
            }

            System.out.println("Saldo de horas: " + sinal + Math.abs(horasExtras) + "h " + Math.abs(minutosExtras) + "min");
        }

    }
}
