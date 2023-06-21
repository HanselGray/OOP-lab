/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.javalab01_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Admin
 */
public class JavaLab01_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Please enter an integer: ");
        
        int num = Integer.parseInt(in.readLine());
    
        for(int i=0;i<num;++i){
            System.out.println(" ".repeat(num-i)+"*".repeat(2*i+1));
    }
}

}