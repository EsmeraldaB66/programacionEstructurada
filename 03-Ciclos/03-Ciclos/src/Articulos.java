import javax.swing.*;

public class Articulos {
    public static void main(String[] args) {
        double precio=0.0;
        int cantidadArticulos=0;
        int i=0;
        cantidadArticulos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de artículos: "));
        i = 0;
        do {
            precio += Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del artículo " + (i + 1) + ":"));
            i++;
        } while (i < cantidadArticulos);
        JOptionPane.showMessageDialog(null, "Total de la compra: $" + precio);

    }
}
