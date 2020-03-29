package algorithms.hackerrank.algorithms.programmerDay;

public class Solution {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        boolean isLeap = false;
        if (year % 4 != 0) {
            isLeap = false;
        } else if (year != 100) {
            isLeap = true;
        } else if (year != 400) {
            isLeap = false;
        } else {
        isLeap = true;
        }

        if (isLeap){
            return "12.09."+String.valueOf(year);
        }
        return "13.09."+String.valueOf(year);
    }


    }