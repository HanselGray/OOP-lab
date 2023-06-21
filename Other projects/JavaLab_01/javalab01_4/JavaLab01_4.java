/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.javalab01_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Admin
 */
public class JavaLab01_4 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a month: ");

        String strMonth = in.readLine();
        
        int month = 0;

        switch (strMonth) {
            case "January", "Jan.", "Jan", "1" -> month = 1;
            case "February", "Feb.", "Feb", "2" -> month = 2;
            case "March", "Mar.", "Mar", "3" -> month = 3;
            case "April", "Apr.", "Apr", "4" -> month = 4;
            case "May", "5" -> month = 5;
            case "June", "Jun", "6" -> month = 6;
            case "July", "Jul", "7" -> month = 7;
            case "August", "Aug.", "Aug", "8" -> month = 8;
            case "September", "Sept.", "Sep", "9" -> month = 9;
            case "October", "Oct.", "Oct", "10" -> month = 10;
            case "November", "Nov.", "Nov", "11" -> month = 11;
            case "December", "Dec.", "Dec", "12" -> month = 12;
            default -> {
                System.out.println("Invalid month. Please enter a valid month.");
                return;
            }
        }

        System.out.println("Enter a year: (example 1999)");

        int year = Integer.parseInt(in.readLine());

        if (year < 0) {
            System.out.println("Invalid year, please enter again");
        }
        
        if(((year%4 == 0 && year%100!=0) || year%400==0) && month == 2){
            System.out.println("29");
            System.exit(0);
        }
        
        switch(month){
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(31);
            case 2 -> System.out.println(28);
            default -> System.out.println(30);
        }
    }
}
