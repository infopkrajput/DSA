import java.util.*;

class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int start = 0;
        int end = n - 1;
        s = s.toLowerCase();
        while (start <= end) {
            if (Character.isLetterOrDigit(s.charAt(start)) == false) {
                start++;
                continue;
            } else if (Character.isLetterOrDigit(s.charAt(end)) == false) {
                end--;
                continue;
            } else if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        String s = "Ac3?e3c&a";
        Solution obj = new Solution();
        System.out.println(obj.isPalindrome(s));
    }

}