/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerodev;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ScannerOdev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);
        System.out.println("Kilonuzu giriniz:");
        double kilo = veri.nextDouble();
        System.out.println("Boyunuzu Giriniz:");
        double boy = veri.nextDouble();
        boy = boy/100;
        double vki = kilo/(boy*boy);
        if(vki<18.5){
            System.out.println("Zayıf " + vki);
        }
        else if (vki>=18.5 && vki<=24.9){
            System.out.println("Normal " + vki);
         }
        else if(vki>24.9 && vki<=29.9){
            System.out.println("Hafif Şişman " + vki);
        }
        else if (vki>29.9){
            System.out.println("Obez " + vki);
        }
        // TODO code application logic here
    }
    
}
