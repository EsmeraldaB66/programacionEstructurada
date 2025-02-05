import javax.swing.*;

public class CalculadoraSencilla {
    public static void main(String[] args) {
        //Declaración de variables
        String menu="";
        String opcion="";
        double resultado=0.0, numero1=0.0, numero2=0.0;
        menu="MENU PRINCIPAL\n"+
        "1)Sumar\n2)Restar\n"+
        "3)Dividir\n"+
        "4)Multiplicar\n"+
        "5)Módulo\n"+
        "Elegir una opción";
        opcion=JOptionPane.showInputDialog(menu);

        numero1=Double.parseDouble(JOptionPane.showInputDialog("Introduce el número 1"));
        numero2=Double.parseDouble(JOptionPane.showInputDialog("Introduce el número 2"));
        if (numero2 > 0.0) {
            switch (opcion){
                case "":
                    resultado=numero1+numero2;
                    JOptionPane.showMessageDialog(null,"La suma es: "+resultado);
                    break;
                case "2":
                    resultado=numero1-numero2;
                    JOptionPane.showMessageDialog(null,"La resta es: "+resultado);
                    break;
                case "3":
                    resultado=numero1/numero2;
                    JOptionPane.showMessageDialog(null,"La división es: "+resultado);
                    break;
                case "4":
                    resultado=numero1*numero2;
                    JOptionPane.showMessageDialog(null,"La multiplicación es: "+resultado);
                    break;
                case "5":
                    resultado=numero1%numero2;
                    JOptionPane.showMessageDialog(null,"El módulo es: "+resultado);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Caso no válido");
            }
        }else {
            JOptionPane.showMessageDialog(null,"El número 2 no puede ser 0 o negativo");
        }
       // JOptionPane.showMessageDialog(null,opcion);
    }
}
