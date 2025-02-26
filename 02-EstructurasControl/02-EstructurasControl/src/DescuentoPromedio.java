import javax.swing.*;

public class DescuentoPromedio {
    public static void main(String[] args) {
        double promedio;
        int materiasReprobadas = 0;
        int nivelEducativo;
        int unidades = 0;
        double descuento = 0;
        double costoUnidad=0.0;
        double costoTotal=0.0;
        double costoFinal=0.0;

        promedio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el promedio del alumno:"));
        nivelEducativo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nivel educativo (1 para preparatoria, 2 para profesional):"));

        if (nivelEducativo == 1) {
            materiasReprobadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de materias reprobadas:"));
        }

        if (nivelEducativo == 1) {
            costoUnidad = 180.0 / 5;
        } else {
            costoUnidad = 300.0 / 5;
        }

        if (nivelEducativo == 1) {
            if (promedio >= 9.5) {
                unidades = 55;
                descuento = 0.25;
            } else if (promedio >= 9) {
                unidades = 50;
                descuento = 0.10;
            } else if (promedio > 7) {
                unidades = 50;
            } else if (materiasReprobadas <= 3) {
                unidades = 45;
            } else {
                unidades = 40;
            }
        } else if (nivelEducativo == 2) {
            if (promedio >= 9.5) {
                unidades = 55;
                descuento = 0.20;
            } else {
                unidades = 55;
            }
        }

        costoTotal = (unidades / 5) * costoUnidad;
        costoFinal = costoTotal * (1 - descuento);

        JOptionPane.showMessageDialog(null, "El alumno deberá pagar: $" + costoFinal);
    }
}
