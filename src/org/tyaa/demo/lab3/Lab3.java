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
        do {
            System.out.print("z = " + z);
            if (z % 2 == 0) {
                System.out.println(" jest liczbą parzystą");
            } else {
                System.out.println(" jest liczbą nieparzystą");
            }
            // z++;
        } while (++z <= 12);
    }
}