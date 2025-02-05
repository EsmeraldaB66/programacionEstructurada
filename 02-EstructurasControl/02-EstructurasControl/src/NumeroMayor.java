import javax.swing.*;

/*Evaluar si un numero es mayor a 10, utilizando el operador ternario (?)

    (expresion)?parte true: parte false

*/
public class NumeroMayor {
    public static void main(String[] args) {

        //Declaración de variables
        double numero=0.0;
        String salida="";
        //Entrada
        numero=Double.parseDouble(JOptionPane.showInputDialog("Introduce el número"));
        salida=(numero>10)?"El numero es mayor a 10":"El número es menor a 10";
        JOptionPane.showMessageDialog(null,salida);

        if (numero>10){
            salida="El número es mayor a 10";
        }else {
            salida="El número es menor a 10";
        }

    }
}
