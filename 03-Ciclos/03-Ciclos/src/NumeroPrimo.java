import javax.swing.*;

public class NumeroPrimo {
    public static void main(String[] args) {
        int num=0;
        boolean esPrimo = true;
        int i = 2;
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
        if (num < 2) {
            esPrimo = false;
        } else {
            do {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
                i++;
            } while (i <= Math.sqrt(num));
        }

        String mensaje = esPrimo ? "El número " + num + " es primo." : "El número " + num + " no es primo.";
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
