import java.util.Scanner;

public class Pg340_Ques19 {
    void compare(int a, int b)
    {
        Scanner ad = new Scanner(System.in);
        System.out.println("Enter the two numbers : ");
        a = ad.nextInt();
        b = ad.nextInt();
        int max = Math.max(a,b);
        System.out.println("Bigger integer among the two : "+max);
    }
    void compare(char a, char b)
    {
        Scanner ad = new Scanner(System.in);
        System.out.println("Enter the two characters : ");
        a = ad.next().charAt(0);
        b = ad.next().charAt(0);
        int c = (int)(a);
        int d = (int)(b);
        int max = Math.max(c,d);
        if(c>d)
            System.out.println("Higher char numeric value : "+max+"\nmax = "+a);
        else
            System.out.println("Higher char numeric value : "+max+"\n max = "+b);
    }
    void compare(String a, String b)
    {
        Scanner ad = new Scanner(System.in);
        System.out.println("Enter the strings : ");
        a = ad.next();
        b = ad.next();
        int c = a.length();
        int d = b.length();
        int compare = Math.max(c,d);
        if(c>d)
            System.out.println("The string : "+a+" has more number of characters. \nThe length of characters = "+c);
        else
            System.out.println("The string : "+b+" has more number of characters. \nThe length of characters = "+d);
    }

    public static void main(String[] args) {
        int a=0, b=0;
        char c= '\u0000', d='\u0000';
        String e = "", f = "";
        Pg340_Ques19 ob = new Pg340_Ques19();
        ob.compare(a,b);
        ob.compare(c,d);
        ob.compare(e,f);
    }
}
