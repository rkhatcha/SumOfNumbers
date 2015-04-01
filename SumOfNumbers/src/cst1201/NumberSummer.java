package cst1201;

import java.util.Scanner;

public class NumberSummer {

    public static void main(String[] args) {
        /*
        Write a program that asks the user for a positive nonzero integer value. 
        The program should use a loop to get the sum of all the integers from 1 
        up to the number entered. For example, if the user enters 50, the loop 
        will find the sum of 1, 2, 3, 4, ... 50.
         */
        System.out.println("Please enter a positive non-zero integer: ");
        Scanner scan = new Scanner(System.in);
        int inputNumber = scan.nextInt();
        if(inputNumber > 0){
            int sum = 0;
            int numberToAdd = 1;
            
            while (numberToAdd <= inputNumber){
                sum += numberToAdd;
                System.out.println(numberToAdd + ", SUM= " + sum);
                numberToAdd++;
            }
        }
    }

}
