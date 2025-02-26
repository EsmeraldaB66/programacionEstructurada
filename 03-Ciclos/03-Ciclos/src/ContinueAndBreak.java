import javax.swing.*;

public class ContinueAndBreak {
    //El continue no continua todo el ciclo, sino da la vuelta
    public static void main(String[] args) {
        //Declaración de variables
        int suma=0;
        int numero=0;
        int n=0;
        n=Integer.parseInt(JOptionPane.showInputDialog("Introduce el total de números a ingresar"));
        for (int i = 1; i <= n; i++) {
             numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número"+i));
             if (numero==0){
                 continue;//No suma, solo lo regresa
             }
             if (numero<0){
                 break;//termina el ciclo
             }
             suma+=numero;
        }
        JOptionPane.showMessageDialog(null,"La suma de los números es: "+suma);
    }
}
