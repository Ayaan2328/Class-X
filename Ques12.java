import java.util.Scanner;

public class Ques12 {
    public static void main(String[] args) {
       Scanner ad = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = ad.nextInt();
        int a, s=0, p=1, copy=n;
        while(n!=0)
        {
            a = n%10;
            s = s+a;
            p = p*a;
            n = n/10;
        }
        if(s==p)
            System.out.println(copy+" is a spy number.");
        else
            System.out.println(copy+" is not a spy number.");
    }
}
