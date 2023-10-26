/**
 * Triangolo Asterischi
 *
 * @author Poenariu Gabriel
 * @version 1.0
 */
import java.util.*;
public class TriangoloAsterischi {
    public static void main(String[] args) {
        // dichiarazione
        Scanner input = new Scanner(System.in);
        int numSequenze;
        String sequenza = "";

        // input
        do {
            System.out.print("Inserire numero sequenze (1 - 100): ");
            numSequenze = Integer.parseInt(input.nextLine());
        } while (numSequenze <= 0 || numSequenze > 100);

        // sequenza
        for (int i = 0; i < numSequenze; i++) {
            sequenza += "*";
        }

        // output
        while (sequenza.length() > 0) {
            System.out.println(sequenza);
            sequenza = sequenza.substring(0, sequenza.length() - 1);
        }
    }
}
