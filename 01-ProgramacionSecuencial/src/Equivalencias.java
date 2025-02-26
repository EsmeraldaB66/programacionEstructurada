import javax.swing.*;

public class Equivalencias {
    public static void main(String[] args) {
        double pies=0.0;
        String salida="";
        double yardas=0.0, pulgadas=0.0, centimetros=0.0, metros=0.0;
        pies=Double.parseDouble(JOptionPane.showInputDialog("Ingrsa la cantidad en pies"));

         yardas = pies / 3;
         pulgadas = pies * 12;
         centimetros = pulgadas * 2.54;
         metros = centimetros / 100;

        salida = "Equivalencias:\n" +
                "Yardas: " + yardas + "\n" +
                "Pulgadas: " + pulgadas + "\n" +
                "Centímetros: " + centimetros + "\n" +
                "Metros: " + metros;

        JOptionPane.showMessageDialog(null,salida);
    }
}
