import javax.swing.*;

public class CalificacionesMP {
    public static void main(String[] args) {
        int numCalif=0;
        int i=1;
        double calif=0.0;
        numCalif=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de calificaciones del que se desea calcular el promedio"));
        for (int j = 1; j <=numCalif ; j++) {
            calif+=Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificación "+i));
            i++;
        }
        calif/=numCalif;
        JOptionPane.showMessageDialog(null,"El promedio es de: "+calif+" de "+numCalif+" calificaciones");

        }
}
