/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcase;

/**
 *
 * @author Lenovo
 */
public class SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //SORU 1
       /*Switch Case kullanarak 1’ den 5 e kadar case oluşturun ve 
        tanımlanmış olan sayının kaç olduğunu ekrana yazdırın. */
       int sayi = 3;
       switch(sayi){
           case 1:
               System.out.println(1);
               break;
           
           case 2:
               System.out.println(2);
               break;
               
           case 3:
               System.out.println(3);
               break;
               
           case 4:
               System.out.println(4);
               break;
               
           case 5:
               System.out.println(5);
               break;
           
           default : 
               System.out.println("Sayı Bulunamadı");
       }
    }
    
}
