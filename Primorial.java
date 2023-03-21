import java.util.Scanner;

public class Primorial
{
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = ad.nextInt();
        int i, j; long f=1;
        for(i = 1; i<=n; i++)
        {
            int c=0;
            for(j=1; j<=i; j++)
            {
                if(i%j==0)
                    c++;
            }
            if(c==2)
                f=f*i;
        }
        System.out.println("Primorial of "+n+" = "+f);
    }
}