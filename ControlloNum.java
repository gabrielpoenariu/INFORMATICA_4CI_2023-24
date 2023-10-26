/**
 * Controllo Numero
 *
 * @author Poenariu Gabriel
 * @version 1.0
 */
import java.util.*;
public class ControlloNum {
    public static void main(String[] args) {
        // dichiarazione
        Scanner input = new Scanner(System.in);
        int numero;

        // input
        System.out.print("Inserire numero: ");
        numero = Integer.parseInt(input.nextLine());

        // output
        if (numero > 0)
            System.out.println("Il numero è positivo");
        else if (numero < 0)
            System.out.println("Il numero è negativo");
        else
            System.out.println("Il numero è zero");
    }
}
