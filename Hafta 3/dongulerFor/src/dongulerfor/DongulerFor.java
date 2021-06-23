/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dongulerfor;

/**
 *
 * @author Lenovo
 */
public class DongulerFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //For döngüsü kullanarak ekrana 5 adet Merhaba Java programını yazdırınız.
        for(int i=0; i<5; i++){

        System.out.println("Merhaba Java");

        }
        
        //1’den 100’e kadar olan sayıları ekrana yazdıran programı yazınız.
        for(int i=1; i<=100; i++) {

         System.out.print(i+" "); 

        }
        
        
        //1’den 100’e kadar olan tüm tek sayıları ekrana yazdıran programı yazınız.
        
        for(int i=1; i<=100; i += 2) {

        System.out.print(i+" "); 

        }
        
        //1’den 20’ye kadar olan sayıların faktöriyel hesabını yaparak ekrana yazdırınız.

        int faktoriyel = 1;
        for (int n = 1; n <= 20; n++) {
        if (n == 6)
        break;
        faktoriyel = faktoriyel * n;
        System.out.println(n + "! = " + faktoriyel); 
        
    }
        
        //A’ dan Z’ye kadar olan harfleri ekrana yazdırınız.

        
         char karakter;
         for(karakter= 'A'; karakter <= 'Z'; ++karakter)
         System.out.print(karakter + " ");
        
        
         //Metinsel bir veri türü oluşturun ve bu metnin içerisine 
         //‘Merhaba Java Dersi’ ifadesini ekleyiniz. Bu metinin içerisinde kaç tane a harfi olduğunu bulan programı yazınız.
         
        String metin = "Merhaba dünya bu java örnekleri";
        char karakterler = 'a';
        int tane = 0;
 
        for(int i = 0; i < metin.length(); i++) {
            if(karakterler == metin.charAt(i)) {
                ++tane;
            }
        }
 
        System.out.println( karakterler + " yazı içinde  " + tane +" tanedir");
    }
   
    
    //5’e kadar olan rakamları tek tek ekrana basan programı for ve switch case metodu kullanarak yazınız.
    
        for (int i=0; i<=5; i++)
        {
            switch(i)
            {
                case 0: 
                System.out.println("0");
                break;
                
                case 1: 
                System.out.println("1");
                break;
                
                case 2:
                System.out.println("2");
                break;
                
                case 3: 
                System.out.println("3");
                break;
                
                case 4: 
                System.out.println("4");
                break;
                
                case 5: 
                System.out.println("5");
                break;
            }
        }
    
    //FOR ile sonsuz döngü
     for(;;){
            System.out.println("mehmet");
        }
        // TODO code application logic here
     
     
    }
    
