/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

/**
 *
 * @author nisa.efendioglu
 */
public class Program {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
        System.out.println("Nisa");
        int sonuc=0;
        String kelime = "sdas45";
        for(int i=0;i<=kelime.length();i++)
        if(Character.isDigit(kelime.charAt(i)))
        sonuc++;
        System.out.println(kelime);

        // TODO code application logic here
    }
    
}
