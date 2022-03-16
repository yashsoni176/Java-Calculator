package com.yash;

public class Poly {

    public int AddNumbers(int x, int y, int z){
        return x+y+z;
    }

    public int AddNumbers(int x, int y){
        return x+y;
    }

    public static void main(String[] args) {
        Poly obj = new Poly();

        int res1 = obj.AddNumbers(2,4,5);
        int res2 = obj.AddNumbers(2,5);

        System.out.println("Addition Of 3 numbers : " + res1);
        System.out.println("Addition Of 2 numbers : " + res2);

    }
}
