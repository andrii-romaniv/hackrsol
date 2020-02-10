package algorithms.hackerrank.algorithms.catMouse;

public class Solution {

    static String catAndMouse(int x, int y, int z) {
        if (Math.abs(z-x) < Math.abs(z-y)){
            return "Cat A";
        } else if (Math.abs(z-x) > Math.abs(z-y)){
            return "Cat B";
        } else return "Mouse C";
    }
}
