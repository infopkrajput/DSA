
public class Solution {
    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int rem = x % 10;
            if (rev > (Integer.MAX_VALUE / 10) || (rev < (Integer.MIN_VALUE / 10))) {
                return 0;
            }
            rev = rev * 10 + rem;
            x /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int num = -123455; // Testing with INT_MIN
        int reverse_num = reverse(num);
        if (reverse_num == 0) {
            System.out.println("Overflow occurred, cannot reverse the number.");
        } else {
            System.out.println("Reversed number is: " + reverse_num);
        }

    }

}