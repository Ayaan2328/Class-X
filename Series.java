import java.util.*;
public class Series
{
    public int sum()
    {
        Scanner ad = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = ad.nextInt();
        int i, s=0;
        for(i = 1; i<=n; i++) {
            s = s + (i * (i + 1));
        }
        return(s);
        }

    public static void main(String[] args) {
        {
            Scanner ad = new Scanner(System.in);
            Series ob = new Series();
            int n;
            n = ob.sum();
            System.out.println(n);
    }
    }
}