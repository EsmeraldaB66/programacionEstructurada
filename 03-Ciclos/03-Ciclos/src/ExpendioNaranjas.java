import javax.swing.*;

public class ExpendioNaranjas {
    public static void main(String[] args) {
        double kilos = 0.0;
        int clientes = 0;
        double compras = 0.0;
        double descuento = 0.0;
        int contaCliente = 0;
        double precio = 0.0;
        int contador2 = 0;
        String salida="";

        clientes = Integer.parseInt
                (JOptionPane.showInputDialog("Ingrese numero de clientes "));

        for (int i = 1; i <= clientes; i++) {
            kilos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero de kilos "));
            precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del kilo"));
            if (kilos >= 10) {
                contaCliente++;
                descuento = kilos * precio * 0.15;
                kilos *= precio;
                descuento = kilos - descuento;

            } else {
                contador2++;
                kilos *= precio;
            }
        }
        compras = descuento + kilos;
        salida="El numero total de clientes es de: " +
                clientes + " \ny " + contaCliente + " reciebieron descuento del 15% " +
                " dando un total de " + descuento + " \nlos " + contador2 + " clientes mas pagaron un total de: "
                + kilos + " \nteniendo la empresa un total de"+compras;
        JOptionPane.showMessageDialog(null,salida);
        }
}
