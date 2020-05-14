package algorithms.leetcode.other.removeVowels;

class Solution {
    public String removeVowels(String S) {
        StringBuilder sb = new StringBuilder();
        for (char c: S.toCharArray()){
            if ("aeiou".indexOf(c)== -1){
                sb.append(c);
            }
        }
        return sb.toString();

    }
}