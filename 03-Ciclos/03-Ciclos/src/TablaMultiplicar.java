import javax.swing.*;

public class TablaMultiplicar {
    public static void main(String[] args) {
        int numero=0;
        String resultado="";
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número para calcular su tabla de multiplicar:"));

        resultado = "Tabla de multiplicar del " + numero + "\n";
        for (int i = 1; i <= 10; i++) {
            int producto = numero * i;
            resultado += numero + " x " + i + " = " + producto + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
    }

