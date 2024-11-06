import java.util.*;

class Solution {
    public int countPrimes(int n) {
        if (n <= 1)
            return 0;

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
                for (int j = i * 2; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int n = 50;
        System.out.println(obj.countPrimes(n));
    }
}
