/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telefon1;

/**
 *
 * @author nisa.efendioglu
 */
 class Telefon1 {

    /**
     * @param args the command line arguments
     */
    public Telefon1(){
        System.out.println("Telefon yapıcı metodu - constructor");
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

class AkilliTelefon extends Telefon1 {
    public AkilliTelefon(){
        System.out.println("Akilli Telefon Counstructor");
    }
   
}

class CepTelefonu extends Telefon1 {
    public CepTelefonu(){
        System.out.println("Cep Telefonu Constructor");
    }
}

class iphone extends CepTelefonu{
    public iphone(){
         System.out.println("İphone Constructor - Yapıcı Metod");
    }

public static void main (String [] args){
    iphone telefon = new iphone();
}
}


