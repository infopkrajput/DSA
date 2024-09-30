import java.util.*;
public class LangfordPairing {

    // Function to find the Langford sequence
    public static boolean langfordPairing(int n) {
        // Check if solution is possible for n
        if (n % 4 != 0 && n % 4 != 3) {
            System.out.println("No Langford Pairing exists for n=" + n);
            return false;
        }

        // Initialize the result array with -1 to represent empty positions
        // int[] sequence = new int[2 * n];
        // for (int i = 0; i < 2 * n; i++) {
        // sequence[i] = -1;
        // }

        // We can also Initialize like this  
        int[] sequence = new int[2 * n];
        Arrays.fill(sequence, -1);

        // Start backtracking
        if (backtrack(sequence, n)) {
            System.out.print("Langford Pairing for n=" + n + ": ");
            for (int num : sequence) {
                System.out.print(num + " ");
            }
            System.out.println();
            return true;
        } else {
            System.out.println("No Langford Pairing exists for n=" + n);
            return false;
        }
    }

    // Backtracking function
    private static boolean backtrack(int[] sequence, int num) {
        // If all numbers are placed, return true
        if (num == 0) {
            return true;
        }

        // Try to place the number num in the sequence
        for (int i = 0; i < sequence.length - num - 1; i++) {
            // Check if positions i and i + num + 1 are available
            if (sequence[i] == -1 && sequence[i + num + 1] == -1) {
                sequence[i] = num;
                sequence[i + num + 1] = num;

                // Recur to place the next number
                if (backtrack(sequence, num - 1)) {
                    return true;
                }

                // Backtrack if placing num doesn't work
                sequence[i] = -1;
                sequence[i + num + 1] = -1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int n = 1;
        langfordPairing(n);
    }
}
