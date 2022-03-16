package com.yash;

public class Check {
    public static void main(String[] args) {
        try{
            String name = null;
            System.out.println(name.length());
        }
        catch (ArithmeticException e){
            System.out.println("Divide by zero not possible");
        }
        catch (NullPointerException e){
            System.out.println("Null value is not accepted");
        }
    }
}

