package algorithms.leetcode.arrays.backSpaceCompare;

class Solution {
    public static boolean backspaceCompare(String S, String T) {
        String a = buildStr(S);
        String b = buildStr(T);
        return a.equals(b);
        }

        public static String buildStr(String str){
            char [] cS =str.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (char c : cS){
                if (c == '#') {
                    if (str.length() != 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                } else {
                    sb.append(c);
                }
            }
            return sb.toString();
        }

    public static void main(String[] args) {
        String a = "ab#c";
        String b = "ad#c";
        System.out.println(backspaceCompare(a,b));
    }


}