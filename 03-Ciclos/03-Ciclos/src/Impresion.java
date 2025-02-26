import javax.swing.*;

public class Impresion {
    public static void main(String[] args) {
        String resultado = "Números del 1000 al 0:\n";
        int i = 1000;

        do {
            resultado += i + " ";
            i--;
        } while (i >= 0);

        JOptionPane.showMessageDialog(null, resultado);
    }
}
