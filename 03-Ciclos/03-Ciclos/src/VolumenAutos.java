import javax.swing.*;

public class VolumenAutos {
    public static void main(String[] args) {
                int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de vehículos:"));
                double sumaMasas = 0;

                for (int i = 0; i < n; i++) {
                    double presion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la presión del aire:"));
                    double volumen = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el volumen del aire:"));
                    double temperatura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura del aire:"));

                    double masa = (presion * volumen) / (0.37 * (temperatura + 460));
                    sumaMasas += masa;
                }

                double promedio = sumaMasas / n;
                JOptionPane.showMessageDialog(null, "El promedio de masa de aire es: " + promedio);
            }
        }

