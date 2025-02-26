import javax.swing.*;

public class NumeroMedio {
    public static void main(String[] args) {
        int num1=0, num2=0, num3=0, medio=0;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer número:"));

        if ((num1 > num2 && num1 < num3) || (num1 > num3 && num1 < num2)) {
            medio = num1;
        } else if ((num2 > num1 && num2 < num3) || (num2 > num3 && num2 < num1)) {
            medio = num2;
        } else {
            medio = num3;
        }

        JOptionPane.showMessageDialog(null, "El número medio es: " + medio);
    }
}
