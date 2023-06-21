/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.javalab01_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author Gray
 */
public class JavaLab01_5 {

    public static void main(String[] args) throws IOException {

        double result = 0;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("""
                         Welcome to basic array utils, please choose an option: 
                         1/ Enter your own array
                         2/ Demo with a test array
                         """);

        String opt = in.readLine();

        switch (opt) {
            case "1" -> {
                System.out.println("Please enter the number of elements in your array: ");
                int n = Integer.parseInt(in.readLine());

                System.out.println("Enter the list of numbers in your array here: ");

                double[] arr = Arrays.stream(in.readLine().split("\s+")).mapToDouble(Double::parseDouble).toArray();

                System.out.println("Original array: ");
                for (double x : arr) {
                    System.out.print(x + " ");
                }

                Arrays.sort(arr);
                System.out.println("\nSorted array: ");
                for (double x : arr) {
                    System.out.print(x + " ");
                }

                for (int i = 0; i < n; ++i) {
                    result += arr[i];
                }

                System.out.println("\nSum of the array: " + result + "\nAverage value of the array: " + String.format("%.4f", result / n));
            }
            default -> {
                double[] test = {1943, 2000, 2201, 2077, 2022};

                for (double x : test) {
                    result += x;
                }

                System.out.println("Original array: ");
                for (double x : test) {
                    System.out.print(x + " ");
                }

                System.out.println("\nSorted array: ");
                for (double x : test) {
                    System.out.print(x + " ");
                }

                System.out.println("\nSum of the array: " + result + "\nAverage value of the array: " + String.format("%.4f", result / 5));
            }

        }
    }
}
