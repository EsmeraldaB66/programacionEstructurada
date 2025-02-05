import javax.swing.*;

public class AreaCirculoPulgadas {
    /*Escribir un programa para calcular y de salida el perímetro y el área de un círculo con
un radio de 3,2 pulgadas*/
    public static void main(String[] args) {
        double radio=3.2;
        double perimetro=0.0;
        double area=0.0;
        final double PI=3.1416;
        area=PI*Math.pow(radio,2);
        perimetro=2*PI*radio;
        String salida="El perimetro del circulo con radio "+radio+" es "+String.format("%.3f",perimetro)+
                "\nSu área es: "+String.format("%.3f",area);
        JOptionPane.showMessageDialog(null, salida);
    }
}
