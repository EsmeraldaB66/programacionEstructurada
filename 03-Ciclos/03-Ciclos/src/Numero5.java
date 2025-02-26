import javax.swing.*;

public class Numero5 {
    public static void main(String[] args) {
        int N=0;
        int suma = 0, num = 20;
        N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de N:"));
        do {
            suma += num;
            num += 5;
        } while (num <= N);

        JOptionPane.showMessageDialog(null, "La suma de la sucesión es: " + suma);
    }
}
