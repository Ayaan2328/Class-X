import java.util.Scanner;

public class String_Ascending {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String a = ad.nextLine();
        a = a.toUpperCase();
        char ch;
        int i,j; String b = "";
        for(i=65; i<=90;i++) //for descending, make changes to this loop
        {
            ch = (char)i;
            for(j=0; j<a.length(); j++)
            {
                if(a.charAt(j)==ch) {
                    b = b+a.charAt(j);
                }
            }
        }
        b = b.toLowerCase();
        System.out.println(b);
    }
}
