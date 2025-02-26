import javax.swing.*;

public class NumeroMenor {
    public static void main(String[] args) {
        int i=0;
        int n =0;
        int numero=0, menor = 0;
        n= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de números: "));
        i = 0;
        while (i < n) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
            if (i == 0 || numero < menor) {
                menor = numero;
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, "El menor número es: " + menor);
    }
}
