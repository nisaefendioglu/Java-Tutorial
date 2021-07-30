/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arac;

/**
 *
 * @author nisa.efendioglu
 */
public class Arac {

    public String getMusteri() {
        System.out.println("Müşteri İşlemleri");
        camlarAcilabilir();        
        System.out.print("Müşteri Adı: ");
        return musteri;
    }

    public void setMusteri(String musteri) {
        this.musteri = musteri;
    }

    public String getSahip() {
        System.out.println("Sahip İşlemleri");
        aracKullanimi();
        camlarAcilabilir();
        System.out.print("Sahip Adı: ");
        return sahip;
    }

    /**
     * @param args the command line arguments
     */
    public void setSahip(String sahip) {
        this.sahip = sahip;
    }

    private String musteri;
    private String sahip;
    
    Arac(){
        System.out.println("Araç ile yolculuğa çıkıldı.");
    }
    private static void aracKullanimi(){
        System.out.println("Arac sahibi arabayı kullandı.");
        
    }
    private static void camlarAcilabilir(){
        System.out.println("Camlar açıldı.");
    }
    
   
    public static void main(String[] args) {
        Arac aracKullanimi = new Arac();
        aracKullanimi.setSahip("Nisa");
        System.out.println(aracKullanimi.getSahip());
        
        aracKullanimi.setMusteri("Mehmet");
        System.out.println(aracKullanimi.getMusteri());
        // TODO code application logic here
    }

    
}
