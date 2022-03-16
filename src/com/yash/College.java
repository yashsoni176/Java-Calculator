package com.yash;

abstract class College {
    abstract void setAcademicFee();
}

class CSE_dept extends College{
    void setAcademicFee(){
        System.out.println("100000");
    }
}

class Mech_dept extends College{
    void setAcademicFee(){
        System.out.println("75000");
    }
}

class CollegeOffice{

    public static void main(String[] args) {
        College ob_cse = new CSE_dept();
        College ob_mse = new Mech_dept();

        System.out.print("CSE department fee structure : ");
        ob_cse.setAcademicFee();
        System.out.print("ME department fee structure : ");
        ob_mse.setAcademicFee();
    }
}