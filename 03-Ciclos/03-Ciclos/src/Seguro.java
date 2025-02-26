import javax.swing.*;

public class Seguro {
    public static void main(String[] args) {
        int i=0;
        int n=0;
        double sueldoBase=0.0, comision = 0.1, totalPago=0.0, venta=0.0, comisionTotal=0.0;
        String resultado1 = "";
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de vendedores:"));
        sueldoBase = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo base de los vendedores:"));

        i = 1;
        while (i <= n) {
            venta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto total de ventas del vendedor " + i + ":"));
            comisionTotal = venta * comision;
            totalPago = sueldoBase + comisionTotal;
            resultado1 += "Vendedor " + i + ": Sueldo Base = $" + sueldoBase + ", Comisión = $" + comisionTotal + ", Pago Total = $" + totalPago + "\n";
            i++;
        }
        JOptionPane.showMessageDialog(null, resultado1);
    }
}
