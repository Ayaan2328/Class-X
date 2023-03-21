import java.util.*;
public class overload {
    public double series(int n) {
        Scanner ad = new Scanner(System.in);
        System.out.print("Enter range : ");
        n = ad.nextInt();
        int i;
        double sum = 0.0;
        for (i = 1; i <= n; i++) {
            sum = sum + (1.0 / i);
        }
        return (sum);
    }

    public double series(double a, double n) {
        Scanner ad = new Scanner(System.in);
        System.out.print("Enter value of A : ");
        a = ad.nextDouble();
        System.out.print("Enter range : ");
        n = ad.nextDouble();
        int i, b;
        double s = 0.0;
        for (i = 1; i <= n; i = i + 3) {
            b = i + 1;
            s = s + (i / (Math.pow(a, b)));
        }
        return (s);
    }

    public static void main(String[] args) {
        overload ob = new overload();
        double a=0.0,n=0.0; int b = 0;
        double z = ob.series(b);
        double x = ob.series(a,n);
        System.out.println(z);
        System.out.println(x);
    }
}

