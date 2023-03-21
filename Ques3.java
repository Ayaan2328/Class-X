import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        int i;
        System.out.print("Enter a String: ");
        String a = ad.nextLine();
        String b = "", c="";
        c = c + a.charAt(0);
        int l = a.length();
        for(i = l-1; i>=0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.startsWith(c)==a.endsWith(c))
            System.out.println("'"+a+"' is a Special word.");
        if(a.equalsIgnoreCase(b))
            System.out.print("'"+b+"' is a Palindrome word.");
    }
}
