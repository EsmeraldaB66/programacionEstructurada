import javax.swing.*;

/*Realizar un programa que obtenga el valor de X de la siguiente ecuación
Y = 3X2 + 7X − 15*/
public class Ecuacion {
    public static void main(String[] args) {
    double x=0.0;
    double y=0.0;
    String salida;
        x=Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de x"));//Pide que el usuario ingrese el valor
        y=Math.pow((3*x),2)+7*x-15;
        salida="El resultado de la expresión es: "+String.format("%3f",y);
        JOptionPane.showMessageDialog(null,salida);
    }
}
