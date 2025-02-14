import javax.swing.*;

public class CalificacionesContador {
    public static void main(String[] args) {
        //declaracion de variables
        int numAprobados=0;
        int numReprobados=0;
        int numCalif=0;
        double calif=0.0;

        numCalif=Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas calificaciones se van a evaluar?"));
        for (int i = 1; i <=numCalif ; i++) {
            calif=Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu calificación"+i));
            if (calif>=7.0){
                numAprobados++;//Contador de número de aprobados
            }else{
                numReprobados++;
            }
        }
        JOptionPane.showMessageDialog(null,"El número de aprobados: "+numAprobados
                                      +"\nEl numero de reprobados es : "+numReprobados);

        int i=1;
        numAprobados=0;
        numReprobados=0;
        while (i<=numCalif){
            calif=Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu calificación"+i));
            if (calif>=7.0){
                numAprobados++;//Contador de número de aprobados
            }else{
                numReprobados++;
            }
            i++;
        }
        JOptionPane.showMessageDialog(null,"El número de aprobados: "+numAprobados
                +"\nEl numero de reprobados es : "+numReprobados);

        numReprobados=0;
        i=0;
        numAprobados=0;
        do {
            calif=Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu calificación"+i));
            if (calif>=7.0){
                numAprobados++;//Contador de número de aprobados
            }else{
                numReprobados++;
            }
            i++;
        }while (i<=numCalif);
        JOptionPane.showMessageDialog(null,"El número de aprobados: "+numAprobados
                +"\nEl numero de reprobados es : "+numReprobados);
    }
}
