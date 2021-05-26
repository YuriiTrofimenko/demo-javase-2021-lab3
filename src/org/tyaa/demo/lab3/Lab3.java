/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.demo.lab3;

import java.util.Scanner;

/**
 *
 * @author yurii
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Input a natural number:");
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
            if (x >= 0) {
                if (x % 2 == 0) {
                    System.out.println(" jest liczbą parzystą");
                } else {
                    System.out.println(" jest liczbą nieparzystą");
                }
            } else {
                System.out.println("x must be equals or greather than 0");
            }
        } catch (Exception ex) {
            System.out.println("Wrong number format");
        }
    }
}