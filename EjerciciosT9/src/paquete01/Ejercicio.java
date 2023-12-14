/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String marcas[];
        System.out.println("Ingrese cantidad de marcas a ingresar");
        int numero = entrada.nextInt();
        marcas = new String[numero];
        String cadena = "";
        entrada.nextLine();
        for (int i = 0; i < numero; i++) {

            System.out.println("Ingresar marcas de autos");
            String marca = entrada.nextLine();

            marcas[i] = marca;
            //  a b c
            //  0 1 2
            //char primera=marca.charAt(0);
            String primeraLetra = marca.substring(0);
            if (primeraLetra.equals("A") || primeraLetra.equals("C")
                    || primeraLetra.equals("T")) {

            } else {
                cadena = String.format("%s\n", marca);
            }

        }
        System.out.printf("\nMarcas de autos ingresadas:\n%s", cadena);

    }

}
