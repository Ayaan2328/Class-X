import java.util.Scanner;

public class Ques15 {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        int i;
        System.out.print("Enter a String: ");
        String a = ad.nextLine();
        String b = "";
        int l = a.length();
        for(i = l-1; i>=0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
            System.out.print("'"+b+"' is a Palindrome String");
    }
}
