package com.company;
import java.util.*;
public class Recursion3 {
    public static  int fact(int n){
        if(n==1){
            return 1;
        }
       int fn1= fact(n-1);
        int  fn= n*fn1;
        return fn;


    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(fact(n));
    }
}
