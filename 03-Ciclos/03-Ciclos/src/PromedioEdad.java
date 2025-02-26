import javax.swing.*;

public class PromedioEdad {
    public static void main(String[] args) {
        int sumaHombres = 0, sumaMujeres = 0, contadorHombres1 = 0, contadorMujeres1 = 0;
        String genero;
        double promedioHombres = 0, promedioMujeres = 0;
        double contadorHombres = 0,contadorMujeres = 0;
        int edad=0;
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad (-1 para terminar):"));
        while (edad != -1) {
            genero = JOptionPane.showInputDialog("Ingrese el género (H/M):");
            if (genero.equalsIgnoreCase("H")) {
                sumaHombres += edad;
                contadorHombres1++;
            } else if (genero.equalsIgnoreCase("M")) {
                sumaMujeres += edad;
                contadorMujeres1++;
            }
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad (-1 para terminar):"));
        }

        if (contadorHombres1 > 0) {
            promedioHombres = sumaHombres / contadorHombres;
        }
        if (contadorMujeres1 > 0) {
            promedioMujeres = sumaMujeres / contadorMujeres;
        }
        JOptionPane.showMessageDialog(null, "Promedio edad hombres: " + promedioHombres +
                "\nPromedio edad mujeres: " + promedioMujeres);
    }

}
