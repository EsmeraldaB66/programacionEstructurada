import javax.swing.*;

public class Promedio10 {
    public static void main(String[] args) {
        double numero=0.0;

        for (int x = 1; x <= 10; x++) {
            numero += Double.parseDouble(JOptionPane.showInputDialog("Introde el numero  " + x));
        }
        JOptionPane.showMessageDialog(null, "La suma de los 10 numeros es igual a: "+numero);
    }
}
