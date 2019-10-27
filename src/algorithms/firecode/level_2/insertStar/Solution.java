package algorithms.firecode.level_2.insertStar;

public class Solution {
    public static String insertPairStar(String s) {
        if(s == null || s.length() == 1 || s==" ") return s;
        if(s.charAt(0) == s.charAt(1)){
            return s.substring(0,1) + "*" + insertPairStar(s.substring(1, s.length()));

        }else {
            return s.substring(0,1) + insertPairStar(s.substring(1, s.length()) );
        }
    }
}
