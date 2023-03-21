import java.util.*;
public class pg420ques7 {
    float a,b,c,d,r1,r2;
    pg420ques7(int x, int y, int z)
    {
        a=x;
        b=y;
        c=z;
        d=0;
    }
    void calculate()
    {
        d = (b*b)-(4*a*c);
        float d1 = (float)Math.sqrt(b);
        if (d < 0)
            System.out.println("Root imaginary");
        else {
            r1 = (-b + d1) / 2 * a;
            r2 = (-b - d1)/2*a;
            System.out.println(r1);
            System.out.println(r2);
        }
    }

    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.println("Enter values : ");
        int a = ad.nextInt();
        int b = ad.nextInt();
        int c = ad.nextInt();
        pg420ques7 ob = new pg420ques7(a,b,c);
        ob.calculate();
    }
}
