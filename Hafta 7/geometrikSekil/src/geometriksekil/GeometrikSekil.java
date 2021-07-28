/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometriksekil;

/**
 *
 * @author nisa.efendioglu
 */
public abstract class GeometrikSekil {
    private String isim;
    
    public void isimEkle(String isim){
        this.isim = isim; 
    }

    public String isimGoster(){
        return this.isim;
    }
   
    public abstract double alanHesap();
    
    public static void main(String[] args) {
        Dikdortgen dikdortgen = new Dikdortgen();
        Ucgen ucgen = new Ucgen();
        
        dikdortgen.ozellikler(15, 50);
        System.out.println(dikdortgen.isimGoster() + " : " + dikdortgen.alanHesap());
        
        ucgen.ozellikler(70, 10);
        System.out.println(ucgen.isimGoster()+ " : " + ucgen.alanHesap());
        
        // TODO code application logic here
    }
    
}
