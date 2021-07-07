/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerodev2;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ScannerOdev2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ogrenci = new Scanner(System.in);
        System.out.println("Notunuzu Giriniz:");
        int note = ogrenci.nextInt();
        if (note <=100 && note>=85){
            System.out.println("Notunuz Pekiyi.");
        }
            else if (note <= 84 && note >= 70){
            System.out.println("Notunuz İyi.");
            }
            else if (note <= 69 && note >= 55){
            System.out.println("Notunuz Orta.");
            }
            else if (note <= 54 && note >= 45){
            System.out.println("Notunuz Geçer.");
            }
            else if (note <= 44 && note >= 0){
            System.out.println("Sınıfta kaldın:(");
            }
        else{
            System.out.println("Geçersiz not.");
        }

        // TODO code application logic here
    }
    
}
