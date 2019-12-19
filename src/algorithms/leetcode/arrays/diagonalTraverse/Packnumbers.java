package algorithms.leetcode.arrays.diagonalTraverse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Packnumbers {
    public static void main(String[] args) {

        int [] n = {5,5,5,7,7,3,4,7};
        System.out.println(pack(n));
    }



    static List pack(int[] n){
        List list = new ArrayList();
        String separator = ":";
        Map<String, Integer> numbers = new HashMap<>();
        List<Integer> listIntegers = new ArrayList();
        int prev = 0;
        int j=n.length-1;
        for (int i = 0; i < n.length; i++){

            if ((j!=0 && n[i] == n[i+1]) || n[i] == prev){
                String a = String.valueOf(n[i]);
                if (!numbers.containsKey(a)){
                numbers.put(a, 1);
                } else {
                    int count = numbers.get(a);
                    count++;
                    numbers.put(a, count);
                }
            } else {
                listIntegers.add(n[i]);
            }
            j--;
            prev = n[i];
        }

        numbers.forEach((s, integer) -> {
            list.add(new String(s+separator+integer));
        });
        return (List) Stream.of(list, listIntegers).flatMap(x-> x.stream()).collect(Collectors.toList());
    }


}
