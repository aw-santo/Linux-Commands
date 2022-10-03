package com.pavan.Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePaths {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> ans = getMazePath(1,1,n,m);
        System.out.println(ans);
    }

    public static ArrayList<String > getMazePath(int sr,int sc,int dr,int dc){
        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres; }




            ArrayList<String> hpath = new ArrayList<>();
            ArrayList<String > vpath = new ArrayList<>();
            if(sr < dr){
                vpath = getMazePath(sr+1,sc,dr,dc);
            }
            if(sc < dc){
                hpath = getMazePath(sr,sc+1,dr,dc);
            }
            ArrayList<String> ans = new ArrayList<>();
            for (String i:
                    hpath) {
                ans.add("h"+ i   );

            }
            for (String i:
                    vpath) {
                ans.add("v"+     i);

            }
            return ans;

        }


    }
