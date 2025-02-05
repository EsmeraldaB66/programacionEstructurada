import javax.swing.*;

public class CalculadoraRecargada {
    public static void main(String[] args) {
        //Declaración de variables
        String menu="";
        String opcion="", resultado="";
        double numero1=0.0, numero2=0.0;
        menu="MENU PRINCIPAL\n"+
                "a)Sumar\nb)Restar\n"+
                "c)Dividir\n"+
                "d)Multiplicar\n"+
                "e)Módulo\n"+
                "Elegir una opción";
        opcion= JOptionPane.showInputDialog(menu);

        numero1=Double.parseDouble(JOptionPane.showInputDialog("Introduce el número 1"));
        numero2=Double.parseDouble(JOptionPane.showInputDialog("Introduce el número 2"));
        opcion=opcion.toUpperCase();//Lo convierte a mayuscula
        if (numero2 > 0.0) {
            switch (opcion){
                case "a":
                    resultado="La suma es: "+(numero1+numero2);
                    break;
                case "b":
                    resultado="La resta es: "+(numero1-numero2);
                    break;
                case "c":
                    resultado="La división es: "+(numero1/numero2);
                    break;
                case "d":
                    resultado="La multiplicación es : "+(numero1*numero2);
                    break;
                case "e":
                    resultado="El módulo es: "+(numero1%numero2);
                    break;
                default:
                    resultado="Caso no válido";
            }
            JOptionPane.showMessageDialog(null,resultado);
        }else {
            JOptionPane.showMessageDialog(null,"El número 2 no puede ser 0 o negativo");
        }
        // JOptionPane.showMessageDialog(null,opcion);
    }
}
