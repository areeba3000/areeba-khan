/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

/**
 *
 * @author hp
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   // Soapbox 
  Box Soapbox=new Box();
  Soapbox.length=10;
  Soapbox.breadth=10;
  Soapbox.height=10;
  int volume= Soapbox.length*Soapbox.breadth*Soapbox.height;
  System.out.println("volume of Soapbox "+volume);
          
  //pencil box
  
  
  Box pencilbox=new Box();
  pencilbox.length=10;
  pencilbox.breadth=12;
  pencilbox.height=15;
  int vol= pencilbox.length * pencilbox.breadth * pencilbox.height;
  System.out.println("volume of pencilbox "+vol);
          
  
    }
    
}
