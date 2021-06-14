/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelseıf;

/**
 *
 * @author Lenovo
 */
public class IfElseIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // SORU 1
        //Öğrencinin harf notunu hesaplayan programı yazınız.
        //100-90 arası AA
        // 89-70 arası BB
        //69-50 arası CC
        //49-30 arası DD
        // 30< FF
        System.out.println("Soru 1 Çıktısı:");
        int not = 80;
        if(not<= 100 && not>=90){
            System.out.println("AA");
        }
        else if (not<=89 && not >=70){
            System.out.println("BB");
        }
        else if (not<=69 && not >=50){
            System.out.println("CC");
        }
        else if (not <=49 && not >=30){
            System.out.println("DD");
        }
        else {
            System.out.println("FF");
        }
        
        //SORU 2
        /* doğru ve yanlis ismiyle 2 adet değişken oluşturun ve bunlara birer değer atayın. 
        4 yanlış 1 doğruyu götürecek şeklinde net hesaplamasını gerçekleştiriniz.
        Eğer net 85 e eşit ve büyükse çok başarılı,
        Eğer 75 e eşit ve 85 den küçük ise iyi seviye,
        Eğer 55 e eşit ve 75 den küçük ise orta seviye
        Eğer 55 den küçük ise kötü seviye olarak belirterek toplam net sayısını ekrana yazdırın. */
        
        System.out.println("Soru 2 Çıktısı:");
        int dogru = 70;
        int yanlis = 10;
        double net = dogru - yanlis/4;
        if(net >=85){
            System.out.println("Çok Başarılı");
            System.out.println("Toplam net sayısı:" + net);
        }
        else if (net>=75 && net<85){
            System.out.println("İyi Seviye");
            System.out.println("Toplam net sayısı:" + net);
        }
        else if (net>=55 && net<75){
            System.out.println("Orta Seviye");
            System.out.println("Toplam net sayısı:" + net);
        }
        else {
            System.out.println("Kötü Seviye");
            System.out.println("Toplam net sayısı:" + net);
        }
    }
    
    
}
