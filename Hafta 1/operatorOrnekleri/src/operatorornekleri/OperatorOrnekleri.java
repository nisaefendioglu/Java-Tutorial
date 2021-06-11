/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatorornekleri;

/**
 *
 * @author Lenovo
 */
public class OperatorOrnekleri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Örnek 1:
        /*İnt sayi1 = 80; int sayi2=25 şeklinde iki değişken 
        ve değer ataması sağlayın ardından bu verilerin birbirleriyle 
        eşit olup olmama durumunu karşılaştırın ve 4 işlem değişkenleri 
        oluşturarak 4 işlem gerçekleştirin ekrana çıktısını veriniz. */
            System.out.println("Örnek Soru 1 Çıktısı:");
            int sayi1=80;
	    int sayi2=25;
	    boolean esitMi = (sayi1==sayi2);
	    int toplama,cikarma,bolme,carpma,modAlma;
	    toplama = sayi1+sayi2;
	    cikarma = sayi1-sayi2;
	    bolme = sayi1/sayi2;
	    carpma = sayi1*sayi2;
	    modAlma = 80%25;
	    System.out.println(esitMi + "\n" + toplama + "\n" + cikarma + "\n" + bolme + "\n" + carpma + "\n" + modAlma);
	
            
            //Örnek 2:
            /* a,b,c ve d adında değişken oluşturun ve hepsine sırasıyla
            10,20,30,40 değerlerini atayın ardından atama 
            operatörlerinden kullanarak bu değerin 5 ile 4 işlemi toplama-cıkarma-bolme-carpma 
            sırasıyla gerçekleştirin.*/

            System.out.println("Örnek Soru 2 Çıktısı:");
            int a=10, b=20, c=30, d=40;
            a+=5;
            b-=5;
            c/=5;
            d*=5;
            System.out.println(a + "\n" + b + "\n" + c + "\n" + d);
            
            
        // TODO code application logic here
    }
    
}
