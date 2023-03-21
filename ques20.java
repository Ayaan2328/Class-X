import java.util.Scanner;

public class ques20 {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.println("Enter String : ");
        String n = ad.next();
        String a = n.toUpperCase();
        int l = a.length();
        String b = ""; char ch;
        int i;
        for (i = 0; i < l; i++)
        {
            ch = a.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                break;
            }
        }
        b = a.substring(i)+a.substring(0,i)+"AY";
        System.out.println(b);
    }
}
