import java.util.Scanner;

public class Sandhya_VST13_5 {
    int i , j;
    void pattern()
    {
        for(i = 1; i<=5; i++)
        {
            for(j = 1; j<=i; j++)
            {
                if(i%2==0)
                {
                    if(j==1||j==3)
                    System.out.print("#");
                    else
                    System.out.print("*");
                }
                else
                {
                    if(j==2||j==4)
                        System.out.print("#");
                    else System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    void pattern(String s)
    {
        for(i = 0; i<s.length(); i++)
        {
            for(j = 0; j<=i; j++)
            {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Sandhya_VST13_5 ob = new Sandhya_VST13_5();
        Scanner ad = new Scanner(System.in);
        System.out.print("Enter text for pattern: ");
        String s = ad.nextLine();
        ob.pattern(s);
        ob.pattern();
    }
}
