/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veritipleriornekleri;

/**
 *
 * @author Lenovo
 */
public class VeriTipleriOrnekleri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          /*2 adet sayı tanımlayınız. 
        İlk sayının değeri 8 ikinci sayının değeri 1,80 olsun. 
        Bu sayıların modunu ve çıkan modu ikinci sayı ile toplamını ekrana yazdıralım. */
        System.out.println("Soru 1 Çıktısı:");
        int sayi1 = 8;
        double sayi2 = 1.80;
        double mod = sayi1%sayi2;
        System.out.println(mod);
        System.out.println(mod+sayi2);
        
        /*Sonradan değiştirilmesi mümkün olmayacak şekilde bir string ifade tanımlayınız 
        ve bu değişken içerisine kendi isminizi atayınız. Ardından sayısal veri tipinde 
        2 adet 2 basamaklı sayı tanımlayınız ve bu iki sayıyı toplayıp 3 ile çarptıktan sonra 
        2 ye bölün. Tipini belirleyemediğimiz bir değişken türü daha oluşturduktan sonra 
        içerisine istediğiniz bir değeri atayarak tüm bu adımları ekranda yan yana gelecek 
        ve aralarında 1 adet boşluk olacak şekilde yazdırın. */
        System.out.print("Soru 2 Çıktısı:");
        final String metin = "Nisa";
        int say1 = 10;
        int say2 = 50;
        double islemSonucu = (say1+say2)*3/2;
        var deger = "Programlama Dersi";
        System.out.println(metin + " " + islemSonucu + " " + deger);
        
        
        /*Basit bir öğrenci kaldı geçti işlemi gerçekleştirin. 
        Bir değişken içerisine 2 adet vize ve final not değeri atayın ve bu iki notun ortalamasını alın. 
        Boolean tipini kullanarak girilen değerlerin ortalamasının 50 den büyük olması 
        durumunda geçti yani true ifadesi ekrana yazılsın, notun ortalamasının 
        50 den küçük olması durumunda kaldı anlamı taşıyan false ifadesi ekrana gelsin. */
        System.out.print("Soru 3 Çıktısı:");
        int vize = 100;
        int finalNotu = 50;
        int ortalama = (vize+finalNotu)/2;
        boolean gectiMi = (ortalama>50);
        System.out.println(gectiMi);
        
        /*3 adet sayı tanımlayınız ve ekrana çıktı olarak
        Bu sayıların toplamı: 3 sayının toplamı sonucunu yazdırın. */

        System.out.print("Soru 4 Çıktısı:");
        int s1 = 10;
        int s2 = 100;
        int s3 = 1;
        int toplam = s1+s2+s3;
        System.out.println("Bu sayıların toplamı:" + toplam );
       
        
        /* İnt sayi1 = 80; int sayi2=25 şeklinde iki değişken ve değer ataması sağlayın 
        ardından bu verilerin birbirleriyle eşit olup olmama durumunu karşılaştırın ve 
        4 işlem değişkenleri oluşturarak 4 işlem gerçekleştirin ekrana çıktısını veriniz. */
        System.out.println("Soru 5 Çıktısı:");
        int sayi1=80 , sayi2=25;
        boolean esitMi = (sayi1==sayi2);
        int toplama = (sayi1+sayi2);
        int cikarma = (sayi1-sayi2);
        int carpma = (sayi1*sayi2);
        int bolme = (sayi1/sayi2);
        System.out.println(esitMi);
        System.out.println("Toplama: " + toplama + " Çıkartma: " + cikarma +" Çarpma: " + carpma + " Bölme: " + bolme);


    }
    
}
