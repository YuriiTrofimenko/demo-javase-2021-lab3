/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.demo.lab3;

/**
 *
 * @author yurii
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int z = 1;
        int k = 50;
        int l = 100;
        do {
            // 50 + (51) * 0.75 = 88.25
            // 50 + (51) * 0 = 50
            // 50 + (51) * 1 = 101
            int x = (int) (k + (l + 1 - k) * Math.random());
            System.out.print("x = " + x);
            if (x % 2 == 0) {
                System.out.println(" jest liczbą parzystą");
            } else {
                System.out.println(" jest liczbą nieparzystą");
            }
            // z++;
        } while (++z <= 12);
        System.out.println("***");
        z = 1;
        k = 15;
        l = 35;
        do {
            // 50 + (51) * 0.75 = 88.25
            // 50 + (51) * 0 = 50
            // 50 + (51) * 1 = 101
            int x = (int) (k + (l + 1 - k) * Math.random());
            System.out.print("x = " + x);
            if (x % 2 == 0) {
                System.out.println(" jest liczbą parzystą");
            } else {
                System.out.println(" jest liczbą nieparzystą");
            }
            // z++;
        } while (++z <= 12);
        System.out.println("***");
        z = 1;
        k = 320;
        l = 580;
        do {
            // 50 + (51) * 0.75 = 88.25
            // 50 + (51) * 0 = 50
            // 50 + (51) * 1 = 101
            int x = (int) (k + (l + 1 - k) * Math.random());
            System.out.print("x = " + x);
            if (x % 2 == 0) {
                System.out.println(" jest liczbą parzystą");
            } else {
                System.out.println(" jest liczbą nieparzystą");
            }
            // z++;
        } while (++z <= 12);
    }
}