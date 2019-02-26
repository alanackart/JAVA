package com.company;

import java.math.BigInteger;

public class Fibonacci {
    static  int n = 0;
    static void printFibSeq(int n){
        BigInteger a0 = new BigInteger("1");
        BigInteger a1 = new BigInteger("1");
        if(n == 1) {
            System.out.println("1");
            return ;
        }
        if(n == 2) {
            System.out.println("1\n1");
            return ;
        }
        BigInteger a2 = new BigInteger("1");
        System.out.println("1\n1");
        for(int i = 3; i <= n; i++ ){
            a2 = a0.add(a1);
            System.out.print(a2 + "\n");
            a0 = a1;
            a1 = a2;
        }
    }
    public static void main(String[] args) {
        // write your code here
        if(args.length == 1){
            System.out.println(args[0]);
            n = Integer.parseInt(args[0]);
            printFibSeq(n);
        }

    }
}
