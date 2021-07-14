/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package araba;

/**
 *
 * @author nisa.efendioglu
 */
public class Araba {

    /**
     * @param args the command line arguments
     */
    private String musteri;
    private String aracSahibi;
    
    
    public void setMusteri(String musteri){
        this.musteri = musteri;
    }
    
    public String getMusteri(){
        System.out.println("Müşteri İşlemleri:");
        cam();
        System.out.print("Müşteri Adı:");
        return musteri;
    }
    
    public void setAracSahibi(String aracSahibi){
        this.aracSahibi = aracSahibi;
    }
    
    public String getAracSahibi(){
        System.out.println("Araç Sahibi İşlemleri");
        aracKullanimi();
        cam();
        System.out.print("Araç Sahibi Adı:");
        return aracSahibi;
    }
    
    Araba(){
        System.out.println("Araç ile yolculuğa çıkıldı.");
    }
    
    private static void aracKullanimi(){
        System.out.println("Araç sahibi arabayı kullandı.");
    }
    
    private static void cam(){
        System.out.println("Camlar Açıldı.");
    }
    public static void main(String[] args) {
        Araba aracKullanimi = new Araba();
        aracKullanimi.setAracSahibi("Nisa");
        System.out.println(aracKullanimi.getAracSahibi());
        
        aracKullanimi.setMusteri("Mehmet");
        System.out.println(aracKullanimi.getMusteri());
        
        // TODO code application logic here
    }
    
}
