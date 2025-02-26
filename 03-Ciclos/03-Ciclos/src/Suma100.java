import javax.swing.*;

public class Suma100 {
    public static void main(String[] args) {
        int suma = 0;

        for (int i = 1; i <= 100; i++) {
            suma += i;
        }

        JOptionPane.showMessageDialog(null, "La suma de los números del 1 al 100 es: " + suma);

    }
}
