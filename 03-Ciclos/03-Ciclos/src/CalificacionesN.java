import javax.swing.*;

public class CalificacionesN {
    public static void main(String[] args) {
        int numeroAlumnos=0;
        numeroAlumnos=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de alumnos del que se desea calcular el promedio"));
        int i=1;
        double calif=0.0;
        while (i<=numeroAlumnos){
            calif+=Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificación "+i));
            i++;
        }
        calif/=numeroAlumnos;
        JOptionPane.showMessageDialog(null,"El promedio es de: "+calif+" de "+numeroAlumnos+" alumnos");
    }
}
