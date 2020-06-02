/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

/**
 *
 * @author hp
 */
public class JavaApplication25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
         BOX pencilbox=new BOX();
  pencilbox.length=10;
  pencilbox.breadth=12;
  pencilbox.height=15;
  int vol= pencilbox.length * pencilbox.breadth * pencilbox.height;
  System.out.println("volume of pencilbox "+vol);
          
  
        // TODO code application logic here
    }
    
}
