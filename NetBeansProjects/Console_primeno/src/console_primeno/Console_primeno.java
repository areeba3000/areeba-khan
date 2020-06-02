/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package console_primeno;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Console_primeno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner a=new Scanner(System.in);
       int i ,num=0,q=0;
       System.out.println("Enter number:");
       num= a.nextInt();
       for(i=1 ; i<=num ; i++)
           if(num%i==0)
       {
          q++; 
       }
       if(q==2)
       {
        System.out.println("PRIME NUMBER");
       }
       else
       {
           System.out.println("NOT PRIME NUMBER");
       }
       
    }
    
}
