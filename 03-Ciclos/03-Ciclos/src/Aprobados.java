import javax.swing.*;

public class Aprobados {
    public static void main(String[] args) {
        int totalAlumnos=0, reprobados=0;
        int i = 0;
        double calificacion=0.0, porcentaje=0.0;

        totalAlumnos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de alumnos:"));
        while (i < totalAlumnos) {
            calificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación del alumno " + (i+1) + ":"));
            if (calificacion < 7) {
                reprobados++;
            }
            i++;
        }

        porcentaje = (reprobados * 100.0) / totalAlumnos;
        JOptionPane.showMessageDialog(null, "El porcentaje de alumnos reprobados es: " + porcentaje + "%");
    }
}
