import java.util.*;
public class Ques5 {
    public void check(String str, char ch)
    {
        int l = str.length();
        int i, c=0;
        for(i=0; i<l; i++)
        {
            if(str.charAt(i)==ch)
                c++;
        }
        System.out.println("Frequency of '"+ch+"' in '"+str+"' = "+c);
    }
    public void check(String s1)
    {
        s1 = s1.toLowerCase();
        int i,c = 0, l = s1.length(); char ch;
        for(i = 0; i<l; i++)
        {
            ch = s1.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                c++;
        }
        System.out.println("Number of vowels in '"+s1+"' = "+c);
    }

    public static void main(String[] args) {
        Ques5 ob = new Ques5();
        Scanner ad = new Scanner(System.in);
        System.out.print("Enter String for checking Frequency: ");
        String str = ad.next();
        System.out.print("Enter letter to be counted: ");
        char ch = ad.next().charAt(0);
        System.out.print("Enter String for counting number of vowels: ");
        String s1 = ad.next();
        ob.check(str,ch);
        ob.check(s1);
    }
}