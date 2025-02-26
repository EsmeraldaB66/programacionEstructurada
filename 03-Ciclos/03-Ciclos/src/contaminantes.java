import javax.swing.*;

public class contaminantes {
    public static void main(String[] args) {
        double suma = 0;
        double min = 0;
        double max = 0;
        double puntosConta=0.0;
        boolean serial= true;
        String salida="";
        for (int i = 1; i <= 25; i++) {
            puntosConta=Double.parseDouble(JOptionPane.showInputDialog("Ingrese los puntos contaminantes:"+i));
            suma += puntosConta;

            if (serial) {
                min = max = puntosConta;
                serial = false;
            } else {
                if (puntosConta < min) {
                    min = puntosConta;
                }
                if (puntosConta > max) {
                    max = puntosConta;
                }
            }
        }
        double promedio = suma / 25;

        salida="\nResultados:"+
        "Promedio de puntos contaminantes: " + promedio+
        "\nAutomóvil que menos contaminó: " + min + " puntos contaminantes"
        +"\nAutomóvil que más contaminó: " + max + " puntos contaminantes";
        JOptionPane.showMessageDialog(null,salida);
    }
}
