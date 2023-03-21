import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        String word = "";
        System.out.println("The words in the sentence are:");
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (Character.isWhitespace(c)) {
                if (word.length() > 0) {
                    System.out.println(word);
                    word = "";
                }
            } else {
                word += c;
            }
        }
        if (word.length() > 0) {
            System.out.println(word);
        }
    }
}