/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Antes de analizar el presente ejercicio,
        usted debe revisar y entender lo desarrollado
        en el archivo Ayuda01.java del paquete2
         */
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan",
            "Teresa", "Luis", "Mark", "Jennifer",
            "Alcides"};

        String[] inicial = new String[estudiantes.length];
        char inicialLetra;
        boolean bandera = true;
        String trembol;
        while (bandera) {
            //ingresamos datos
            System.out.println("Ingrese una letra");
            trembol = entrada.nextLine().toUpperCase();
            for (int i = 0; i < estudiantes.length; i++) {
                inicial[i] = estudiantes[i].substring(0, 1);
            }

            for (int i = 0; i < estudiantes.length; i++) {
                if (trembol.equals(inicial[i])) {
                    bandera = false;

                }
            }

        }

    }

}
