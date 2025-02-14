import javax.swing.*;

public class FabricaComputadoras {
    public static void main(String[] args) {
        int cantComputadoras=0;
        double totalP=0;
        final int precio=11000;
        String salida="";
        cantComputadoras=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de computadoras que desea comprar"));
        if (cantComputadoras<5){
            totalP=((cantComputadoras*precio)*0.10);
            salida="Usted compro "+cantComputadoras+" computadoras, por lo tanto debe pagar "+totalP+" con un 10% de descuento";
        } else if (cantComputadoras>=5 && cantComputadoras<10) {
            totalP=((cantComputadoras*precio)*0.20);
            salida="Usted compro "+cantComputadoras+" computadoras, por lo tanto debe pagar "+totalP+" con un 20% de descuento";
        }else {
            totalP=((cantComputadoras*precio)*0.40);
            salida="Usted compro "+cantComputadoras+" computadoras, por lo tanto debe pagar "+totalP+" con un 40% de descuento";
        }
        JOptionPane.showMessageDialog(null,salida);
    }
}
