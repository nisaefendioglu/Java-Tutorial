/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannersinifi;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ScannerSinifi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kullaniciVerisi = new Scanner(System.in);
        //int türünde kullanım
        System.out.println("Yaşınızı Giriniz:");
        int yas = kullaniciVerisi.nextInt();
        System.out.println("Yaşınız:" + yas); 
        
        System.out.println("Adınızı Giriniz:");
        String isim = kullaniciVerisi.nextLine();
        System.out.println("Adınız:" + isim);
        
        boolean bifade = kullaniciVerisi.nextBoolean();
        double dSayi = kullaniciVerisi.nextDouble();
        byte bSayi = kullaniciVerisi.nextByte();
        float fSayi = kullaniciVerisi.nextFloat();
        
        // TODO code application logic here
    }
    
}
