package algorithms.hackerrank.java.strings.intro;

import java.util.Scanner;

public class Solution {

    static String capitalize(String s){
        return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
    }
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        String a=scanner.next();
        String b=scanner.next();
        System.out.println(a.length()+b.length());
        System.out.println(a.compareTo(b)>0 ? "Yes" : "No");
        System.out.println(capitalize(a)+" "+capitalize(b));
    }
}