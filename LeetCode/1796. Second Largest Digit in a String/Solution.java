import java.util.*;

public class Solution {
    public static int secondHighest1(String s) {
        int max1, max2;
        max1 = max2 = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                if (s.charAt(i) - 48 > max1) {
                    max2 = max1;
                    max1 = s.charAt(i) - 48;
                } else if (s.charAt(i) - 48 > max2 && s.charAt(i) - 48 < max1) {
                    max2 = s.charAt(i) - 48;
                }
            }
        }
        if (max2 == Integer.MIN_VALUE) {
            return -1;
        }
        return max2;
    }

    public static int secondHighest(String s) {
        // Create a HashSet to store unique digits
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                set.add(ch - '0'); // Convert char to integer and add to set
            }
        }

        // If there are less than 2 unique digits, return -1
        if (set.size() < 2) {
            return -1;
        }

        // Find the largest and second-largest digit
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : set) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }
        return max2;
    }

    public static void main(String[] args) {
        String s = "dfa12321afd";
        int x = secondHighest(s);
        System.out.println(x);
    }

}
