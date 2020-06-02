/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tem_console;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class TEM_CONSOLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    float temperature;
Scanner in = new Scanner(System. in);
System. out. println("Enter temperature in Fahrenheit");
temperature = in. nextInt();
temperature = ((temperature - 32)*5)/9;
System.out.println("temperature in Celsius = " + temperature+"\n");
   

System. out. println("Enter temperature in Celsius");
temperature = in. nextInt();
temperature = ((temperature + 32)*5)/9;
System.out.println("temperature in Fahrenheit = " + temperature+"n");
   
     
    }
    
}
