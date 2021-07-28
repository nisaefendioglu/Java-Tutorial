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
public class Dikdortgen extends GeometrikSekil {
    
    private double kisaKenar;
    private double uzunKenar;
    
    public void ozellikler(double kisaKenar, double uzunKenar){
        isimEkle("Dikdörtgen");
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }
    
    
    @Override
    public double alanHesap() {
        return uzunKenar*kisaKenar;
  }
    
}
