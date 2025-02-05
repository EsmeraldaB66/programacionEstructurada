import javax.swing.*;

public class Calificacion {
    public static void main(String[] args) {
        double calificacion=0.0;
        calificacion=Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu calificación: "));
        if (calificacion>=0.0 && calificacion<=10.0){
            if (calificacion>=7.0){
                JOptionPane.showMessageDialog(null, "Aprobado");
            }
        }
                JOptionPane.showMessageDialog(null,"Estas fuera del rango");
    }
}
