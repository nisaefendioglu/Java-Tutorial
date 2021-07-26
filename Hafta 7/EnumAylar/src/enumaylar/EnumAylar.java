/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumaylar;

/**
 *
 * @author nisa.efendioglu
 */
enum aylar{
    OCAK, ŞUBAT, MART
}
public class EnumAylar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ay = aylar.ŞUBAT.ordinal();
        switch(ay){
            case 0:
                System.out.println("OCAK");
                break;
            case 1:
                System.out.println("ŞUBAT");
                break;
            case 2:
                System.out.println("MART");
                break;
            default:
                System.out.println("Bu aylardan değildir.");
                break;
        }
        // TODO code application logic here
    }
    
}
