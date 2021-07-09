/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hastaneotomasyonu;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class HastaneOtomasyonu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner veri = new Scanner (System.in);
        System.out.println("Adınızı Giriniz:");
        String isim = veri.next();
        System.out.println("Soyadınızı Giriniz:");
        String soyad = veri.next();
        System.out.println("TC Kimlik Numaranız:");
        long tcKimlik = veri.nextLong();
        System.out.println("Telefon Numaranız:");
        int telNo = veri.nextInt();
        System.out.println("1.Kardiyoloji 2. Göz Hastalıkları 3. Ortopedi");
        System.out.println("Seçmek istediginiz bölümün numarasını giriniz:");
        int secim = veri.nextInt();
        if(secim==1){
            System.out.println("Kardiyoloji");
        }
        else if (secim==2){
            System.out.println("Göz Hastalıkları");
        }
        else if (secim==3){
            System.out.println("Ortopedi");
        }
        else {
            System.out.println("Hatalı Giriş");
        }
        
        System.out.println("Tarih bilgisi giriniz: ");
        String tarih = veri.next();
        
        System.out.println("Saat Bilgisi giriniz:");
        String saat = veri.next();
        
        System.out.println("Randevunuz Oluşturulmuştur.");
        System.out.println(isim + "\n" + soyad + "\n" + tcKimlik + "\n" + telNo + "\n" + secim + " " + tarih + " " + saat);
        // TODO code application logic here
        // TODO code application logic here
    }
    
}
