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
public class Ucgen extends GeometrikSekil{

    private double yukseklik;
    private double taban;
   
    public void ozellikler(double yukseklik, double taban){
        isimEkle("Üçgen");
        this.yukseklik = yukseklik;
        this.taban = taban;
    }
    
    @Override
    public double alanHesap() {
        return (taban*yukseklik)/2;
      }
    
}
