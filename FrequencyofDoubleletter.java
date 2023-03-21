import java.util.Scanner;

public class FrequencyofDoubleletter {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s = ad.nextLine();
        String word = ""; int c = 0;
        int j; char ch;
        for(j = 0; j<s.length(); j++) {
            ch = s.charAt(j);
            if (Character.isWhitespace(ch))
            {
                if (word.length() > 0)
                    word = "";
            }
            else
                word += ch;
        }
        for(j = 0; j<word.length()-1; j++)
        {
            if(word.charAt(j)==word.charAt(j+1))
                c++;
        }
        System.out.println(c);
    }
}
