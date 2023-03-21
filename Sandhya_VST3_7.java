import java.util.Scanner;

public class Sandhya_VST3_7 {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.println("Enter 2 words(using and): ");
        String a = ad.nextLine();
        a = a.trim();
        String b1 = "";
        int i, j, c = 0;
        String b = "";
        boolean anagram = false;
        for (i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ' && a.charAt(i + 1) != ' ') {
                c++;
                if (c == 2) {
                    b = a.substring(i + 1);
                    break;
                }
            }
        }
        for (i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ' && a.charAt(i + 1) != ' ') {
                b1 = a.substring(0, i);
                break;
            }
        }
        if (b.length() != b1.length()) {
            System.out.println("Not anagram");
            System.exit(0);
        } else if (b.length() == b1.length()) {
            anagram = true;
            for (j = 0; j < b1.length(); j++) {
                if (b.indexOf(b1.charAt(j)) == -1) {
                    anagram = false;
                    break;
                }
            }
        }
        if (anagram)
            System.out.println("The words are anagrams.");
        else
            System.out.println("The words are not anagrams.");
    }
}