package com.yash;

public interface RBI {
    void setInterestRate();
}

class SBI implements RBI{
    public void setInterestRate(){
        System.out.println("7% interest");
    }
}

class ICICI implements RBI{
    public void setInterestRate(){
        System.out.println("7.5% interest");
    }
}

class Person{
    public static void main(String[] args) {
        RBI ob_Sbi = new SBI();
        RBI ob_Icici = new ICICI();
        System.out.print("SBI Bank => ");
        ob_Sbi.setInterestRate();
        System.out.printf("ICICI Bank => ");
        ob_Icici.setInterestRate();
    }
}