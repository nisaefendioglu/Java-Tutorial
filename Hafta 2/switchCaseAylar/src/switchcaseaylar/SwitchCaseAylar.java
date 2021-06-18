/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcaseaylar;

/**
 *
 * @author Lenovo
 */
public class SwitchCaseAylar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // SORU 2
        /* Switch case kullanarak 12 ay için case metodları oluşturun. 
        Seçilmiş olan ay’ı ekrana yazdırın. */
        int ay = 5;
        switch(ay){
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Şubat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayıs");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Ağustos");
                break;
            case 9:
                System.out.println("Eylül");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasım");
                break;
            case 12:
                System.out.println("Aralık");
                break;
        }
    }
    
}
