/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javalab01_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Gray
 */
public class MatrixAdd {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("""
                           Welcome to MatrixAdd, this program will take input of 2 matrixes and perform the matrix adding calculation of them
        
                           """);

        System.out.println("Please input the number of rows of your 2 matrices: ");
        int row_num = Integer.parseInt(in.readLine());

        System.out.println("Please input the number of collumns of your 2 matrices: ");
        int col_num = Integer.parseInt(in.readLine());

        int[][] mat_1 = new int[row_num][col_num];

        int[][] mat_2 = new int[row_num][col_num];

        System.out.println("Enter matrix number 1");
        for (int i = 0; i < row_num; ++i) {
            String[] tmp = in.readLine().split("\s+");
            for (int j = 0; j < col_num; ++j) {
                mat_1[i][j] = Integer.parseInt(tmp[j]);
            }
        }

        System.out.println("Enter matrix number 2");
        for (int i = 0; i < row_num; ++i) {
            String[] tmp = in.readLine().split("\s+");
            for (int j = 0; j < col_num; ++j) {
                mat_2[i][j] = Integer.parseInt(tmp[j]);
            }
        }

        System.out.println("The sum of the two matrices is: ");
        for (int i = 0; i < row_num; ++i) {
            for (int j = 0; j < col_num; ++j) {
                System.out.print((mat_2[i][j] + mat_1[i][j]) + " ");
            }
            System.out.println();
        }

    }

}
