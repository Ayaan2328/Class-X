import java.util.Scanner;

public class Array_Factorial {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        int i, j; double f;
        int a[] = new int[10];
        System.out.println("Enter Array values:");
        for(i = 0; i<10; i++)
            a[i] = ad.nextInt();
        double b[] = new double[10];
        for(j = 0; j<10; j++)
        {
            f = 1;
            for(i = 1; i<=a[j]; i++)
            {
                f*=i;
            }
            b[j] = f;
        }

        for(i = 0; i<10; i++)
        {
            System.out.println("Nos. \t Factorial");
            System.out.println(" "+a[i]+"\t       "+b[i]);
        }
    }
}
