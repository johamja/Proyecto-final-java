package proyecto;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Segunda_LINEA extends Thread {

    // variables de estado tipo global
    // elementos
    double Elemento1 = 1.8;
    double Elemento2 = 3;
    double Elemento3 = 15;
    double Elemento4 = 7;
    double Elemento5 = 9;
    double Elemento6 = 5.5;



    @Override
    public void run() {
        try {
            // cargamos el hilo
            Tercera_LINEA Hilo_tercera_l = new Tercera_LINEA();

            // el hilo se demora 4 segundos
            // 4 horas
            Thread.sleep(2*1000);
            // iniciamos la linea
            Hilo_tercera_l.run();

            // Maquina  [NM2]
            Proyecto.Matriz_Elementos[Primera_LINEA.P_Estado_segunda_l][5] = Proyecto.C+"Ensambladora 2"+Proyecto.r;
            // Elemento 1  [6]
            Proyecto.Matriz_Elementos[Primera_LINEA.P_Estado_segunda_l][6] = (String.valueOf((Elemento1*Primera_LINEA.P_Estado_segunda_l)))+" %";
            // Elemento 2  [7]
            Proyecto.Matriz_Elementos[Primera_LINEA.P_Estado_segunda_l][7] = (String.valueOf((Elemento2*Primera_LINEA.P_Estado_segunda_l)))+" %";
            // Elemento 3  [8]
            Proyecto.Matriz_Elementos[Primera_LINEA.P_Estado_segunda_l][8] = (String.valueOf((Elemento3*Primera_LINEA.P_Estado_segunda_l)))+" %";
            // Elemento 4  [9]
            Proyecto.Matriz_Elementos[Primera_LINEA.P_Estado_segunda_l][9] = (String.valueOf((Elemento4*Primera_LINEA.P_Estado_segunda_l)))+" %";
            // Elemento 5  [10]
            Proyecto.Matriz_Elementos[Primera_LINEA.P_Estado_segunda_l][10] = (String.valueOf((Elemento5*Primera_LINEA.P_Estado_segunda_l)))+" %";
            // Elemento 6  [11]
            Proyecto.Matriz_Elementos[Primera_LINEA.P_Estado_segunda_l][11] = (String.valueOf((Elemento6*Primera_LINEA.P_Estado_segunda_l)))+" %";
            // tomas el tiempo cuando acaba de llenar la matriz
            Date ahora = new Date();

            // funciones para el tiempo
            SimpleDateFormat Time = new SimpleDateFormat("KK:mm:ss - SSS");
            // para la matriz tiempo
            // Máquina [NM1]
            Proyecto.Matriz_Tiempos[Primera_LINEA.P_Estado_segunda_l][3] = Time.format(ahora);

           // JOptionPane.showMessageDialog(null,"la variable en la linea 2\n"+ Proyecto.Productos);
            Primera_LINEA.P_Estado_segunda_l += 1;
        }
        catch (Exception error) {
            // impression de error por consola y ventana emergente
            System.out.println("Se produjo un error en el hilo Segundo Linea \n"+error);
            JOptionPane.showMessageDialog(null, "Se produjo un error en el hilo Segundo Linea\n"+error);
        }
        finally {
            // impression de error por consola y ventana emergente
            System.out.println("Hilo finalizado");
            System.out.println(Proyecto.AZ+"H2 producto "+Proyecto.r+Proyecto.V+(Primera_LINEA.P_Estado_segunda_l - 1)+Proyecto.r);
            //JOptionPane.showMessageDialog(null, "Hilo finalizado");
        }
    }
}
