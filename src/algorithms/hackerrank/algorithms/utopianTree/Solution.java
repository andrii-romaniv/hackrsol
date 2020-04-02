package algorithms.hackerrank.algorithms.utopianTree;

public class Solution {
    static int utopianTree(int n) {
        int height = 1;
        for(int i = 1; i < n+1; i++){
            if(i % 2 == 0){
                height += 1;
            }
            else{
                height *= 2;
            }
        }
        return height;
    }

    public static void main(String[] args) {
        System.out.println(utopianTree(4));
    }
}
