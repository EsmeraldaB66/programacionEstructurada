import javax.swing.*;

public class NumeroMaMen {
    public static void main(String[] args) {
        int n =0;
        n= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de números:"));
        int num=0;
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
        int mayor = num;
        int menor = num;

        for (int i = 1; i < n; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));

            if (num > mayor) {
                mayor = num;
            }
            if (num < menor) {
                menor = num;
            }
        }

        JOptionPane.showMessageDialog(null, "El número mayor es: " + mayor + "\nEl número menor es: " + menor);
    }
}
