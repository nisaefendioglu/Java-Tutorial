/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soyutsinif;

/**
 *
 * @author nisa.efendioglu
 */
abstract class SoyutSinif {

    abstract public void abstractMetod(); //soyut metod tanımlaması
    
    public SoyutSinif(){ //constructor
        System.out.println("Soyut Sınıf Yapıcısı");
    }
    
    public void metod(){ //normal metod tanımlaması
        System.out.println("Normal Metod");
    }
    
    public static void staticMetod()
    {
        System.out.println("Static Metod");
    }
}
    
    class AltSinif extends SoyutSinif{
        
        @Override
        public void abstractMetod() {
             System.out.println("Alt sınıf ");
         }
        
    }
    
    class AltSinif2 extends SoyutSinif{

        @Override
        public void abstractMetod() {
            System.out.println("Alt sınıf2");
            }
        
    }
    
    public class Baslat{
    public static void main(String[] args) {
        AltSinif a1 = new AltSinif();
        AltSinif2 a2 = new AltSinif2();
        
        a1.abstractMetod();
        a2.abstractMetod();
        
        SoyutSinif soyutSinif[] = new SoyutSinif[1];
        soyutSinif[0] = a1;
        soyutSinif[0].metod();
        SoyutSinif.staticMetod();
        // TODO code application logic here
    }
   
}
