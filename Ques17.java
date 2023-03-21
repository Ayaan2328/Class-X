import java.util.Scanner;

public class Ques17 {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.println("Input 1 for Floyd's triangle \nInput 2 for String pattern");
        System.out.print("Enter your choice : ");
        int ch = ad.nextInt();
        switch(ch)
        {
            case 1:
                int i, j, k=1;
                for(i = 1; i<=5; i++)
                {
                    for(j = 1; j<=i; j++)
                    {
                        System.out.print(k+" ");
                        k++;
                    }
                    System.out.println();
                }
                break;
            case 2:
                String c = "ICSE";
                int a, b;
                for(a = 0; a<4; a++)
                {
                    for(b = 0; b<=a; b++)
                    {
                        System.out.print(c.charAt(b));
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Invalid input. Please enter input between 1 and 2.");
        }
    }
}
