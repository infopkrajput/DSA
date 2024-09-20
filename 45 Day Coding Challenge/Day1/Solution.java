import java.util.Scanner;

public class Solution {

    public static String dayOfTheWeek(int day, int month, int year) {
        // Array of days in each month
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        year = year - 1;
        int leapYearsDays = year / 400 + year / 4 - year / 100;
        int allDays = year * 365 + leapYearsDays;
        year = year + 1;
        // Check if the current year is a leap year
        daysInMonth[1] = (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) ? 29 : 28;
        // Add days of the previous months
        for (int i = 0; i < month - 1; i++) {
            allDays += daysInMonth[i];
        }
        // Add the current day
        allDays += day;
        // Find the day of the week (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
        int dayOfWeek = allDays % 7;

        switch (dayOfWeek) {
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            default:
                return "Invalid"; // This should never happen
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases

        // Array to store the dates
        int[][] dates = new int[T][3]; // Each row will store a [day, month, year]

        // Input the dates
        for (int i = 0; i < T; i++) {
            dates[i][0] = sc.nextInt(); // Day
            dates[i][1] = sc.nextInt(); // Month
            dates[i][2] = sc.nextInt(); // Year
        }

        // Process each date and print the result
        for (int i = 0; i < T; i++) {
            int day = dates[i][0];
            int month = dates[i][1];
            int year = dates[i][2];
            System.out.println(dayOfTheWeek(day, month, year));
        }
        sc.close();
    }
}
