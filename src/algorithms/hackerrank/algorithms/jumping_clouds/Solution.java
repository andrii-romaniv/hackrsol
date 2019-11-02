package algorithms.hackerrank.algorithms.jumping_clouds;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int count = 0;
        for(int i =0;i < c.length-1; i ++){
            if (i+2 < c.length && c[i+2] == 0){
                i++;
            }
            count++;
        }

        return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[] c = {0, 0, 0, 0, 1, 0};

        int result = jumpingOnClouds(c);

        scanner.close();
    }
}
