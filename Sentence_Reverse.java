import java.util.Scanner;

public class Sentence_Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        String reverseSentence = "";
        String word = "";

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != ' ') {
                word = sentence.charAt(i) + word;
            } else {
                reverseSentence = reverseSentence + word + " ";
                word = "";
            }
        }
        reverseSentence = reverseSentence + word;
        System.out.println("Reversed Sentence: " + reverseSentence);
    }
}



