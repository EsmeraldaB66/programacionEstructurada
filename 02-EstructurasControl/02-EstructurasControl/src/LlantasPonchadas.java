import javax.swing.*;

public class LlantasPonchadas {
    public static void main(String[] args) {
        int catLlanta=0;
        double totalP=0.0;
        String salida="";
        catLlanta=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de llantas que desea comprar"));
        if (catLlanta<5){
            totalP=catLlanta*300;
            salida="Usted compro "+catLlanta+" llantas, con un precio de 300 cada una, \npor lo que debera pagar un total de "+totalP;
        } else if (catLlanta>=5 && catLlanta<10) {
            totalP=catLlanta*250;
            salida="Usted compro "+catLlanta+" llantas, con un precio de 250 cada una, \npor lo que debera pagar un total de "+totalP;
        }else {
            totalP=catLlanta*200;
            salida="Usted compro "+catLlanta+" llantas, con un precio de 200 cada una, \npor lo que debera pagar un total de "+totalP;
        }
        JOptionPane.showMessageDialog(null,salida);
    }
}
