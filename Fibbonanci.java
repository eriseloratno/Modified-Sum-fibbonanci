/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibbonanci;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Fibbonanci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Masukkan Angka : ");
        int number = new Scanner(System.in).nextInt();
        System.out.println((fibonacciLoop(number)));
    }

    public static int fibonacciLoop(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }

        int fibo1 = 1, fibo2 = 1, fibonacci = 1, sum=2;
        for (int i = 3; i <= number; i++) {
            fibonacci = fibo1 + fibo2; // Fibonacci number is sum of previous two Fibonacci number
            fibo1 = fibo2;
            fibo2 = fibonacci; 
            sum = sum + fibonacci;
        }
        System.out.println("Sum : " + sum);
        return fibonacci;
    
    }
}

//mantap gan
