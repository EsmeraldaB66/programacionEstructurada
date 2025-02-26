import javax.swing.*;

public class SegundoMinutos {
    public static void main(String[] args) {
        int segundos=0;
        double minutos=0;
        segundos=Integer.parseInt(JOptionPane.showInputDialog("Ingresa los segundos"));
        minutos=(segundos/60.0);
        JOptionPane.showMessageDialog(null,"los minutos son: "+minutos);
    }
}
