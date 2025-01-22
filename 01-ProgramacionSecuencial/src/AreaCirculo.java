import javax.swing.*;

public class AreaCirculo {
    public static void main(String[] args) {
        //Declaracion de variables
        final double PI=3.1416;//Constante
        double a=0.0, r=0.0, a2=0.0;
        r=Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor del radio"));//Pide que el usuario ingrese el valor
        a=PI*Math.pow(r,2);
        a2=Math.PI*r*r;
        System.out.println("El área del circulo con radio "+r+" es " +a);
    }
}
