package proyecto;


import javax.swing.*;

public class Proyecto {

    // declaración de variables globales
    // productos
    static int Productos;


    public static void main(String[] args) {
        try {
            // Añadir el form
            Interfaz formulario_principal = new Interfaz();
            formulario_principal.setVisible(true);
        }
        catch (Exception error){
            // impression de error por consola y ventana emergente
            System.out.println("Se produjo un error en main principal\n"+error);
            JOptionPane.showMessageDialog(null, "Se produjo un error en main principal\n"+error);
        }
        finally {
            // impression de error por consola y ventana emergente
            System.out.println("Programa finalizado");
            //JOptionPane.showMessageDialog(null, "Programa finalizado");
        }
    }

    // función para arrancar los hilos
    public static void Iniciar(){
            // Cargaremos los hilos
            Primera_LINEA Hilo_primera_l = new Primera_LINEA();

            // iniciamos lineas simultaneas
            Hilo_primera_l.run();
    }

    public static void Stop(){

    }


    // definimos las matrices
    static String[][] Matriz_Elementos = new String[1][21]; // NP / NM1 / 1 / 2 / 3/ NM2 / 1 / 2 / 3 / 4 / 5 / 6 / NM3 / 1 / 2 / 3 / 4 / 5 / 6 / 7 / 8 /
    static String[][] Matriz_Tiempos = new String[1][5];  // PRODUCTO / NM1 / NM2 / NM3 / TOTAL /

    // colores
    static String N = "\u001B[30m";
    static String R = "\u001B[31m";
    static String V = "\u001B[32m";
    static String A = "\u001B[33m";
    static String AZ = "\u001B[34m";
    static String P = "\u001B[35m";
    static String C = "\u001B[36m";
    static String B = "\u001B[37m";
    static String r = "\u001B[0m" ;

    
}
