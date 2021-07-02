/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metotlar;

/**
 *
 * @author Lenovo
 */
public class Metotlar {

    /**
     * @param args the command line arguments
     */
    //Bir proje geliştirdiğinizi ve bu projenin bir muhasebe projesi olduğunu varsayalım. Bu projede bir çok kez toplama, çıkarma, çarpma ve bölme işlemleri yapılacaktır. Bu ve buna benzer durumlarda her toplama işlemi yapmamız gerektiğinde tek tek o işlemi yazmaktansa bu işlemleri yapan metotlar hazırladığımız takdirde işimiz oldukça kolaylaşacaktır. Metotlar kullanarak 4 işlemi gerçekleştiriniz.

    public static int sayi1=100, sayi2=80;
    
    public static void tumİslemler(){
        toplama();
        cikarma();
        bolme();
        carpma();
    }
    
    public static void toplama(){
        System.out.println("Toplama işlemi sonucunuz:" + (sayi1+sayi2));
    }
    public static void cikarma(){
        System.out.println("Çıkarma:" + (sayi1-sayi2));
    }
    public static void bolme(){
        System.out.println("Bolme:"+ (sayi1/sayi2));
    }
    public static void carpma(){
        System.out.println("Carpma:" + (sayi1*sayi2));
    }
    public static void main(String[] args) {
     tumİslemler();


    }
    
}
