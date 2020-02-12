package algorithms.hackerrank.algorithms.birthbar;

import java.util.List;

public class Solution {

    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
        int answer = 0;
        for (int i=0; i <=s.size()-m;i++){
            int sum = 0;
            for (int j=0; j < m; j++){
                sum = sum + s.get(i+j);
            }
            if (sum == d){
                answer++;
            }
        }
        return answer;

    }


    }
