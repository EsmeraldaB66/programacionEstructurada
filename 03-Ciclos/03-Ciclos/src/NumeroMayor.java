import javax.swing.*;

public class NumeroMayor {
    public static void main(String[] args) {
        int mayor = 0, i=0, n=0, numero=0;
        i = 0;
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de números: "));
        while (i <= n) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
            if (i == 0 || numero > mayor) {
                mayor = numero;
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, "El mayor número es: " + mayor);
    }
}
