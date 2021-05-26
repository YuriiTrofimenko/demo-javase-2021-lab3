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
        
        double a = Double.valueOf(args[0]);
        double b = Double.valueOf(args[1]);
        double x = Double.MIN_VALUE;
        while (x <= Double.MAX_VALUE) {
            if ( (a * x + b < 0.001)) {
                System.out.printf("x = %.3f", x);
                System.exit(0);
            }
            x += 0.001;
        }
        System.out.println("x not found");
        // x = - b / a
    }
    /*(a * x < Double.MAX_VALUE) && (a * x > Double.MIN_VALUE) && (a * x + b < Double.MAX_VALUE)&& (a * x + b > Double.MIN_VALUE) &&*/
}