import javax.swing.*;

public class CalificacionesAcumulativas1 {
    public static void main(String[] args) {
        //double calif=0.0;
        double acumCalif=0.0;
        int numCalif=0;
         ///Solicitar el numero de calificaciones
         numCalif=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de calificaiones"));
        for (int i = 0; i <numCalif ; i++) {
            acumCalif+=Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificación "+(i+1)));
            acumCalif=acumCalif/numCalif;
        }
        JOptionPane.showMessageDialog(null,"El promedio es: "+acumCalif);
    }
}
