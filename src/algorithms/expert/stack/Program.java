package algorithms.expert.stack;

import java.util.*;

class Program {
    public static void main(String[] args) {
        ArrayList<Integer> l = sunsetViews(new int[] {1, 2, 3, 4, 5, 6},"WEST");
        System.out.println(l);
    }

    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        if (buildings.length == 0 || buildings == null) return new ArrayList<Integer>();
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int startIdx = 0;
        int step = 1;
        if (direction == "WEST") {
            startIdx = buildings.length - 1;
            step = -1;
        }
        int idx = startIdx;
        while (idx >= 0 && idx < buildings.length) {
            int height = buildings[idx];
            while (!stack.isEmpty() && height >= buildings[stack.peek()]) {
                stack.pop();
            }
            stack.push(idx);

            idx += step;
        }

            while (!stack.isEmpty()) {
                if (direction == "WEST"){
                    list.add(stack.pop());
                } else {
                    list.add(0, stack.pop());
                }
            }
        return list;
    }
}
