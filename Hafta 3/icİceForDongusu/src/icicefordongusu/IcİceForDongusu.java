/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icicefordongusu;

/**
 *
 * @author Lenovo
 */
public class IcİceForDongusu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //1'den 5 e kadar sutun da satırda 1-10 arası ve her satırda bir sonraki sayı kadar artan programı yazınız.
          
       for(int i=1; i<=5; i++){
           System.out.println();
           for(int j=1; j<=10; j++){
               System.out.print((i*j)+ " ");
           }
       }
        
         //iç içe for döngüsü yıdız örneği;
        for(int i=1; i<=5; i++){
            System.out.println();
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
        }
        // TODO code application logic here
    }
    
}
