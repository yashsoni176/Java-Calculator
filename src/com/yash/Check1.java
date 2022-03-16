package com.yash;

public class Check1
{
    public static void main(String[] args)
    {
        try{
            int x=10; int y=0;
            int z=x/y;
            System.out.println(z);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        try{
            String name= "Hello";
            System.out.println(name.length());
        }
        catch (ArithmeticException e)
        {
            System.out.println("Divisible by zero");
        }
        catch (NullPointerException e)
        {
            System.out.println("Null pointer exception");
        }
        catch (Exception e)
        {
            System.out.println("Exception Arrised"+ e);
        }
        finally
        {
            System.out.println("Hello no worries");
        }
    }
}