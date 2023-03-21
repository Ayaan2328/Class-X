import java.util.Scanner;
public class String_CountWords {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = ad.nextLine();
        int i, a, c=1; String k;
        k = s.trim();
        a = k.length();
        for(i = 0; i<a; i++)
        {
            if(k.charAt(i)==' '&& k.charAt(i+1)!=' ')
                c++;
        }
        System.out.println("Number of Words : "+c);
    }
}
