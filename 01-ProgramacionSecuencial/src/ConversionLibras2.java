import javax.swing.*;

public class ConversionLibras2 {
    public static void main(String[] args) {
        //Declaracion de constante
        final double FACTOR_CONVERSION=0.454;
        //Declaracion de variables de numeros doubles
        double numero1=0.0;
        double numero2=0.0;
        double numero3=0.0;
        String salida="";
        //Solicitar los tres números a calcular
        numero1=Double.parseDouble(JOptionPane.showInputDialog("Introduce los kilogramos (1)"));//Pide que el usuario ingrese el valor
        numero2=Double.parseDouble(JOptionPane.showInputDialog("Introduce los kilogramos (2)"));//Pide que el usuario ingrese el valor
        numero3=Double.parseDouble(JOptionPane.showInputDialog("Introduce los kilogramos (3)"));//Pide que el usuario ingrese el valor
        //Proceso de conversión

        salida=numero1+" kilogramos "+" en libras es: "+String.format("%.3f",numero1/FACTOR_CONVERSION)+
                "\n "+numero2+" kilogramos "+" en libras es: "+ String.format("%.3f",numero2/FACTOR_CONVERSION)+
                "\n "+numero3+" kilogramos "+" en libras es: "+String.format("%.3f",numero3/FACTOR_CONVERSION);
        JOptionPane.showMessageDialog(null,salida);
    }
}
