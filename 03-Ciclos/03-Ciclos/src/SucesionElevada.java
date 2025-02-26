import javax.swing.*;

public class SucesionElevada {
    public static void main(String[] args) {
        int N=0;
        int suma = 0;
         N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de términos:"));
        for (int i = 1; i <= N; i++) {
            suma += i * i;
        }

        JOptionPane.showMessageDialog(null, "La suma de la sucesión es: " + suma);
    }
}
