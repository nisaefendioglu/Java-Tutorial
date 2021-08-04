/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author nisa.efendioglu
 */
public class Dog extends Animal {
    Dog(String ad){
        super.setAd("Köpek");
        super.setSes("Hav Hav");
        super.setTur("Golden");
    }

    Dog(String karabaş, String kangal) {
       }
    
    public String hayvanBilgisi(){
        return super.getHayvanBilgisi();
    }
}
