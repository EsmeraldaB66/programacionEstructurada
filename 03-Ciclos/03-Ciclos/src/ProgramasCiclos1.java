import javax.swing.*;

public class ProgramasCiclos1 {
    public static void main(String[] args) {
        String menu="";
        String opcion="";
        boolean sentinel=true;
        //Creacion del menu

        menu="Menu Principal\n"+
                "1)Promedio calificaciones (for)\n"+
                "2)Vendedores (while)\n"+
                "3)Tienda (do-while)\n"+
                "4)Salir\n";
        do {
            opcion = JOptionPane.showInputDialog(menu);
            switch (opcion) {
                case "1":
                    int numCalif=0;
                    double calificacion=0.0;
                    double promedio=0.0;
                    //Solicitar el numero de calificaciones
                    numCalif=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de  calificaiones"));
                    for (int i = 0; i <=numCalif; i++) {
                        //Solicitar calificacion i
                        calificacion=Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion "+i));
                        //Acumular calificaciones
                        promedio+=calificacion;
                    }
                    promedio/=numCalif;
                    JOptionPane.showMessageDialog(null, "El promedio del alumno es: "+promedio);
                    break;
                case "2":
                    String nombre="";
                    int numeroVendedores=0;
                    double sueldoBase=0.0;
                    double comision=0.0;
                    double sueldoTotal=0.;
                    String salida="";
                    numeroVendedores=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de vendedores"));
                    sueldoBase=Double.parseDouble(JOptionPane.showInputDialog("Introduce el sueldo"));
                    salida="Nombre          Comisión      Sueldo total\n";// la \t da una tabulacion
                    int i=1;
                    while(i<=numeroVendedores){
                        nombre=JOptionPane.showInputDialog("Introduce el nombre del vendedor"+i);
                        salida+=nombre+"         "+comision+"         "+sueldoTotal+"\n";
                        i++;
                    }
                    JOptionPane.showMessageDialog(null,salida);
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Opcion 3");
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Adios, el programa ha terminado");
                    sentinel=false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no válida");
            }
        }while (sentinel);
    }
}
