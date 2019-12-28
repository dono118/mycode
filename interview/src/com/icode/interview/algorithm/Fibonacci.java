package com.icode.interview.algorithm;

/**
 * 打印斐波那契数列第n个数
 */
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(cp(4));
    }

    public static int cp(int n){
        if(n<=0){
            return -1;
        } else if(n==1||n==2){
            return 1;
        } else{
            return cp(n-1) + cp(n-2);
        }
    }
}