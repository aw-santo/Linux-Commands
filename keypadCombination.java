package com.pavan.Recursion;

import java.util.ArrayList;

public class keypadCombination {
    public static void main(String[] args) {
        String ip = "78";
        ArrayList<String> ans = kpc(ip);
        System.out.println(ans);

    }

    static String[] code = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> kpc(String str){
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }




        char ch = str.charAt(0);
        str = str.substring(1);
        ArrayList<String> rres = kpc(str);
        ArrayList<String > mres = new ArrayList<>();
        for (int i = 0; i < code[ch-'0'].length(); i++) {
            char ch1 = code[ch - '0'].charAt(i);
            for (String str1:rres
                 ) {
                mres.add(ch1+str1);

            }


        }
        return mres;

    }
}
