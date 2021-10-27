package proyecto;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Tercera_LINEA extends Thread {

    // variables de estado tipo global
    // elementos
    double Elemento1 = 3.5;
    double Elemento2 = 2.5;
    double Elemento3 = 12;
    double Elemento4 = 6;
    double Elemento5 = 6.6;
    double Elemento6 = 2.5;
    double Elemento7 = 8;
    double Elemento8 = 5.5;


    @Override
    public void run() {
        try {

            // el hilo se demora 2 segundos
            // 2 horas
            Thread.sleep(2*1000);

            // Maquina  [NM3]
            Proyecto.Matriz_Elementos[Primera_LINEA.P_Estado_tercera_l][12] = Proyecto.C+"Ensambladora 3"+Proyecto.r;
            // Elemento 1  [6]
            Proyecto.Matriz_Elementos[Primera_LINEA.P_Estado_tercera_l][13] = (String.valueOf((Elemento1*Primera_LINEA.P_Estado_tercera_l)))+" %";
            // Elemento 2  [7]
            Proyecto.Matriz_Elementos[Primera_LINEA.P_Estado_tercera_l][14] = (String.valueOf((Elemento2*Primera_LINEA.P_Estado_tercera_l)))+" %";
            // Elemento 3  [8]
            Proyecto.Matriz_Elementos[Primera_LINEA.P_Estado_tercera_l][15] = (String.valueOf((Elemento3*Primera_LINEA.P_Estado_tercera_l)))+" %";
            // Elemento 4  [9]
            Proyecto.Matriz_Elementos[Primera_LINEA.P_Estado_tercera_l][16] = (String.valueOf((Elemento4*Primera_LINEA.P_Estado_tercera_l)))+" %";
            // Elemento 5  [10]
            Proyecto.Matriz_Elementos[Primera_LINEA.P_Estado_tercera_l][17] = (String.valueOf((Elemento5*Primera_LINEA.P_Estado_tercera_l)))+" %";
            // Elemento 6  [11]
            Proyecto.Matriz_Elementos[Primera_LINEA.P_Estado_tercera_l][18] = (String.valueOf((Elemento6*Primera_LINEA.P_Estado_tercera_l)))+" %";
            // Elemento 5  [10]
            Proyecto.Matriz_Elementos[Primera_LINEA.P_Estado_tercera_l][19] = (String.valueOf((Elemento7*Primera_LINEA.P_Estado_tercera_l)))+" %";
            // Elemento 6  [11]
            Proyecto.Matriz_Elementos[Primera_LINEA.P_Estado_tercera_l][20] = (String.valueOf((Elemento8*Primera_LINEA.P_Estado_tercera_l)))+" %";
            // tomas el tiempo cuando acaba de llenar la matriz
            Date ahora = new Date();

            // funciones para el tiempo
            SimpleDateFormat Time = new SimpleDateFormat("KK:mm:ss - SSS");
            // para la matriz tiempo
            // Máquina [NM1]
            Proyecto.Matriz_Tiempos[Primera_LINEA.P_Estado_tercera_l][2] = Time.format(ahora);

            //JOptionPane.showMessageDialog(null,"la variable en la linea 3\n"+ Proyecto.Productos);
            Primera_LINEA.P_Estado_tercera_l += 1;
        }
        catch (Exception error) {
            // impression de error por consola y ventana emergente
            System.out.println("Se produjo un error en el hilo Tercera Linea \n"+error);
            JOptionPane.showMessageDialog(null, "Se produjo un error en el hilo Tercera Linea\n"+error);
        }
        finally {
            // mensaje de que todos los productos pasaron
            if ((Primera_LINEA.P_Estado_tercera_l-1) == Proyecto.Productos ){
                System.out.println(Proyecto.R+"TODOS LOS PRODUCTOS TERMINARON"+Proyecto.r);
            }else {
                // impression de error por consola y ventana emergente
                System.out.println("Hilo finalizado en");
                System.out.println(Proyecto.R+"H3 producto "+Proyecto.r+Proyecto.V+(Primera_LINEA.P_Estado_tercera_l - 1)+Proyecto.r);
            }
            //JOptionPane.showMessageDialog(null, "Hilo finalizado");
        }
    }
}
