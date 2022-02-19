package com.company;
import java .util.*;
public class Main {
    public static void towerOfHanoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("tranfer disk "+ n +" form "+ src +" to "+ dest);
        }
        towerOfHanoi(n-1,src,dest,helper);
        System.out.println("tranfer disk "+ n +" form "+ src +" to "+ dest);
        towerOfHanoi(n-1,helper,src,dest);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        towerOfHanoi(n,"S","H","D");
	// write your code here
    }
}
