import java.util.*;
class Solution {
    public String removeOccurrences(String s, String part) {
        while (s.contains(part)) {
            s = s.replaceFirst(part, "");
        }
        return s;
    }
}


public class Main {

    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String part = "abc";
        Solution obj = new Solution();
        System.out.println(obj.removeOccurrences(s, part));
    }
}