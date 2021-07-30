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
public interface Calisan {

    double saatlikOran = 15.8;
    double ucret();
    void calisanBolumu();
    void ucretBelirleme(double ucretSabiti);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //işci
        İsci isci = new İsci();
        isci.calisanBolumu();
        isci.ucretBelirleme(5000.95);
        System.out.println("Maaşı:" + isci.ucret());
        
        //müdür
        Mudur mudur = new Mudur();
        mudur.calisanBolumu();
        mudur.ucretBelirleme(2500.8);
        System.out.println("Maaşı:" + mudur.ucret());
        
        //satış elemanı
        SatisElemani satisElemani = new SatisElemani();
        satisElemani.calisanBolumu();
        satisElemani.ucretBelirleme(1000.18);
        satisElemani.satisPrimiBelirleme(2500);
        System.out.println("Prim Ücreti:" + satisElemani.prim);
        System.out.println("Maaşı: " + satisElemani.ucret());
        // TODO code application logic here
    }
    
}
