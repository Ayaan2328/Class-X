import java.util.*;
public class Armstrong {
    public int arm()
    {
        Scanner ad = new Scanner(System.in);
        int a, s=0;
        System.out.println("Enter a number");
        int n = ad.nextInt();
        int copy = n;
        while(n!=0)
        {
            a = n%10;
            s = s+(a*a*a);
            n = n/10;
        }
        if(s==copy)
            return(0);
        else
            return(1);
    }

    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        Armstrong ob = new Armstrong();
        int b = ob.arm();
        if(b==0)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }
}

