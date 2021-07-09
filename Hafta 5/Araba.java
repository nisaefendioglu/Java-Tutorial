/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package araba;

/**
 *
 * @author Lenovo
 */
public class Araba {

    /**
     * @param args the command line arguments
     */
    public double mevcutKm = 1589; 
    
    //constructor tanımlaması
    Araba(){
        System.out.println("Aracın mevcut kmsi:" + mevcutKm);
    }
    
    Araba(double yeniKmDegeri){
        mevcutKm = yeniKmDegeri; 
        System.out.println("Aracın yeni kmsi:" + mevcutKm);
    }
    
    void calistir(){
        System.out.println("Araba Çalıştı.");
    }
  
    public static void main(String[] args) {
        Araba mevcutKm = new Araba();
        mevcutKm.calistir();
        
        Araba yeniKmDegeri = new Araba(1800);
        yeniKmDegeri.calistir();
        // TODO code application logic here
    }
    
}
