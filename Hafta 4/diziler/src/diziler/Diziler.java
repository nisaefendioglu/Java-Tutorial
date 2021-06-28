/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diziler;

import java.util.Random;

/**
 *
 * @author Lenovo
 */
public class Diziler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Dizileri kullanarak 1’den 10’a kadar olan sayıları ekrana yazdıran programı yazınız.
        int[] dizi = {1,2,3,4,5,6,7,8,9,10};
        for(int i=0; i<=dizi.length; i++)
        System.out.println(dizi[i]);
     
        //Dizileri kullanarak 1’den 10 a kadar rastgele ve benzersiz sayıları ekrana çıktı veren programı yazınız.
        int[] dizi2 = new int[10];
        for(int i=0; i<10; i++) {
    	Random rastgele = new Random();
    	int sayi = rastgele.nextInt(100)+1;
    	dizi2[i] = sayi;
        System.out.println(sayi);
    }
        
        //İnt türünde bir dizi oluşturun içerisine veriler ekleyin. Dizinin kaç elemandan oluştuğunu ekrana yazdıran programı yazınız.
        int[] dizi3 = {1,3,5,7,9,12};
        System.out.println(dizi3.length);
        
        //Bir dizi oluşturun ve içerisine 5 adet isim atayınız ve ikinci atadığınız ismi ekrana çıktı veriniz.
        String [] dizi4 = {"Nisa", "Mehmet", "Ahmet", "Ali" , "Deniz"};
        System.out.println(dizi4[1]);
        
        //veya
        String [] isim = new String[5] ;
        isim[0]= "Yelda";
        isim[1]= "Mustafa";
        isim[2]= "Ahmet";
        isim[3]="Mehmet";
        isim[4]="Nisa";
        System.out.println(isim[1]);
          }
        // TODO code application logic here
    }
    
}
