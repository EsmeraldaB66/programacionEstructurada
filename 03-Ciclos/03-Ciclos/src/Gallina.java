import javax.swing.*;

public class Gallina {
    public static void main(String[] args) {
        int n=0, huevos;
        double sumaCalidad = 0;
        double peso=0, altura=0, promedioCalidad=0.0, precioPorKilo=0.0, calidad=0.0;
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de gallinas:"));

                for (int i = 0; i < n; i++) {
                    peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la gallina:"));
                    altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura de la gallina:"));
                    huevos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de huevos que pone:"));

                    calidad = (peso * altura) / huevos;
                    sumaCalidad += calidad;
                }

                 promedioCalidad = sumaCalidad / n;

                if (promedioCalidad >= 15) {
                    precioPorKilo = 1.2 * promedioCalidad;
                } else if (promedioCalidad > 8) {
                    precioPorKilo = 1.0 * promedioCalidad;
                } else {
                    precioPorKilo = 0.8 * promedioCalidad;
                }

                JOptionPane.showMessageDialog(null, "El precio por kilo de huevo es: " + precioPorKilo);
            }
        }


