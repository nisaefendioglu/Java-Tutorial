/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arayuz1;

/**
 *
 * @author nisa.efendioglu
 */
public interface Arayuz1 {
    public void metod1();
    interface Arayuz2 {
    public void metod2();
    }

    /**
     * @param args the command line arguments
     */
    
    class Sinif1 implements Arayuz1{

        @Override
        public void metod1() {
            System.out.println("Arayüz 1 - Metod 1");
            }
        
    }
    
    class Sinif2 implements Arayuz1.Arayuz2{

        @Override
        public void metod2() {
            System.out.println("Arayüz 2 - Metod 2");
          }
        
    }
    public static void main(String[] args) {
        Sinif1 s1 = new Sinif1();
        s1.metod1();
        
        Sinif2 s2 = new Sinif2();
        s2.metod2();
        // TODO code application logic here
    }
    
}
