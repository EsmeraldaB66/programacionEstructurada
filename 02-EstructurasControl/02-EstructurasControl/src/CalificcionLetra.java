import javax.swing.*;

public class CalificcionLetra {
    public static void main(String[] args) {
        double calif=0.0;
        char letra=' ';
        String salida=" ";
        calif=Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu calificación"));
        if (calif>=0.0 && calif<=10.0){
            if (calif>=9.0){
                letra='A';
            } else if (calif>=8.0 && calif<=8.9) {
                letra='B';
            } else if (calif>=7.0 && calif<=7.9) {
                letra='C';
            } else if (calif>=6.0 && calif<=6.9) {
                letra='D';
            }else {
                letra='F';
            }
            salida="Tu calificacion es "+calif+" tu letra corresponiente es "+letra;
        }else {
            salida ="Calificación no valida";
        }
        JOptionPane.showMessageDialog(null,salida);
    }
}
