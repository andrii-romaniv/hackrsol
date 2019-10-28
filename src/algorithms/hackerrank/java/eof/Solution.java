package algorithms.hackerrank.java.eof;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int i = 1;
        while (str != null)
        {
            System.out.print(Integer.toString(i++) + ' ' + str + '\n');
            str = scanner.nextLine();
        }
    }
}
