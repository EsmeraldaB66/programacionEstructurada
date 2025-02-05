import javax.swing.*;

/*Escribir un programa que calcula y muestra el cuadrado de cada entero
1-9.*/
public class Cuadrado {
    public static void main(String[] args) {
        int numero1=1;
        int numero2=2;
        int numero3=3;
        int numero4=4;
        int numero5=5;
        int numero6=6;
        int numero7=7;
        int numero8=8;
        int numero9=9;
        double resultado1=0.0;
        double resultado2=0.0;
        double resultado3=0.0;
        double resultado4=0.0;
        double resultado5=0.0;
        double resultado6=0.0;
        double resultado7=0.0;
        double resultado8=0.0;
        double resultado9=0.0;
        //Procedimiento
        resultado1=Math.pow(numero1,2);
        resultado2=Math.pow(numero2,2);
        resultado3=Math.pow(numero3,2);
        resultado4=Math.pow(numero4,2);
        resultado5=Math.pow(numero5,2);
        resultado6=Math.pow(numero6,2);
        resultado7=Math.pow(numero7,2);
        resultado8=Math.pow(numero8,2);
        resultado9=Math.pow(numero9,2);
        String salida="El resultado del cuadrado del número 1 es: "+resultado1+
                "\nEl reultado del cuadrasdo del número 2 es: "+resultado2+
                "\nEl reultado del cuadrasdo del número 3 es: "+resultado3+
                "\nEl reultado del cuadrasdo del número 4 es: "+resultado4+
                "\nEl reultado del cuadrasdo del número 5 es: "+resultado5+
                "\nEl reultado del cuadrasdo del número 6 es: "+resultado6+
                "\nEl reultado del cuadrasdo del número 7 es: "+resultado7+
                "\nEl reultado del cuadrasdo del número 8 es: "+resultado8+
                "\nEl reultado del cuadrasdo del número 9 es: "+resultado9;
        JOptionPane.showMessageDialog(null, salida);




    }
}
