/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dongulerdowhile;

/**
 *
 * @author Lenovo
 */
public class DongulerDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //DO WHILE
        int sayi=1;
        do{
        System.out.println("Sayı değişkeni:" +sayi);
        }
        while(sayi<0);
        //do while döngüsü kullanmamızdan dolayı, koşul doğru olmasa dahi ekrana 1 kez döndürür.
       
        //1'den 5'e kadar olan sayıları ekrana yazdırınız.
        int say =1;
        do{
            System.out.println(say);
            say++;
        }
        while(sayi<=5);
        
        
        // Örnek Soru 1
        int x=100 , y=40, z=0;
        do{
          x -= 10;
          y += 10;
          z++;
          System.out.println(x+ " "+  y + " " + z);
      }
        while(x>y);
        System.out.println("Döngü " + z + " kere döndü.");
    }
    
        //1'den 5' e kadar olan sayıları ekrana yazdırın.
         int sayiDegeri = 1;
         do {
            System.out.println(sayiDegeri);
            sayiDegeri++;
            }
        while(sayiDegeri<=5);
         
        
        // 0'dan 100'e kadar olan sayıları ekrana veren programı yazınız.
         int sayilar = 0, toplam = 0;
        
        do{
            
            sayilar++;
            toplam += sayilar;
            
        } while(sayilar <= 100);
        System.out.println("Toplam: "+toplam);
        
        
        /*X değeri 100, y değeri 40 olan iki değişken tanımlayınız. 
        X değeri y değerinden küçük olana dek döngü devam etsin 
        ve döngüye her girildiğinde x değeri 10 azalarak y değeri 10 artsın.
        Program çıktısı olarak bu döngünün kaç kere döndüğünü ekrana yazsın. */
        
        int x=100 , y=40, i=0;
        do{
        i++;
        x=x-10;
        y=y+10;
        }
        while(x>y);
        System.out.println("Döngü" + i + "kere döndü");
        
}
