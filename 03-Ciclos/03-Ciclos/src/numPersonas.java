import javax.swing.*;

public class numPersonas {
    public static void main(String[] args) {
        int personas=0, hombres = 0, mujeres = 0, i=0;
        personas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número total de personas:"));

        i = 1;
        while (i <= personas) {
            String genero = JOptionPane.showInputDialog("Ingrese el género de la persona " + i + " (M para masculino, F para femenino):");
            if (genero.equalsIgnoreCase("M")) {
                hombres++;
            } else if (genero.equalsIgnoreCase("F")) {
                mujeres++;
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, "Total de hombres: " + hombres + "\nTotal de mujeres: " + mujeres);
    }
}
