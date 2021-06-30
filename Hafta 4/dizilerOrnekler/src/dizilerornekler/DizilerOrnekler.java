/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dizilerornekler;

import java.util.Arrays;

/**
 *
 * @author Lenovo
 */
public class DizilerOrnekler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //dizilerde sıralama işlemleri
         int [] siralama = {1,8,5,2};
        Arrays.sort(siralama); //dizi sıralandı.
        for(int j=0; j<siralama.length; j++){
            System.out.println(siralama[j]);
    }
    
        String strDizi[] = {"Edirne"," Afyon", "Adapazarı", "Beşiktaş"};
        System.out.println("String Dizi: " + Arrays.toString(strDizi));
        Arrays.sort(strDizi);
        System.out.println("Sıralı Dizi:"  + Arrays.toString(strDizi));
   }
    }
    