/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javalab01_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Admin
 */
public class ReadInputFromKeyboard {
    
    public static void main(String[] args) throws IOException{
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("What is your name?");
        String name = keyboard.readLine();
        
        System.out.println("How old are you?");
        int age = Integer.parseInt(keyboard.readLine());
        
        System.out.println("How tall are you (m)?");
        double height = Double.parseDouble(keyboard.readLine());
        
        System.out.println("Mrs/Ms " + name + ", " 
                + age + " years old"+ 
                ", "+ "Your height is "+ height + ".");
    }
}
