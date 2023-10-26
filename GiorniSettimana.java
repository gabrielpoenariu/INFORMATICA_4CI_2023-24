/**
 * Programma Java che, preso in input un numero intero compreso tra 1 e 7,
 * visualizza il nome del giorno della settimana corrispondente
 *
 * @author Poenariu Gabriel
 * @version 1.0
 */
import java.util.*;
public class GiorniSettimana {
    public static void main(String[] args) {
        // dichiarazione
        Scanner input = new Scanner(System.in);
        int giorno;
        String[] settimana = {"lunedì", "martedì", "mercoledì", "giovedì",
                               "venerdì", "sabato", "domenica"};

        // input
        do {
            System.out.print("Inserire giorno della settimana (1 - 7): ");
            giorno = Integer.parseInt(input.nextLine());
        } while (giorno <= 0 || giorno > 7);

        // output
        System.out.println(settimana[giorno - 1]);
    }
}
