import javax.swing.*;

public class Expresion {
    /*Calcular el resultado de la expresion n=x+y/y-1
    * para los valores x y y cualesquiera*/
    public static void main(String[] args) {
        //Declaracion de variables

        double x=0.0;
        double y=0.0;
        double n=0.0;
        //Solicitar los datos
        x=Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de x"));//Pide que el usuario ingrese el valor
        y=Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de y"));//Pide que el usuario ingrese el valor

        n=(x+y)/(y-1);

        JOptionPane.showMessageDialog(null, "El resultado de la operación es: "+String.format("%.2f",n));
    }
}

