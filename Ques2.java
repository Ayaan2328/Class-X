import java.util.Scanner;

public class Ques2 {
    public void palin()
    {
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
    public static void main(String[] args) {
        Ques2 ob = new Ques2();
        ob.palin();
    }
}
