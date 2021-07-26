/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telefon;

/**
 *
 * @author nisa.efendioglu
 */
class Telefon {

    /**
     * @param args the command line arguments
     */
    public Telefon(){
        System.out.println("Telefon yapıcı metodu - constructor");
    }
}

class AkilliTelefon extends Telefon {
    public AkilliTelefon(){
        System.out.println("Akilli Telefon Counstructor");
    }
   
}

class CepTelefonu extends Telefon {
    public CepTelefonu(){
        System.out.println("Cep Telefonu Constructor");
    }
}

class iphone extends CepTelefonu{
    public iphone(){
         System.out.println("İphone Constructor - Yapıcı Metod");
    }
}
 public static void main(String[] args) {
        // TODO code application logic here
        iphone telefon = new iphone();
        
} 

