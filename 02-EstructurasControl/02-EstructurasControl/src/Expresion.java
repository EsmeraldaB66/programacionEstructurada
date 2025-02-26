import javax.swing.*;

public class Expresion {
    public static void main(String[] args) {
        //Declaracion de variables
        double saldo=0.0;
        double prestamo=0.0;
        double equipoComputo=0.0;
        double mobiliario=2000;
        double compraInsumos=0.0;
        double insentivo=0.0;
        String salida="";

        //Solicitar el saldo
        saldo=Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu saldo"));

        if (saldo<0.0) {
            prestamo=10000.0;
        } else if (saldo>0.0 && saldo<20000) {
            prestamo=(20000.0-saldo);
        }else {
            prestamo=saldo;
        }
        equipoComputo=5000;
        prestamo-=equipoComputo;
        prestamo-=mobiliario;
        compraInsumos=prestamo/2.0;
        prestamo-=prestamo/2.0;
        insentivo=prestamo;

        salida="Resultado\n"+
                "Compra de insumos "+compraInsumos+
                "\nIncentivos del personal: "+insentivo+
                "\nEqupo de computo: "+equipoComputo+
                "\nMobiliario: "+mobiliario;
        JOptionPane.showMessageDialog(null,salida);
    }

}
