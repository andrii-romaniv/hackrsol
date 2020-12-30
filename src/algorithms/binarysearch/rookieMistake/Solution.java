package algorithms.binarysearch.rookieMistake;

class Solution {
    public static boolean solve(String s) {

        String parts [] = s.split("R");
        if (parts.length > 1) {
            for (String a : parts) {
                if (!a.contains("B")) {
                    return true;
                }
            }
        } else {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
//        String s = "B...B...R........BBBB";
//        String s = "......B....R..............";
        String s = "B.R";
        String ss [] = s.split("R");
        System.out.println(solve(s));
    }
}