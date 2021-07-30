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
public class SatisElemani implements Calisan {
double ucretSabiti;
double prim;
double primOrani = 80.5;
    @Override
    public double ucret() {
        return (ucretSabiti*saatlikOran) + prim;
   }

    @Override
    public void calisanBolumu() {
        System.out.println("Satış Elemanı");
       }

    @Override
    public void ucretBelirleme(double ucretSabiti) {
        this.ucretSabiti = ucretSabiti;
    }
    
    public void satisPrimiBelirleme(int adet){
        prim = adet*primOrani;
    }
    
            
            
}
