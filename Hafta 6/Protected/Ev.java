/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ev;

/**
 *
 * @author Lenovo
 */
public class Ev {

    /**
     * @param args the command line arguments
     */
    protected void kasa(){
        System.out.println("Gizli Kasa");
    }
    
    protected String dokuman="Gizli belge";
    
    public static void main(String[] args) {
        Ev baba = new Ev();
        baba.kasa();
        System.out.println(baba.dokuman);
        // TODO code application logic here
    }
    
}
