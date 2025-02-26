import javax.swing.*;

public class Transito {
    public static void main(String[] args) {
        int amarillo = 0, rosa = 0, rojo = 0, verde = 0, azul = 0;
        int numAutos=0, i=0;
        int ultimoDigito=0;
        String salida="";

        do {
            numAutos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de autos que ingresan a la ciudad"));
            if (numAutos < 1 || numAutos > 99) {
                JOptionPane.showMessageDialog(null,"El número de autos fuera del rango");
            }
        } while (numAutos < 1 || numAutos > 99);

        while ( i < numAutos) {
            do {
                ultimoDigito=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el último dígito de la placa del auto " + (i + 1)));
                if (ultimoDigito < 0 || ultimoDigito > 9) {
                    JOptionPane.showMessageDialog(null,"Digito fuera del rango");
                }
            } while (ultimoDigito < 0 || ultimoDigito > 9);
            switch (ultimoDigito) {
                case 1: case 2:
                    amarillo++;
                    break;
                case 3: case 4:
                    rosa++;
                    break;
                case 5: case 6:
                    rojo++;
                    break;
                case 7: case 8:
                    verde++;
                    break;
                case 9: case 0:
                    azul++;
                    break;
            }
            i++;
        }
        salida="Cantidad de autos (calcamonia):\n"+
        "Autos con calcomanía amarilla: " + amarillo+
        "\nAutos con calcomanía rosa: " + rosa+
        "\nAutos con calcomanía roja: " + rojo+
        "\nAutos con calcomanía verde: " + verde+
        "\nAutos con calcomanía azul: " + azul;
    JOptionPane.showMessageDialog(null,salida);
}
}
