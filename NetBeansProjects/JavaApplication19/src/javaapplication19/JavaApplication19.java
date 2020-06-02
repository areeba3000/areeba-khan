/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

/**
 *
 * @author hp
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      animal a=new animal();// constractor
      
      a.name("cow");// a is reference variable
      a.speed(20);
      a.weight(25);
      a.print_state();
     
      animal b=new animal();
     
      b.name("cat");
      b.speed(10);
      b.weight(20);
      
      b.print_state();
      
    }
    
}
