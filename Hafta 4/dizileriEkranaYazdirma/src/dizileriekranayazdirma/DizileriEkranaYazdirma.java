/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dizileriekranayazdirma;

import java.util.Arrays;

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
         
        //örnek
        
        int [][] dizi = {{2,3},{4,5},{6,7}};
        for(int i=0; i<3; i++){
            System.out.print(" ");
            for(int j=0; j<2; j++)
            System.out.print(dizi[i][j]);
        }
        
        //örnek
        //String türünde çok boyutlu bir dizi oluşturun (3x3 matraisli) ve tüm elemanları çıktı olarak veriniz. Abc def ghı şeklinde ilerlesin.

        String [][] metin = {{"a","b","c"},{"d","e","f"},{"g","h","ı"}};
        for(int i=0; i<3; i++){
            System.out.println();
            for(int j=0; j<3; j++){
                System.out.print(metin[i][j]+ " ");
            }
            //dizinin e elemanını çıktı olarak veriniz.
            System.out.println(metin[1][1]);
        }
        
        //toString ile yazdırma
        int [] sayi = {1,5,8,9};
        System.out.println(Arrays.toString(sayi));
    }
    
}
