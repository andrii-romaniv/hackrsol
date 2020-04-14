package algorithms.leetcode.arrays.stringShift;

class Solution {
    public String stringShift(String s, int[][] shift) {
        int total = 0;
        for (int i=0; i<shift.length;i++){
            if (shift[i][0] == 0){
                total+=shift[i][1];
            } else {
                total-=shift[i][1];
            }
        }
        String newFront;
        String newBack;

        if (total > 0){
            total %=s.length();
            newFront = s.substring(0, total);
            newBack = s.substring(total);

        } else if (total< 0){
            total = Math.abs(total) % s.length();
            newFront = s.substring(0, s.length()-total);
            newBack = s.substring(s.length() - total);
        } else {
            return s;

        }
        return newBack+newFront;

    }
}
