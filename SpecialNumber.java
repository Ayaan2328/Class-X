import java.util.*;
public class SpecialNumber {
    public int fact()
    {
        int s=0, a, i, digit, n, f;
        Scanner ad = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = ad.nextInt();
        digit = n;
        while(n!=0)
        {
            f = 1;
            a = n%10;
            for(i = 1; i<=a; i++)
            {
                f = (f*i);
            }
            s = s+f;
            n = n/10;
        }
        if(s==digit)
            return(0);
        else
            return(1);
    }
    public boolean check()
    {
        SpecialNumber ad = new SpecialNumber();
        int z = ad.fact();
        if(z==0)
            return(true);
        else
            return(false);
    }

    public static void main(String[] args) {
        SpecialNumber ad = new SpecialNumber();
        boolean y = ad.check();
        if(y==true)
            System.out.println("SPECIAL NUMBER");
        else
            System.out.println("NOT A SPECIAL NUMBER");
    }
}
