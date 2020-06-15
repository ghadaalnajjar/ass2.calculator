package org.example;

import java.util.Scanner;

public class App {

    public static void main( String[] args ) {
        // note: I have not used arithmetic priorities example : *,/,+,- , but result operation from left to right
        Scanner sr = new Scanner(System.in);
        Calculator ca = new Calculator();
        int c = 0, location = 0;
        char operation = ' ';
        boolean check = true;
        while (check){
            for(int i = 0; i < 2; i++) {
                if (c % 2 == 0) {
                    ca.numbers[location] = sr.nextDouble();
                } else {
                    operation = sr.next().charAt(0);
                    ca.operations[location] = operation;
                }
                if (operation == '=')
                    check = false;
                c++;
            }
            location ++;
        }

        System.out.println("Result = " + ca.askForNumber());
    }
}
