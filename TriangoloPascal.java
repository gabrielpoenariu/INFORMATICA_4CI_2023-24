/**
 * Programma Java che visualizza il triangolo di Pascal
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
        int[] rigaP = new int[34];
        Arrays.fill(rigaP, 0);
        int[] riga = new int[34];
        Arrays.fill(riga, 0);
        boolean empty;
        String rigaF = "";

        // input righe
        do {
            System.out.print("Inserire numero righe (1 - 34): ");
            numRighe = Integer.parseInt(input.nextLine());
        } while (numRighe <= 0 || numRighe > 34); // ci sono problemi se > 34

        // ciclo riga per riga
        for (int i = 0; i < numRighe; i++) {

            // copia riga in rigaP
            for (int e = 0; e < riga.length; e++) {
                rigaP[e] = riga[e];
            }

            // azzeramento riga e rigaF
            Arrays.fill(riga, 0);
            rigaF = "";

            // controllo se rigaP è vuoto
            empty = true;
            for (int e = 0; e < rigaP.length; e++) {
                if (rigaP[e] != 0) {
                    empty = false;
                }
            }

            // codice se rigaP è vuoto (eseguito solo una volta all'inizio)
            if (empty) {
                riga[0] = 1;
            }

            // altrimenti...
            else {
                riga[0] = 1;
                for (int j = 1; j < i; j++) {
                    riga[j] = rigaP[j - 1] + rigaP[j];
                }
                riga[i] = 1;
            }

            // riempimento rigaF
            for (int j = 0; j < riga.length && riga[j] != 0; j++) {
                rigaF += riga[j] + " ";
            }

            // output
            System.out.println(rigaF);
        }
    }
}
