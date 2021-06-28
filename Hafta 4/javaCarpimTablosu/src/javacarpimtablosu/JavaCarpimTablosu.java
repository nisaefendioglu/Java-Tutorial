/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacarpimtablosu;

/**
 *
 * @author Nisa 
 */
public class JavaCarpimTablosu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         for (int j = 1; j <= 10; j++) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + "*" + j + "=" + (i * j) + " ");
            }
            System.out.println();
        }
   
    }
    
}
