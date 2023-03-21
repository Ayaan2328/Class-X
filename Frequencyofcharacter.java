import java.util.*;
public class Frequencyofcharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the word from the user
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        // Create an array to store the frequency of each letter
        int[] letterCounts = new int[26];

        // Count the frequency of each letter in the word
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isLetter(c)) {
                // Convert the letter to lowercase
                c = Character.toLowerCase(c);
                // Increment the count for the corresponding letter
                letterCounts[c - 'a']++;
            }
        }

        // Print the frequency of each letter in ascending order
        for (int i = 0; i < 26; i++) {
            if (letterCounts[i] > 0) {
                System.out.println((char)(i + 'a') + ": " + letterCounts[i]);
            }
        }
    }
}

