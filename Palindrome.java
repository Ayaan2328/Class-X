import java.util.*;
public class Palindrome {
    public String test()
    {
        Scanner ad = new Scanner(System.in);
        int a, s=0;
        System.out.println("Enter a number : ");
        int n = ad.nextInt();
        int copy = n;
        while(copy!=0)
        {
            a = copy%10;
            s = (s*10)+a;
            copy = copy/10;
        }
        if(s==n)
            return("true");
        else
            return("false");
    }

    public static void main(String[] args) {
        {
            Scanner ad = new Scanner(System.in);
            Palindrome mb = new Palindrome();
            String b = mb.test();
            if(b=="true")
                System.out.println("Palindrome");
            else
                System.out.println("Not Palindrome");
        }
    }
}
