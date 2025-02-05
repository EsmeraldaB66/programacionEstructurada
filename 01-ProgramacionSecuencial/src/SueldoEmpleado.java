import javax.swing.*;

/*Realizar un programa que calcule e imprima el sueldo de un empleado, bajo las
siguientes características
a. Se debe almacenar el nombre del empleado
b. Las horas trabajadas que deben ser horas sin parte fraccionaria
c. Cuota por hora
d. Se debe imprimir el nombre del Trabajador y el Sueldo que va a percibir */
public class SueldoEmpleado {
    public static void main(String[] args) {
        String nombreT="";
        int horas=0;
        int cuota=0;
        int pago=0;
        String salida="";
        nombreT = javax.swing.JOptionPane.showInputDialog("Ingresa tu nombre");//Pide que el usuario ingrese el valor
        horas=Integer.parseInt(JOptionPane.showInputDialog("Ingresa tus horas"));
        cuota=Integer.parseInt(JOptionPane.showInputDialog("Ingresa cuantos te pagan por hora"));
        pago=horas*cuota;
        salida="Su nombre es: "+nombreT+" \nusted trabajo "+horas+" horas "+" \ncon una cuota "+cuota+
                " \nsu sueldo es de "+pago;
        JOptionPane.showMessageDialog(null,salida);

    }
}
