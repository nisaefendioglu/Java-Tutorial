/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcasetekciftsayi;

/**
 *
 * @author Lenovo
 */
public class SwitchCaseTekCiftSayi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // SORU 3
        // Switch case mantığı ile 1 ila 10 arasında girilmiş olan 
        //bir sayının çift ve tek olma durumuna bakınız.

        int sayi = 5;
        switch (sayi){
            case 1: case 3: case 5: case 7: case 9:
                System.out.println(sayi + " Sayısı tek sayıdır.");
                break;
            
            case 0: case 2: case 4: case 6: case 8: case 10:
                System.out.println(sayi + " Sayısı çift sayıdır.");
                break;
                
            default :
                System.out.println("Girilen sayı geçersizdir.");
        }
        // TODO code application logic here
    }
    
}
