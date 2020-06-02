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
public class Animal {
    String name;
    int speed; 
    int weight;
    void name(String n)
    { 
        name= n;
    }
     void speed(int s)
    { 
        speed= s;
    }
    
      void weight(int w)
    { 
        weight= w;
    }
    void print_state()
    {
        System.out.println("ANIMAL NAME: "+ name);
        System.out.println(" SPEED: "+ speed );
        System.out.println(" WEIGHT: "+ weight);
    }
}
