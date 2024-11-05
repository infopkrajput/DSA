import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public String reverseWords(String s) {
        StringBuilder reversed = new StringBuilder(s).reverse();

        StringBuilder newS = new StringBuilder();
        StringBuilder word = new StringBuilder();

        int i = 0;
        while (i < reversed.length()) {
            if (reversed.charAt(i) == ' ') {
                i++;
                continue;
            }

            word.setLength(0);
            while (i < reversed.length() && reversed.charAt(i) != ' ') {
                word.append(reversed.charAt(i));
                i++;
            }

            if (newS.length() > 0) {
                newS.append(' ');
            }
            newS.append(word.reverse());
        }

        return newS.toString();
    }
};

public class main {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String str = "the sky        is blue";
        System.out.println(obj.reverseWords(str));
    }
}
