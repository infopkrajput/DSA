import java.util.*;

class Solution {
    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    };

    public int findGCD(int[] nums) {
        int a = Arrays.stream(nums).min().getAsInt();
        int b = Arrays.stream(nums).max().getAsInt();
        return gcd(a, b);
    }
};

public class main {

    public static void main(String[] args) {
        int[] nums = { 2, 5, 6, 9, 10 };
        Solution obj = new Solution();
        System.out.println(obj.findGCD(nums));
    }
}