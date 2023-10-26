/**
 * Programma Java che visualizza la struttura a rombo dei caratteri
 *
 * @author Poenariu Gabriel
 * @version 1.0
 */
import java.util.*;
public class RomboAlfabeto {
    public static void main(String[] args) {
        // dichiarazione
        Scanner input = new Scanner(System.in);
        int numSequenze;
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String sequenza = "";

        // input
        do {
            System.out.print("Inserire numero sequenze (1 - 26): ");
            numSequenze = Integer.parseInt(input.nextLine());
        } while (numSequenze < 1 || numSequenze > 26);

        // output
        System.out.println("UN");
        for (int i = 1; i < numSequenze; i++) {
            sequenza = "";
            for (int j = 0; j < i + 1; j++) {
                sequenza += alfabeto.charAt(j);
            }
            for (int j = i - 1; j >= 0; j--) {
                sequenza += alfabeto.charAt(j);
            }
            System.out.println(sequenza);
        }
        for (int i = numSequenze - 2; i >= 1; i--) {
            sequenza = "";
            for (int j = 0; j < i + 1; j++) {
                sequenza += alfabeto.charAt(j);
            }
            for (int j = i - 1; j >= 0; j--) {
                sequenza += alfabeto.charAt(j);
            }
            System.out.println(sequenza);
        }
        System.out.println("UN");
    }
}
