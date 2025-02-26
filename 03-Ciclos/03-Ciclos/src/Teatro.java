import javax.swing.*;

public class Teatro {
    public static void main(String[] args) {
        int edad, menoresDe5 = 0, categoria1 = 0, categoria2 = 0, categoria3 = 0, categoria4 = 0, categoria5 = 0;
        int i=0, totalClientesTeatro=0;
        String salida="";
        totalClientesTeatro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de clientes en el teatro: "));
        i = 0;
        do {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del cliente " + (i + 1) + ":"));
            if (edad < 5) {
                menoresDe5++;
            } else if (edad >= 5 && edad <= 14) {
                categoria1++;
            } else if (edad >= 15 && edad <= 19) {
                categoria2++;
            } else if (edad >= 20 && edad <= 45) {
                categoria3++;
            } else if (edad >= 46 && edad <= 65) {
                categoria4++;
            } else {
                categoria5++;
            }
            i++;
        } while (i < totalClientesTeatro);
        salida= "Clientes menores de 5 años (No pueden entrar): " + menoresDe5 +
                "\nCategoría 1 (5-14 años, 35% descuento): " + categoria1 +
                "\nCategoría 2 (15-19 años, 10% descuento): " + categoria2 +
                "\nCategoría 3 (20-45 años, 25% descuento): " + categoria3 +
                "\nCategoría 4 (46-65 años, 10% descuento): " + categoria4 +
                "\nCategoría 5 (66+ años, 35% descuento): " + categoria5;
        JOptionPane.showMessageDialog(null,salida);
    }
}
