/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsinifiornek;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class MathSinifiOrnek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner girdi = new Scanner (System.in);
        System.out.println("Negatif sayı giriniz:");
        int nSayi = girdi.nextInt();
        System.out.println("Bi.r sayı giriniz:");
        int sayi = girdi.nextInt();
        
        System.out.println("Hangi İşlemi Yaptırmak İstersiniz: 1. Minimum Sayı , 2. Pow , 3. Abs");
        int secim = girdi.nextInt();
        
        if(secim==1){
            System.out.println("Minimum Sayı:" + Math.min(sayi, nSayi));
        }
        
        else if (secim==2){
            System.out.println("Pow:" + Math.pow(sayi, nSayi));
        }
        
        else if (secim==3){
            System.out.println("Abs:" + Math.abs(nSayi));
        }
        else {
            System.out.println("Hatalı Giriş.");
        }
        // TODO code application logic here
    }
    
}
