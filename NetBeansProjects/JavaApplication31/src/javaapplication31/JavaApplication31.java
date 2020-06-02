/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class JavaApplication31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   int n,s,e,i;
        Scanner str=new Scanner(System.in);
     System.out.println("Enter number:");
      n=str.nextInt();
       System.out.println("Enter  staring number:");
      s=str.nextInt();
       System.out.println("Enter ending number:");
      e=str.nextInt();
    for( i=s
            ; i<=e ; i++)
    {
        System.out.println(n+ "*" + i+ "=" +n*i);
    }
    
    
    }
    
}
