import javax.swing.*;

public class PromedioClasi {
    public static void main(String[] args) {
        int numCalif = 0;
        double numMedio = 0.0;
        double numMenor = 0.0;
        double califObtenidas=0.0;

        numCalif = Integer.parseInt
                (JOptionPane.showInputDialog("Introduce el numero de calificaciones de lq materia"));

        for (int i = 1; i <= numCalif; i++) {

            califObtenidas= Double.parseDouble(JOptionPane.showInputDialog
                    (null, "Introduce la calificacion " + i + " :"));
            numMedio += califObtenidas;
            if (i == 1) {
                numMenor = califObtenidas;
            }

            if (califObtenidas < numMenor) {
                numMenor = califObtenidas;

            }

        }

        numMedio/=numCalif;

        //Salida
        JOptionPane.showMessageDialog(null, "La media de las calificaciones obtenidas es: " +
                numMedio+ "\nEl numero menor es:"+numMenor);
    }
}
