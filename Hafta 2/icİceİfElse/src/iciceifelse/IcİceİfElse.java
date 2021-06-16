/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iciceifelse;

/**
 *
 * @author Lenovo
 */
public class IcİceİfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       // SORU 1
       /* 3 adet sayı tanımlayınız ve birbirleri arasındaki büyüklük ve küçüklük
         durumunu gösteriniz */
       
       System.out.println("Soru 1 Çıktısı:");
        int a = 7, b = 3, c = 1;
        if (a > b) { 
        System.out.println("a, b'den büyüktür."); 
                if (a > c) { 
        System.out.println("a, c'den de büyüktür."); 
         } 
                else { 
        System.out.println("a, c'den büyük değildir."); 
          }
        } 
        else{
            System.out.println("a, b'den  büyük değildir.");
        }
        
       // SORU 2
       /*Sürücü hızını içeren bir adet değişken tanımlayınız. 
       Eğer sürücünün hızı 90 dan büyük ise radara girdiniz bloğu çalışsın. 
       Hız 90 dan büyük ve eşit, 120 den küçük ise cezanız 200 Tl olarak ekrana yazsın. 
       Eğer hız 120 den büyük ve eşit ise cezanız 400 tl olarak ekrana versin.
       Sürücünün hızı 90 dan küçük olması durumunda ise ekrana hızınız normal yazısını versin. */
       
       System.out.println("Soru 2 Çıktısı:");
       int hiz = 110;
       if(hiz>90){
           System.out.println("Radara girdiniz.");
           if(hiz>=90 && hiz<120){
               System.out.println("Cezanız 200 TL");
           }
           else if(hiz>=120){
               System.out.println("Cezanız 400 TL");
           }
       }
       else {
           System.out.println("Hızınız normal.");
       }
      
    }
    
}
