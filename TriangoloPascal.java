/**
 * Triangolo Pascal
 *
 * @author Poenariu Gabriel
 * @version 1.0
 */
import java.util.*;
public class TriangoloPascal {
    public static void main(String[] args) {
        // dichiarazione
        Scanner input = new Scanner(System.in);
        int numRighe;
        String rigaP = "";
        String riga = "";
        int somma;

        // input
        do {
            System.out.print("Inserire numero righe (1 - 100): ");
            numRighe = Integer.parseInt(input.nextLine());
        } while (numRighe <= 0 || numRighe > 100);

        for (int i = 0; i < numRighe; i++) {
            rigaP = riga;
            riga = "";
            somma = 0;
            if (rigaP == "")
                riga = "1";
            else {
                riga += "1";
                for (int j = 0; j < i - 1; j++) {
                    somma = Character.getNumericValue(rigaP.charAt(j)) +
                        Character.getNumericValue(rigaP.charAt(j + 1));
                    riga += somma + "";
                }
                riga += "1";
            }
            System.out.println(riga);
        }
    }
}
