import javax.swing.*;

public class EstructurasControlP1 {
    public static void main(String[] args) {
        //Declaración de variables
        String opcion="";
        String menu="a)Caso de línea\n"+"b)Fruteria\n"+"c)Laboratorio\n"+"d)Salir\n"+"Elegir una opción: ";
        opcion= JOptionPane.showInputDialog(menu);
        opcion=opcion.toUpperCase();

        switch (opcion){
            case "A":
                jugar();
                break;
            case"B":
                double cantKilos=0.0;
                String resu="";
                double precio=0.0;
                precio=Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio de las manzanas"));
                cantKilos=Double.parseDouble(JOptionPane.showInputDialog("Introduce el total de kilos de manzana"));
                if (cantKilos>0.0 && precio>0.0){
                    if(cantKilos>=0.0 && cantKilos<=2.0){
                        resu="El total a pagar sin descuento es: "+(cantKilos*precio);
                    }else if(cantKilos>=2.1 && cantKilos<=5.0){
                        double descuento=(cantKilos*precio)*0.10;
                        resu="El total a pagar con un descuento (10%) "+ descuento+" es "+((cantKilos*precio)-descuento);
                    }else if(cantKilos>=5.01 && cantKilos<=10.0){
                        double descuento=(cantKilos*precio)*0.15;
                        resu="El total a pagar con un descuento (15%) "+ descuento+" es "+((cantKilos*precio)-descuento);
                    }else{
                        double descuento=(cantKilos*precio)*0.20;
                        resu="El total a pagar con un descuento (20%) "+ descuento+" es "+((cantKilos*precio)-descuento);
                    }
                    JOptionPane.showMessageDialog(null,resu);
                }else{
                    if (cantKilos<0.0){
                        JOptionPane.showMessageDialog(null,"La cantidad de kilos no puede ser negativo ni 0");
                    }
                    if (precio<0.0){
                        JOptionPane.showMessageDialog(null,"El precio no puede ser negativo");
                    }
                }
                break;
            case "C":
                double nivelHemoglobina;
                int edad;
                String sexo = "",salida="";

                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad en meses (si es mayor a 15 años, ingrese 180):"));
                if (edad >= 180) {
                    sexo = JOptionPane.showInputDialog("Ingrese el sexo (M para masculino, F para femenino):");
                }
                nivelHemoglobina = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nivel de hemoglobina en g%:"));


                boolean tieneAnemia = false;
                switch (edad) {
                    case 0: case 1:
                        tieneAnemia = nivelHemoglobina < 13;
                        break;
                    case 2: case 3: case 4: case 5: case 6:
                        tieneAnemia = nivelHemoglobina < 10;
                        break;
                    case 7: case 8: case 9: case 10: case 11: case 12:
                        tieneAnemia = nivelHemoglobina < 11;
                        break;
                    default:
                        if (edad > 12 && edad <= 60) {
                            tieneAnemia = nivelHemoglobina < 11.5;
                        } else if (edad > 60 && edad <= 120) {
                            tieneAnemia = nivelHemoglobina < 12.6;
                        } else if (edad > 120 && edad < 180) {
                            tieneAnemia = nivelHemoglobina < 13;
                        } else {
                            switch (sexo.toUpperCase()) {
                                case "F":
                                    tieneAnemia = nivelHemoglobina < 12;
                                    break;
                                case "M":
                                    tieneAnemia = nivelHemoglobina < 14;
                                    break;
                            }
                        }
                        break;
                }


                if (tieneAnemia) {
                    salida = "El paciente tiene anemia.";
                } else {
                    salida = "El paciente NO tiene anemia.";
                }

                JOptionPane.showMessageDialog(null, salida);
                break;
            case "D":
                JOptionPane.showMessageDialog(null,"El programa términado");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opción no válida");
        }
    }
    public static void jugar(){
        String pregunta="¿Colon descubrió América?";
        String respuesta=JOptionPane.showInputDialog(pregunta+" Si/No");
        if (respuesta.equalsIgnoreCase("Si")){
            respuesta=JOptionPane.showInputDialog("¿La independencia de México fue en 1810?");
            if (respuesta.equalsIgnoreCase("Si")){
                respuesta=JOptionPane.showInputDialog("¿The DOORS fue un grupo de Rock Americano?");
                if(respuesta.equalsIgnoreCase("Si")){
                    JOptionPane.showMessageDialog(null,"Has ganado...");
                }else{
                    JOptionPane.showMessageDialog(null,"Respuesta incorrecta, has perdido");
                }
            }else{
                JOptionPane.showMessageDialog(null,"Respuesta incorrecta, has perdido");
            }
        }else {
            JOptionPane.showMessageDialog(null,"Respuesta incorrecta, has perdido");
        }
    }
}
