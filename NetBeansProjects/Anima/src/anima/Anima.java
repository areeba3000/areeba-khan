/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anima;

/**
 *
 * @author hp
 */
public class Anima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Animal a = new Animal();
     a.name ("COW");
     a.speed (20);
     a.weight (40);
     a.print_state();
    
      Animal b = new Animal();
     b.name ("CAT");
     b.speed (300);
     b.weight (20);
     b.print_state();
     
      Animal c = new Animal();
     c.name ("DOG");
     c.speed (120);
     c.weight (40);
     c.print_state();
    }    
}
