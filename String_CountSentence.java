import java.util.Scanner;
public class String_CountSentence {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = ad.nextLine();
        String a = s.trim();
        int b = a.length();
        int i, c=0;
        for(i = 0; i<b; i++)
        {
            if(a.charAt(i)=='.'||a.charAt(i)=='?'||a.charAt(i)=='!')
                c++;
        }
        System.out.println("Number of Sentences = "+c);
    }
}
