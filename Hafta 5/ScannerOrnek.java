/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerornek;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ScannerOrnek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Kullanıcıdan sayısal ve metinsel değer alarak ekrana yazdır.
        Scanner kullaniciVerisi = new Scanner(System.in);
        System.out.println("Yaşınızı Giriniz:");
        int yas = kullaniciVerisi.nextInt();
        System.out.println("Yaşınız:" + yas); 
        
        System.out.println("Adınızı Giriniz:");
        String isim = kullaniciVerisi.next();
        System.out.println("Adınız:" + isim);
        
        //Boolean kullanımı 
        System.out.println("Boolean ifade giriniz: true or false");
        boolean bool = kullaniciVerisi.nextBoolean();
        System.out.println(bool);
        
        //Kullanıcının ismini alarak ekrana Hoş geldin «kullanıcının adı» yazdır.
        System.out.println("Adınızı giriniz:");
        String ad = kullaniciVerisi.next();
        System.out.println("Hoş geldin " + ad);
        
        //Kullanıcıdan alınan iki sayının toplamını ekrana yazdır.
        System.out.println("1.sayıyı giriniz:");
        int sayi1 = kullaniciVerisi.nextInt();
        System.out.println("2. sayıyı giriniz:");
        int sayi2 = kullaniciVerisi.nextInt();
        System.out.println("İki sayının toplamı:" + (sayi1+sayi2));
        
        //Öğrenci not ortalaması kaldı/geçti uygulaması yapınız.

        
        //
        // TODO code application logic here
    }
    
}
