/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calisan;

/**
 *
 * @author nisa.efendioglu
 */
public class Mudur implements Calisan {
double ucretSabiti;
    @Override
    public double ucret() {
        return ucretSabiti;
    }

    @Override
    public void calisanBolumu() {
        System.out.println("Ürün Müdürü");
   }

    @Override
    public void ucretBelirleme(double ucretSabiti) {
        this.ucretSabiti = ucretSabiti;
     }
    
}
