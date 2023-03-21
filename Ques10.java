import java.util.Scanner;

public class Ques10 {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = ad.nextInt();
        int copy = n;
        int i, f=0, a, s=0;
        for(i=1; i<=n; i++)
        {
            if(n%i==0)
            f++;
        }
        if(f>2)
            System.out.println(copy+" is a composite number.");
        else
            System.out.println(copy+" is not a composite number.");
        while(n!=0)
        {
            a = n%10;
            s = s+(a*a*a);
            n = n/10;
        }
        if(s==copy)
            System.out.println(copy+" is an armstrong number.");
        else
            System.out.println(copy+" is not an armstrong number.");
    }
}
