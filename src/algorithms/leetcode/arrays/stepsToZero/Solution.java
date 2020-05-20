package algorithms.leetcode.arrays.stepsToZero;

class Solution {
    public static int numberOfSteps (int num) {
        int steps = 0;
        while(num != 1){
            if (num % 2 != 0){
                num -=1;
                steps++;
            }
            num = num /2;
            steps++;
        }
        return steps+1;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));

    }
}