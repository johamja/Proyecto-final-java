package proyecto;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Primera_LINEA extends Thread {

    // variables de estado tipo global
    // elementos
    double Elemento1 = 1.5;
    double Elemento2 = 4;
    double Elemento3 = 2;

    // conteo de productos entrantes
    static int P_Estado_primera_L = 1;
    static int P_Estado_segunda_l = 1;
    static int P_Estado_tercera_l = 1;


    @Override
    public void run() {
        try {
            // cargamos el segundo hilo
            Segunda_LINEA Hilo_segunda_l = new Segunda_LINEA();

            // tenemos el ciclo
            for (int i=0; i<Proyecto.Productos; i++){
                // el hilo se demora 6 segundos
                // 6 horas
                Thread.sleep(6*1000);
                // SEGUNDA linea
                // prendimos el segundo hilo
                Hilo_segunda_l.run();

                // Producto  [NP]
                Proyecto.Matriz_Elementos[P_Estado_primera_L][0] = Proyecto.V+String.valueOf(P_Estado_primera_L)+Proyecto.r;
                // Maquina  [NM1]
                Proyecto.Matriz_Elementos[P_Estado_primera_L][1] = Proyecto.C+"Ensambladora 1"+Proyecto.r;
                // Elemento 1  [2]
                Proyecto.Matriz_Elementos[P_Estado_primera_L][2] = (String.valueOf((Elemento1*P_Estado_primera_L)))+" %";
                // Elemento 2  [3]
                Proyecto.Matriz_Elementos[P_Estado_primera_L][3] = (String.valueOf((Elemento2*P_Estado_primera_L)))+" %";
                // Elemento 3  [4]
                Proyecto.Matriz_Elementos[P_Estado_primera_L][4] = (String.valueOf((Elemento3*P_Estado_primera_L)))+" %";
                // tomas el tiempo cuando acaba de llenar la matriz
                Date ahora = new Date();

                // funciones para el tiempo
                SimpleDateFormat Time = new SimpleDateFormat("KK:mm:ss - SSS");
                // para la matriz tiempo
                // Producto [PRODUCTO]
                Proyecto.Matriz_Tiempos[P_Estado_primera_L][0] = String.valueOf(P_Estado_primera_L);
                // Maquina [NM1]
                Proyecto.Matriz_Tiempos[P_Estado_primera_L][1] = Time.format(ahora);

                // aumentamos en uno la variable
                P_Estado_primera_L += 1;
            }

            //JOptionPane.showMessageDialog(null,"la variable en la linea 1\n"+ Proyecto.Productos);
        }
        catch (Exception error) {
            // impression de error por consola y ventana emergente
            System.out.println("Se produjo un error en el hilo Primera Linea \n"+error);
            JOptionPane.showMessageDialog(null, "Se produjo un error en el hilo Primera Linea\n"+error);
        }
        finally {
            // impression de error por consola y ventana emergente
            System.out.println("Hilo principal finalizado ------------");
            System.out.println(Proyecto.A+"H1 producto "+Proyecto.r+Proyecto.V+(P_Estado_primera_L - 1)+Proyecto.r);
            //JOptionPane.showMessageDialog(null, "Hilo finalizado");
        }
    }
}
