/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author Lenovo
 */
public class Constructor {

    /**
     * @param args the command line arguments
     */
    public int sayi1 = 15;
    public int sayi2 = 500;
  Constructor(){
        System.out.println("Toplam: " + (sayi1+sayi2));
    }
    
    Constructor(int yeniSayi1, int yeniSayi2){
        sayi1 = yeniSayi1;
        sayi2 = yeniSayi2;
        System.out.println("Yeni Toplam:" + (sayi1+sayi2));
    }
    
    void toplama(){
        System.out.println("Toplama işlemi yapıldı.");
    }
    
    public static void main(String[] args) {
        Constructor toplamaİslemi = new Constructor();
        toplamaİslemi.toplama();
        
        Constructor toplamaİslemi2 = new Constructor(20,30);
        toplamaİslemi2.toplama();
        // TODO code application logic here
    }
    
}
