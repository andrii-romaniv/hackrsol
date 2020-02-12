package algorithms.hackerrank.algorithms.angryProfessor;

public class Solution {
    // Complete the angryProfessor function below.
    static String angryProfessor(int k, int[] a) {
        int result=0;
        for (int i =0; i < a.length; i++){
            if (a[i] <=0){
                result++;
            }
        }
        if (result >=k){
            return "NO";
        } else {
            return "YES";
        }
    }

    public static void main(String[] args) {
        int [] a = {-1, -3, 4, 2};
        System.out.println(angryProfessor(3, a));
    }
}
