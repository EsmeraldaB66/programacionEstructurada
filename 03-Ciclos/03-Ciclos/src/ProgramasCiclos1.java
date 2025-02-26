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
                    double sueldoTotal=0.0;
                    double v1=0.0;
                    double v2=0.0;
                    double v3=0.0;
                    String salida="";
                    numeroVendedores=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de vendedores"));
                    sueldoBase=Double.parseDouble(JOptionPane.showInputDialog("Introduce el sueldo"));
                    salida="Nombre          Comisión      Sueldo total\n";// la \t da una tabulacion
                    int i=1;
                    while(i<=numeroVendedores){
                        nombre=JOptionPane.showInputDialog("Introduce el nombre del vendedor "+i);
                        v1=Double.parseDouble(JOptionPane.showInputDialog("Introduce la venta 1"));
                        v2=Double.parseDouble(JOptionPane.showInputDialog("Introduce la venta 2"));
                        v3=Double.parseDouble(JOptionPane.showInputDialog("Introduce la venta 3"));
                        comision=(v1+v2+v3)*0.10;
                        sueldoTotal=sueldoBase+comision;
                        salida+=nombre+"         "+comision+"         "+sueldoTotal+"\n";
                        i++;
                    }
                    JOptionPane.showMessageDialog(null,salida);
                    break;
                case "3":
                    //Tienda de bolitas
                    String respuesta="", resultado="";
                    boolean sentinel2 =true;
                    double totalCompra=0.0, descuento=0.0, importe=0.0, total=0.0;
                    String tipoBolita="";
                    String menuBolitas="Tombola\n"+
                            "a)Bolita roja\n"+
                            "b)Bolita amarilla\n"+
                            "c)Bolita blanca\n"+
                            "Elegir opción";
                    resultado="Total de ventas\n"+
                            "Total a pagar             "+"Descuento               "+"Importe         \n";
                    do {
                        totalCompra=Double.parseDouble(JOptionPane.showInputDialog("Introduce el total de la compra"));
                        tipoBolita=JOptionPane.showInputDialog(menuBolitas);
                        if (tipoBolita.equalsIgnoreCase("a") || tipoBolita.equalsIgnoreCase("b")||tipoBolita.equalsIgnoreCase("c")) {
                            if (tipoBolita.equalsIgnoreCase("a")) {
                                descuento = totalCompra * 0.40;
                            } else if (tipoBolita.equalsIgnoreCase("b")) {
                                descuento = totalCompra * 0.25;
                            } else if (tipoBolita.equalsIgnoreCase("c")) {
                                descuento = 0.0;
                            }
                            importe=totalCompra-descuento;







                            totalCompra+=importe;
                            resultado+=totalCompra+"              "+descuento+"            "+importe+"\n";
                        }else {
                            JOptionPane.showMessageDialog(null,"Bolita no válida");
                        }
                        salida=JOptionPane.showInputDialog("Desea cerrar la caja si/no");
                        if(salida.equalsIgnoreCase("Si")){
                            sentinel2=false;
                        }
                    }while (sentinel2);
                        resultado+="Total: "+total;
                    JOptionPane.showMessageDialog(null, resultado);
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
