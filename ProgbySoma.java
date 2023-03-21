import java.util.Scanner;

public class ProgbySoma {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String a = ad.nextLine();
        int k = 0;
        int l = a.length();
        String b = ""; int i, j; char ch;
        for(i = 0; i<l; i++)
        {
            ch = a.charAt(i);
            if(Character.isWhitespace(ch)&&Character.isLetterOrDigit(ch)==false) {
                if (b.length() > 0) {
                    System.out.println(b);
                    b = "";
                }
            }
            else
                b = b+ch;
        }
        System.out.println(b);
    }
}
