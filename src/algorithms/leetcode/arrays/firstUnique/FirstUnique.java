package algorithms.leetcode.arrays.firstUnique;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class FirstUnique {

    HashSet<Integer> unique = new LinkedHashSet<Integer>();
    HashSet<Integer> nonUnique = new LinkedHashSet<Integer>();

    public FirstUnique(int[] nums) {
        for (int i : nums){
            add(i);
        }

    }

    public int showFirstUnique() {
        try{
            return unique.iterator().next();
        }
        catch (Exception e){
            return -1;
        }

    }

    public void add(int value) {
        if (nonUnique.contains(value)){
            return;
        } else if (unique.contains(value)){
            unique.remove(value);
            nonUnique.add(value);
            return;
        }
        unique.add(value);
    }
}
