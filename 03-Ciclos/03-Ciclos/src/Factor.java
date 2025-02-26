import javax.swing.*;

public class Factor {
    public static void main(String[] args) {
        int num=0;
        int factorial = 1;
        int i = num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número para calcular su factorial:"));
        while (i > 1) {
            factorial *= i;
            i--;
        }

        JOptionPane.showMessageDialog(null, "El factorial de " + num + " es: " + factorial);
    }
}
