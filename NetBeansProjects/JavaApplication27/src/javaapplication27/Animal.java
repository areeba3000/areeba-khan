/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

/**
 *
 * @author hp
 */
public class Animal {
    String name;
    int weight,speed;
    void name(String n)
    {
        name = n;
    }
    void speed(int s)
    {
        speed=s;
    }
    void weight (int w)
    {
        weight=w;
    }
    void print_state()
    {
        System.out. println("Animal name"+name);
        System.out.println("speed"+speed);
        System.out.println("weight"+weight);
    }
       
    }
    
    
}
