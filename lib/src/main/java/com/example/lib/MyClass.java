package com.example.lib;

import java.util.Scanner;

public class MyClass {

    public static void main ( String[] args ) {
        int countN,Total=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number 1 to Number N,enter the N");
        countN = scanner.nextInt();
        for(;countN>0;countN--){
            Total+=countN;
        }
        System.out.println("total="+Total);
    }

}