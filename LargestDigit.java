import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = ad.nextInt();
        int a;
        int d = 0;
        while(n>0)
        {
            a = n%10;
            if(a>d)
                d=a;
            n/=10;
        }
        System.out.println("Largest digit = "+d);
    }
}
