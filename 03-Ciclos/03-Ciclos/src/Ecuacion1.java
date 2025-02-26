import javax.swing.*;

public class Ecuacion1 {
    public static void main(String[] args) {
        //declaracion de variables

        int n = 0;
        int denSup = 0;
        int deno = 0;
        double x = 0.0;
        double s = 0.0;

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de fracciones"));
            x = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de x"));
            if (n < 0 && x < 0.0) {
                JOptionPane.showMessageDialog(null, "Ambos numeros estan mal");
            }
                if (n < 0) {
                    JOptionPane.showMessageDialog(null, "El numero de fracciones esta mal");

                } else if (x < 0.0) {
                    JOptionPane.showMessageDialog(null, "El numero de x esta mal");
                }
        }while (n < 0 || x < 0.0) ;

            //Inicializar las variablespp
            deno = 1;
            denSup = 3;
            for (int i = 1; i <= n; i++) {
                s += Math.pow(x, 3.0 / denSup) / deno;
                denSup += 3;
                deno += 2;
            }
            JOptionPane.showMessageDialog(null, "El valor de S es: " + s);
        }
    }


