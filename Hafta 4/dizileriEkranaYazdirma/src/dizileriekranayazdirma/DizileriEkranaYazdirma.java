/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dizileriekranayazdirma;

/**
 *
 * @author Lenovo
 */
public class DizileriEkranaYazdirma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //String çok boyutlu dizi tanımlamaları
        String [][] metin = {{"Nisa","Mehmet"}, {"Ali", "Ayşe"}, {"Programlama", "Java"}};
        String[][] a = new String[10][5]; 
        a[0][0] = "Nisa";
        a[0][1] = "Ahmet";
        // TODO code application logic here
        //1 satırın 1 indeksli elemanını ekrana yazdırınız.
         int dizi[][] = {{1,33}, {5,88}};
         System.out.println(dizi[1][1]);
    }
    
}
