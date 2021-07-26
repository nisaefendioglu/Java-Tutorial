/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordinalmetodu;

/**
 *
 * @author nisa.efendioglu
 */
enum araba{
    AUDİ, MERCEDES
}
public class OrdinalMetodu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(araba.AUDİ.ordinal());
        System.out.println(araba.MERCEDES.ordinal());
        // TODO code application logic here
    }
    
}
