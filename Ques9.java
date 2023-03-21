import java.util.*;
public class Ques9 {
    public static void main(String [] args) {
        Scanner ad = new Scanner(System.in);
        System.out.println("Enter '1' to check for Palindrome number.\nEnter '2' to check for Perfect number.");
        System.out.print("Enter your choice : ");
        int ch = ad.nextInt();
        switch(ch)
        {
            case 1:
                int a, s=0;
                System.out.print("Enter a number : ");
                int n = ad.nextInt();
                int copy = n;
                while(copy!=0)
                {
                    a = copy%10;
                    s = (s*10)+a;
                    copy = copy/10;
                }
                if(s==n)
                    System.out.print(n+" is a Palindrome number.");
                else
                    System.out.println(n+" is not a Palindrome number.");
                break;
            case 2:
                System.out.print("Enter a number : ");
                int num = ad.nextInt();
                int i, sum=0;
                for(i = 1; i<num; i++)
                {
                    if(num%i==0)
                        sum = sum+i;
                }
                if(sum==num)
                    System.out.println(num+" is a perfect number.");
                else
                    System.out.println(num+" is not a perfect number.");
                break;
            default:
                System.out.println("Please enter valid input!");
        }
    }
}