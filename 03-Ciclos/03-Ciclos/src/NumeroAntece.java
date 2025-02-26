import javax.swing.*;

public class NumeroAntece {
    public static void main(String[] args) {
        int num=0;
        int suma = 0;
        int i = 1;
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
        do {
            suma += i;
            i++;
        } while (i < num);

        JOptionPane.showMessageDialog(null, "La suma de los números que anteceden a " + num + " es: " + suma);
    }
}
