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
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan",
            "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning",
            "Juan Vasquez"};
        String[] promediosCualitativos = new String[7];
        String cadena = "";
        for (int i = 0; i < promedios.length; i++) {
            double promedio = promedios[i];
            if (promedio >= 0 && promedio <= 5.9) {
                promediosCualitativos[i] = "Regular";
            } else {
                if (promedio >= 6 && promedio <= 8.9) {
                    promediosCualitativos[i] = "Bueno";
                } else {
                    if (promedio >= 9 && promedio <= 10) {
                    }
                    promediosCualitativos[i] = "Sobresaliente";
                }
            }
            String promedios1 = promediosCualitativos[i];
            String estudiante = estudiantes[i];
            cadena = String.format("%s%s promedio: %.1f promedio cualitativo: %s\n",
                    cadena, estudiante, promedio, promedios1);

        }
        System.out.printf("%s\n",cadena);
    }

}
