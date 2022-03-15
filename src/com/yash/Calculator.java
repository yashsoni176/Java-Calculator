package com.yash;

import java.util.Scanner;

public class Calculator extends ParentCalculator {

    public static void main(String[] args) {

        Calculator obj = new Calculator();
        Scanner input = new Scanner(System.in);
        int a, b, c, d, e, f;

        System.out.print("Enter a : ");
        a = input.nextInt();
        System.out.print("Enter b : ");
        b = input.nextInt();

        c = obj.AddOperation(a,b);
        d = obj.SubOperation(a,b);
        e = obj.MultiOperation(a,b);
        f = obj.DivOperation(a,b);

        System.out.println("Addition : " + c);
        System.out.println("Subtraction : " + d);
        System.out.println("Multiplication : " + e);
        System.out.println("Division : " + f);;


    }


}