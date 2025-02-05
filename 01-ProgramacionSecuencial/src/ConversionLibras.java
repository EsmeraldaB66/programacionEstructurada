import javax.swing.*;
/*Escribir un programa que convierta 3 numeros de kilogramos a libras
* (1 Libra=0.454)*/
public class ConversionLibras {
    public static void main(String[] args) {
        //Declaracion de constante
        final double FACTOR_CONVERSION=0.454;
        //Declaracion de variables de numeros doubles
        double numero1=0.0;
        double numero2=0.0;
        double numero3=0.0;
        double c1=0.0;
        double c2=0.0;
        double c3=0.0;
        String salida="";
        //Solicitar los tres números a calcular
        numero1=Double.parseDouble(JOptionPane.showInputDialog("Introduce los kilogramos (1)"));//Pide que el usuario ingrese el valor
        numero2=Double.parseDouble(JOptionPane.showInputDialog("Introduce los kilogramos (2)"));//Pide que el usuario ingrese el valor
        numero3=Double.parseDouble(JOptionPane.showInputDialog("Introduce los kilogramos (3)"));//Pide que el usuario ingrese el valor
        //Proceso de conversión
        c1=numero1/FACTOR_CONVERSION;
        c2=numero2/FACTOR_CONVERSION;
        c3=numero3/FACTOR_CONVERSION;

        salida=numero1+" kilogramos "+" en libras es: "+String.format("%.3f",c1)+
                "\n "+numero2+" kilogramos "+" en libras es: "+ String.format("%.3f",c2)+
                "\n "+numero3+" kilogramos "+" en libras es: "+String.format("%.3f",c3);
        JOptionPane.showMessageDialog(null,salida);
    }
}
