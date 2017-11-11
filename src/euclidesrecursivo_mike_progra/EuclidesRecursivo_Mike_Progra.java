/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euclidesrecursivo_mike_progra;

import java.util.Scanner;

/**
 *
 * @author sanch
 */
public class EuclidesRecursivo_Mike_Progra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner mike = new Scanner(System.in);
        System.out.println("Ingrese 3 numeros:"+" ");
        int x = mike.nextInt();
        int z = mike.nextInt();
        int y = mike.nextInt();
        Calculos_Matematicos Calculos = new Calculos_Matematicos(x,y,z);
        System.out.println("El minimo comun divisor es: " + Calculos.MCD_Euclides(x,y,z));
    }
    
}
