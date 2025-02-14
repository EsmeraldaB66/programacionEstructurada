import javax.swing.*;

public class Estereos {
    public static void main(String[] args) {
        double precio=0.0, preciT=0.0;
        String salida="", marca="";
        precio=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio que pagara en su compra"));
        marca=JOptionPane.showInputDialog("Ingrese la marca de su producto");
        if (precio>=2000){
            if (marca=="NOSY"){
                preciT=precio*0.15;
                salida="Usted pagara $"+preciT+" con un descuento del 15%";
            }else {
                preciT=precio*0.10;
                salida="Usted pagara $"+preciT+" con un descuento del 10%";
            }
        }else if (marca=="NOSY"){
            preciT=precio*0.05;
            salida="Usted pagara $"+preciT+" con un descuento del 5%";
        }else{
            salida="Usted pagara $"+preciT;
        }
        JOptionPane.showMessageDialog(null,salida);
    }
}
