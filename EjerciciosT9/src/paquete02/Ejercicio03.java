/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        double suma = 0;
        int contador = 0;
        int contador2 = 0;
        double mediaAritmetica;
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
            contador = contador + 1;
        }
        mediaAritmetica = suma / contador;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < mediaAritmetica) {
                contador2 = contador2 + 1;
            }
        }
        System.out.printf("Elementos por debajo de la media Aritmetica: "
                + "%d\n", contador2);
    }

}
