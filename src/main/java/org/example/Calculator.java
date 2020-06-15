package org.example;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    public double numbers[] = new double[10];
    public char operations[] = new char[10];
    public double result = 0;

    public double addition(double x, double y){
        return x+y;
    }

    public double subtraction(double x, double y){
        return x-y;
    }

    public double multiplication(double x, double y){
        return  x*y;
    }

    public double division(double x, double y){
        return x/y;
    }

    public double askForNumber(){
        for(int i = 0; i < operations.length; i++){
            if(operations[i] != '='){
                if(i == 0){
                    if(operations[i] == '+')
                        result = addition(numbers[i], numbers[i+1]);
                    else if (operations[i] == '-')
                        result = subtraction(numbers[i], numbers[i+1]);
                    else if (operations[i] == '*')
                        result = multiplication(numbers[i], numbers[i+1]);
                    else if (operations[i] == '/')
                        result = division(numbers[i], numbers[i+1]);
                }
                else if(i > 0){
                    if (operations[i] == '+')
                        result = addition(result, numbers[i+1]);
                    else if (operations[i] == '-')
                        result = subtraction(result, numbers[i+1]);
                    else if (operations[i] == '*')
                        result = multiplication(result, numbers[i+1]);
                    else if (operations[i] == '/')
                        result = division(result, numbers[i+1]);
                }
            }else
                return result;
        }
        return result;
    }
}
