/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

import java.util.Arrays;

/**
 *
 * @author Lenovo
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arama [] = {1,40,8,72,50,90};
        Arrays.sort(arama);
        int deger = Arrays.binarySearch(arama,2);
        System.out.println(deger);
    }
    
}
