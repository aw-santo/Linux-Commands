package com.pavan.Recursion;

import java.io.*;
import java.util.*;

public class towerhanoi {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        towerofhanoi(n,n1 ,n2 ,n3);
    }

    public static void towerofhanoi(int n , int n1 , int n2 , int n3){
        if(n == 1){
            System.out.println(n + "["+ n1 +"->"+n3+"]");
            return;
        }


        towerofhanoi(n-1,n1,n3,n2);
        System.out.println(n + "["+ n1 +"->"+n3+"]");
        towerofhanoi(n-1,n2,n1,n3);

    }

}