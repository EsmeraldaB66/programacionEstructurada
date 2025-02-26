import javax.swing.*;

public class NumeroImpar {
    public static void main(String[] args) {
        String resultado = "Números impares entre 0 y 100:\n";
        int i = 1;

        do {
            resultado += i + " ";
            i += 2;
        } while (i <= 100);

        JOptionPane.showMessageDialog(null, resultado);
    }
}
