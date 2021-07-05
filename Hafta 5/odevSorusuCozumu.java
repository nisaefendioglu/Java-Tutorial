/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogrram;

/**
 *
 * @author Lenovo
 */
public class JavaProgrram {

    /**
     * @param args the command line arguments
     */
    public static String cumle = "Merhaba Java Dünyası";
    public static void harf(){
        int uzunluk = cumle.length();
        for(int i=0; i<uzunluk; i++){
        if(cumle.charAt(i)==' '){
           uzunluk--;
        
        }
        }
        System.out.println("Harf sayısı:" + uzunluk);
    }
    
    public static void kelime(){
        int kelimeSayisi = 1;
        for(int i=0; i<cumle.length(); i++){
            if(cumle.charAt(i)==' '){
               kelimeSayisi++;
                
            }
        }
        System.out.println("Kelime Sayısı:" + kelimeSayisi);
    }
    
    public static void ters(){
        String tersSonuc = "";
        for(int i=cumle.length()-1; i>=0; i--){
            tersSonuc+=cumle.charAt(i);
        }
        
        System.out.println(tersSonuc);
    }
    
    public static void boslukSayisi(){
        char bosluk =' ';
        int boslukSayisi = 0;
        for(int i=0; i<cumle.length(); i++){
            if(bosluk==cumle.charAt(i)){
                boslukSayisi++;
            }
        }
        System.out.println(boslukSayisi);
    }
    public static void main(String[] args) {
        harf();
        kelime();
        ters();
        boslukSayisi();
        // TODO code application logic here
    }
    
}
