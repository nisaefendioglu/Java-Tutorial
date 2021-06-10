/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veritipleri;

/**
 *
 * @author Lenovo
 */
public class VeriTipleri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int sayi = 10; //ondalik içermeyen sayısal veri tipi tanımlaması
        double doubleSayi = 1.80; //ondalıklı verileri içeren veri tipi tanımlaması
        float floatSayi = (float) 1.90; //ondalıklı veri tiplerinden bir diğeri olan float tanımlaması
        System.out.println(sayi + " " +  doubleSayi + " "+ floatSayi);

        
        String isim = "Java"; //metinsel ifadeler tanımlamak için string veri tipi kullanılır.
        char karakter = 'a'; //tek karakter içeren ifadeler tanımlamak için char
        System.out.println(isim);
        System.out.println(karakter);

        
        //boolean örneği
        int a=5; // a değerine 5 atadık
        int b=6; // b değerine 6 atadık
        boolean x; // boolean tipimizin değişken adını x olarak belirledik.
        x = (a==b); // a ve b ifadelerinin birbirlerine eşit olması durumu
        System.out.println(x);
        
        //tipini belirtemediğimiz veya belirtmek istemediğimiz koşulllarda 'var' ifadesi kullanılır.
        var degisken = "Java dersi";
        var sayisalDegisken = 5;
        
        
        //sabit bir fonksiyon tanımlamak için final kelimesini kullanırız.
        final int fSayi=5;
        final String fMetin = "Java ile Uygulama Geliştirme Dersi";
        
        //mod alma
        int mod = 19%5;
        System.out.println(mod);
        
        
         //arttırma ve azaltma işlemleri
        int arttirma = 10;
        arttirma ++;
        
        int azaltma = 8;
        azaltma--;
        
    }
    
}
