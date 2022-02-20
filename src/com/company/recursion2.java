package com.company;
import java.util.*;
public class recursion2 {
    public static void printPDI(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        printPDI(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        printPDI(n);
    }
}
