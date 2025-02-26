import javax.swing.*;

public class Calificaciones {
    public static void main(String[] args) {
        double calif1=0.0;
        double calif2=0.0;
        double calif3=0.0;
        double calif4=0.0;
        double promedio=0.0;
        calif1=Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu calificacion 1"));
        calif2=Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu calificacion 2"));
        calif3=Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu calificacion 3"));
        calif4=Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu calificacion 4"));
    promedio=(calif1+calif2+calif3+calif4)/4;
    JOptionPane.showMessageDialog(null,"su promedio es de: "+promedio);
    }
}
