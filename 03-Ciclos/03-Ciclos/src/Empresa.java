import javax.swing.*;

public class Empresa {
    public static void main(String[] args) {
        //Declaracion de variables
        int i=0;
        int numTrabajadores=0;
        int numHorasTrabajadas=0;
        int numHorasExtras=0;
        double salarioTotal=0.0;
        String salida="";
        numTrabajadores=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de trabajadores"));
        i=1;
        salida="Reporte de Salarios Semanales\n" +
                "Empleado      "+"Horas trabajadas        "+"Horas extras        "+"Salario Total\n";
        while (i<=numTrabajadores){
            numHorasTrabajadas=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de horas trabajadas"));
            numHorasExtras=0;
            if (numHorasTrabajadas<=40){
                salarioTotal=numHorasTrabajadas*20;
                salida+="Empleado "+i+"    "+numHorasTrabajadas+
                "     "+numHorasExtras+"    "+salarioTotal+"\n";
            }else {
                numHorasExtras=numHorasTrabajadas-40;
                salarioTotal=(40*20)+(numHorasExtras*25);
                salida+="Empleado "+i+"    "+numHorasTrabajadas+
                        "     "+numHorasExtras+"    "+salarioTotal+"\n";
            }
            i++;
        }
        JOptionPane.showMessageDialog(null,salida);
    }
}
