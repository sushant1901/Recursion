package com.company;
import java.util.*;
public class Main1 {
    public static void printRev(String str,int idx){
        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        printRev(str,idx-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        printRev(str,str.length()-1);
    }
}