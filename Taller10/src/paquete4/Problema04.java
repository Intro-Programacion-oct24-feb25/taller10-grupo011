/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

/**
 *
 * @author reroes
 */
public class Problema04 {
    public static void main(String[] args) {
       
        double[][] datos = new double[2][2];
        int contadorFueraDeRango = 0;
        
        
        java.util.Scanner entrada = new java.util.Scanner(System.in);

        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Ingrese un valor para la posición "
                        + "[" + i + "][" + j + "]:");
                double valor = entrada.nextDouble();
                
                
                if (valor > 1000 && valor < 1199) {
                    datos[i][j] = valor; 
                } else {
                    datos[i][j] = 10; 
                    contadorFueraDeRango++; 
                }
            }
        }
        
        // Mostrar el arreglo resultante
        System.out.println("\nArreglo final:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(datos[i][j] + " ");
            }
            System.out.println();
        }
        
        
        System.out.println("Número de valores fuera de rango: " + 
                contadorFueraDeRango);
    }
}
