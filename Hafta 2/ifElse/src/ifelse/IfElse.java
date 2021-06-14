/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelse;

/**
 *
 * @author Lenovo
 */
public class IfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          /* SORU 1
        1 adet not değişkeni oluşturun. 
        Ardından bu girilen notun 50 den büyük olması durumunda geçti, 
        düşük olması durumunda kaldı yazısını ekrana yazdırın. */
       System.out.println("Soru 1 Çıktısı:");
       int not = 50;
       if(not > 50){
           System.out.println("Geçti");
       }
       else {
           System.out.println("Kaldı");
       }
       
       
       /* SORU 2
        İki adet sayı tanımlayınız ve bu sayıların birbirine eşit olması durumunda
        ekrana bu iki sayı eşittir yazısını verin, eşitsizlik durumunda ise 
        bu iki sayı birbirine eşit değildir yazısı ekrana gelsin. */
       
       System.out.println("Soru 2 Çıktısı:");
       int sayi1 = 50;
       int sayi2 = 100;
       if(sayi1 == sayi2){
           System.out.println("Bu iki sayı birbirine eşittir.");
       }
       else {
           System.out.println("Bu iki sayı birbirine eşit değildir.");
       }

       
       // SORU 3
       // 2 adet sayı tanımlayınız ve bu sayılardan büyük olanı ekrana yazdırınız. 
       System.out.println("Soru 3 Çıktısı:");
       int s1 = 10;
       int s2 = 12;
       if(s1 > s2){
           System.out.println(s1);
       }
       else {
           System.out.println(s2);
       }
       
       // SORU 4
       // Bir değişken içerisinde sayı değeri atayınız. Ardından bu sayının çift mi yoksa tek sayı mı olduğunu ekrana yazdırınız.
       System.out.println("Soru 4 Çıktısı:");
       int degisken = 4;
       if(degisken%2==0){
           System.out.println(degisken + " Sayısı Çift Sayı");
       }
       else {
           System.out.println(degisken + " Sayısı Tek Sayı");
       }
    
       //SORU 5
        /* Bir değişken içerisinde 5 adet sayı değeri atayınız. 
       Ardından bu sayıların çift mi yoksa tek sayı mı olduğunu 
       kontrol ederek çift olanları ekrana yazdırınız. */
       System.out.println("Soru 5 Çıktısı:");
       int ssayi1 = 4, ssayi2 =8, ssayi3 = 12, ssayi4=27, ssayi5=88;
       if(ssayi1%2==0){
           System.out.println(ssayi1);
       }
       if (ssayi2%2==0){
           System.out.println(ssayi2);
       }
       if (ssayi3%2==0){
           System.out.println(ssayi3);
       }
       if (ssayi4%2==0){
           System.out.println(ssayi4);
       }
       if (ssayi5%2==0){
           System.out.println(ssayi5);
       }
       else {
           System.out.println("Sayıların hepsi tek sayıdır.");
       }
    }
    
}
