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
        int maxCount = 100;
        int k = -50;
        int l = 50;
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i <= maxCount; i++) {
            int x = (int) (k + (l + 1 - k) * Math.random());
            // System.out.print("x = " + x + " ");
            if (x % 2 == 0) {
                // System.out.println(" jest liczbą parzystą");
                evenSum += x;
            } else {
                // System.out.println(" jest liczbą nieparzystą");
                oddSum += x;
            }
        }
        System.out.println("even sum = " + evenSum);
        System.out.println("odd sum = " + oddSum);
    }
}