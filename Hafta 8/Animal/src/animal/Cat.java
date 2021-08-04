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
public class Cat extends Animal {
    Cat(String ad){
        super.setAd("Kedi");
        super.setSes("Miyav");
        super.setTur("Felis");
    }
    
    public String hayvanBilgisi(){
        return super.getHayvanBilgisi();
    }
}
