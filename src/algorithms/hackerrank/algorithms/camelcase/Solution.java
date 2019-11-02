package algorithms.hackerrank.algorithms.camelcase;

public class Solution {

    // Complete the camelcase function below.
    static int camelcase(String s) {
        char [] c = s.toCharArray();
        int count = 1;
        for(char a : c){
            if (Character.isUpperCase(a)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){


        String s = "saveChangesInTheEditor";
        int result = camelcase(s);
    }
}
