package java.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Solution {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));
    }

    public static String getDay(String day, String month, String year) {
        LocalDate localDate = LocalDate.of(Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(day));
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        return String.valueOf(dayOfWeek);
    }
}
