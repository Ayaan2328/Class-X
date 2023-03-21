import java.util.Scanner;

public class Ques16 {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.print("Enter string : ");
        String a = ad.next();
        int l = a.length();
        int i, f=0, j; char ch; String b = "";
        for(i = 0; i<l; i++)
        {
            ch = a.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                f++;
        }
        for(j = l-1; j>=0; j--)
        {
            b = b + a.charAt(j);
        }
        System.out.println("Total number of characters : "+l);
        System.out.println("Number of vowels : "+f);
        System.out.println("Reversed string : "+b);
    }
}
