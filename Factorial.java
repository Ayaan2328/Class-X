import java.util.*;
public class Factorial {
    public double fact()
    {
        Scanner ad = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = ad.nextInt();
        int i; double p = 0.0;
        for(i = 1; i<=n; i++)
        {
            p = 1.0;
            p = p*i;
        }
        return(p);
    }

    public static void main(String[] args) {
        {
            Factorial ad = new Factorial();
            double v = ad.fact();
            int k = (int)(v);
            System.out.println("Factorial = "+k);
        }
    }
}
