import java.util.*;

public class Solution {
    public static boolean isAnagram(String s, String t) {
        Hashtable<Character, Integer> t1 = new Hashtable<>();
        Hashtable<Character, Integer> t2 = new Hashtable<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            t1.put(ch, 0);
            t2.put(ch, 0);
        }
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (t1.containsKey(currentChar)) {
                int currentValue = t1.get(currentChar);
                t1.put(currentChar, currentValue + 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char currentChar = t.charAt(i);
            if (t2.containsKey(currentChar)) {
                int currentValue = t2.get(currentChar);
                t2.put(currentChar, currentValue + 1);
            }
        }
        if (t1.equals(t2)) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

}
