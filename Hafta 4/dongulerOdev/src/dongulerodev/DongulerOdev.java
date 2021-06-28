/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dongulerodev;

/**
 *
 * @author Lenovo
 */
public class DongulerOdev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ters yıldız çıktısı
        for(int i=1; i<=4; i++){
            System.out.println(" ");
            for(int j=4; j>=i; j--){
                System.out.print("*");
            }
        
        //Çarpım tablosu
        for (int i=1; i<=10; i++){
            System.out.println();
            for (int j=1; j<=10; j++){
                System.out.println(j + "*" + i + "=" + (j*i));
            }
        // TODO code application logic here
    }
    
}
