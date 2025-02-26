import javax.swing.*;

public class SumaMultiplica {
    public static void main(String[] args) {
        int n=0, num=0;
        int suma = 0;
        int producto = 1;
        int i = 0;
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de números:"));
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
            suma += num;
            producto *= num;
            i++;
        } while (i < n);

        JOptionPane.showMessageDialog(null, "La suma es: " + suma + "\nEl producto es: " + producto);
    }
    }

