import java.time.Duration;
import java.time.LocalTime;

public class DiferencaHora {
    public static void main(String[] args){
        LocalTime horaInicio = LocalTime.of(14,30);
        LocalTime horaFinal = LocalTime.of(16,45);

        Duration duracao = Duration.between(horaInicio, horaFinal);
        System.out.println("Diferença de tempo: " + duracao.toHours() +" horas e " + duracao.toMinutesPart() + " minutos");
    }
}
