import javax.swing.*;

public class Promedio {
    public static void main(String[] args) {
    /*Escribir un programa que calcula y muestra el promedio de los números enteros 1,
    7, 9 y 34*/
        int num=1;
        int num2=7;
        int num3=9;
        int num4=34;
        double res=0.0;
        //Proceso
        res=(num+num2+num3+num4)/4;
        JOptionPane.showMessageDialog(null, "El promedio de los 4 números es: "+res);
    }
}
