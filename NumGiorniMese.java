/**
 * Numero Giorni Mese
 *
 * @author Poenariu Gabriel
 * @version 1.0
 */
import java.util.*;
public class NumGiorniMese {
    public static void main(String[] args) {
        // dichiarazione
        Scanner input = new Scanner(System.in);
        int mese;
        int anno;
        int giorni;
        String[] mesi = {"Gennaio", "Febbraio", "Marzo", "Aprile",
                         "Maggio", "Giugno", "Luglio", "Agosto",
                         "Settembre", "Ottobre", "Novembre", "Dicembre"};

        // input
        do {
            System.out.print("Inserire mese (1 - 12): ");
            mese = Integer.parseInt(input.nextLine());
        } while (mese <= 0 || mese > 12);
        do {
            System.out.print("Inserire anno: ");
            anno = Integer.parseInt(input.nextLine());
        } while (anno <= 0);

        // calcolo giorni
        switch (mese) {
            case 4, 6, 9, 11: giorni = 30; break;
            case 2:
            if (anno % 4 == 0 && anno % 100 != 0 ||
                anno % 100 == 0 && anno % 400 == 0)
                giorni = 29;
            else
                giorni = 28;
            break;
            default: giorni = 31; break;
        }

        // output
        System.out.println(mesi[mese - 1] + " " + anno + " ha " +
                           giorni + " giorni");
    }
}
