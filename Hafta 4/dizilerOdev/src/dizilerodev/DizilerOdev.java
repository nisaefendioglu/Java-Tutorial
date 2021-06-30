/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dizilerodev;

/**
 *
 * @author Lenovo
 */
public class DizilerOdev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Aylık ücretler ve gelir vergilerini tutabildiğiniz iki adet diziniz olsun. aylık ücretler dizisi içerisine 3 adet ondalıklı ücretler giriniz. gelir verginizi %30 üzerinden hesaplayabilirsiniz.
        
         double[] aylıkÜcret = new double[3];
         aylıkÜcret[0] = 2500.45;
         aylıkÜcret[1] = 9006.74;
         aylıkÜcret[2] = 10867.83;
         double[] gelirVergisi = new double[3];
         for (int i = 0; i < aylıkÜcret.length; i++) {
         gelirVergisi[i] = aylıkÜcret[i] * 30 / 100;
         System.out.println(aylıkÜcret[i] + " ücretin gelir vergisi= " + gelirVergisi[i]);
         }
        
        //metinsel ifadeler barındıran bir dizi oluşturun ve tüm bu diziyi gelişmiş for döngüsü ile çıktı olarak veren programı yazınız.

        String [] isim = {"Mehmet", "Nisa", "Ayşe"};
        for(String i:isim)
        System.out.println(i);
     }
        
    }
    

