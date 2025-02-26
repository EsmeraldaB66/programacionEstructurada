import javax.swing.*;

public class Comisiones {
    public static void main(String[] args) {
        double sueldoBase=0.0, venta1=0.0, venta2=0.0, venta3=0.0, comision=0.0, sueldoTotal=0.0;
        String salida="";

        sueldoBase = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo base:"));
        venta1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la primera venta:"));
        venta2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la segunda venta:"));
        venta3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la tercera venta:"));

        comision = (venta1 + venta2 + venta3) * 0.10;
        sueldoTotal = sueldoBase + comision;

        salida   = "Resumen de ingresos:\n" +
                "Sueldo Base: " + sueldoBase + "\n" +
                "Comisión por ventas: " + comision + "\n" +
                "Sueldo Total: " + sueldoTotal;

        JOptionPane.showMessageDialog(null, salida);
    }
}
