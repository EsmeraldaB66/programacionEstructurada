import javax.swing.*;

public class Peso {
    public static void main(String[] args) {
        int numPersonas = 0;
        double mediaPeque = 0.0;
        int contadorPeque = 0;
        double mediaJov = 0.0;
        int contadorJov = 0;
        double mediaAdul = 0.0;
        int contadorAdul = 0;
        double mediaVie = 0.0;
        int contadorVie = 0;
        String salida="";

        numPersonas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de personas"));

        for (int i = 1; i <= numPersonas; i++) {
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad "));
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso"));

            if (edad >= 0 && edad <= 12) {
                contadorPeque++;
                mediaPeque+= peso;
            } else if (edad >= 13 && edad <= 29) {
                contadorJov++;
                mediaJov += peso;
            } else if (edad > 30 && edad <= 59) {
                contadorAdul++;
                mediaAdul+= peso;

            } else if (edad >= 60) {
                contadorVie++;
                mediaVie+= peso;
            }
        }

        mediaPeque/= contadorPeque;
        mediaJov /= contadorJov;
        mediaAdul/= contadorAdul;
        mediaVie/= contadorVie;

        salida= "La media es de :" + mediaPeque +
                " de " + contadorPeque + " niños" + "\nla media es de: " + mediaJov + " de " + contadorJov + " jovenes "
                + "\nLa media es :" + mediaAdul + " de " + contadorAdul + " adultos" + "\nLa media es : " + mediaVie +
                " de " + contadorVie+"viejos";
        JOptionPane.showMessageDialog(null,salida);
            }
}
