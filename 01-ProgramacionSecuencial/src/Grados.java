import javax.swing.*;

public class Grados {
    public static void main(String[] args) {
        double gradosCe=0.0;
        double gradosFa=0.0;
        gradosCe=Double.parseDouble(JOptionPane.showInputDialog("Introduce los grados"));
        gradosFa=(9/5*gradosCe)+32;
        JOptionPane.showMessageDialog(null,"La convercion de C-F es de: "+gradosFa);
    }
}
