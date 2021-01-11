package algorithms.binarysearch.moveElement;

import java.util.List;

public class Solution {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int j=0;
        for(int i=0; i < array.size(); i++) {
            if(array.get(i) != toMove){
                array.set(j++, array.get(i));
            }
        }
        while (j < array.size()){
            array.set(j++, toMove);
        }
        return array;
    }
}
