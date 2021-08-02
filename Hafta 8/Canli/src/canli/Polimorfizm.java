/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canli;

/**
 *
 * @author nisa.efendioglu
 */
 class Canli {
    public void metod(){
        System.out.println("Canlı Sınıfı");
    }
}

class Insan extends Canli{
    @Override
    public void metod(){
      System.out.println("İnsan Sınıfı");  
    }

 }   

class Hayvan extends Canli{
    @Override
    public void metod(){
        System.out.println("Hayvan Sınıfı");
    }
}

class Bitki extends Canli{
    @Override
    public void metod(){
        System.out.println("Bitki Sınıfı");
    }
}

public class Polimorfizm {
 public static void nesneAl(Canli canlilar){
     if(canlilar instanceof Canli){
         Canli canli = canlilar;
         canli.metod();   
}
     else if (canlilar instanceof Insan){
         Insan insan = (Insan) canlilar;
         insan.metod();
     }
     
     else if(canlilar instanceof Hayvan){
         Hayvan hayvan = (Hayvan) canlilar;
         hayvan.metod();
     }
     
     else if(canlilar instanceof Bitki){
         Bitki bitki = (Bitki) canlilar;
         bitki.metod();
     }
     
 }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Canli canli = new Canli();
        Insan insan = new Insan();
        Hayvan hayvan = new Hayvan();
        Bitki bitki = new Bitki();
  
        Polimorfizm.nesneAl(canli);
        Polimorfizm.nesneAl(insan);
        Polimorfizm.nesneAl(hayvan);
        Polimorfizm.nesneAl(bitki);
        // TODO code application logic here
    }
    
}
