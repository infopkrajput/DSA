import java.util.*;

public class temp {
    public static void main(String[] args) {
        // Initialize the Hashtable with characters a to z and initial value 0
        Hashtable<Character, Integer> ht = new Hashtable<>();
        Hashtable<Character, Integer> ht2 = new Hashtable<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            ht.put(ch, 0);
            ht2.put(ch, 0);
        }
        

        // Example string
        String sc = "anagram";
        String tc = "nagaram";

        // Loop through each character in the string
        for (int i = 0; i < sc.length(); i++) {
            char currentChar = sc.charAt(i);
            
            // If the character exists in the hashtable (which it does, since all a-z are keys)
            if (ht.containsKey(currentChar)) {
                // Get the current value associated with the character and increment it
                int currentValue = ht.get(currentChar);
                ht.put(currentChar, currentValue + 1);  // Update the value in the hashtable
            }
        }
        for (int i = 0; i < tc.length(); i++) {
            char currentChar = tc.charAt(i);
            
            // If the character exists in the hashtable (which it does, since all a-z are keys)
            if (ht2.containsKey(currentChar)) {
                // Get the current value associated with the character and increment it
                int currentValue = ht2.get(currentChar);
                ht2.put(currentChar, currentValue + 1);  // Update the value in the hashtable
            }
        }
        if(ht==ht2)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        // Print the updated hashtable  to see the character counts
        System.out.println(ht);
        System.out.println(ht2);
    }
}
