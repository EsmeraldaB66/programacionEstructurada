import javax.swing.*;

public class ConversionMilimetros {
    public static void main(String[] args) {
        /*Escribir un programa que convierte los 2, 5 y 10 pulgadas a milímetros (1 pulgada =
        25,4 mm).*/
        int num=2;
        int num2=5;
        int num3=10;
        final double MM=25.4;
        double re=0.0;
        double rs=0.0;
        double res=0.0;
        //Proceso
        re=num*MM;
        rs=num2*MM;
        res=num3*MM;
        String salida="La conversión de 2 pulgadas a mm es: "+re+" mm"+
                "\nLa conversión de 5 pulgadas a mm es: "+rs+" mm"+
                "\nLa conversión de 10 pulgadas a mm es: "+res+" mm";
        JOptionPane.showMessageDialog(null,salida);
    }
}
