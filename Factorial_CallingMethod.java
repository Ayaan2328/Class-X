import java.util.Scanner;

public class Factorial_CallingMethod {
    int n, s;
    void get()
    {
        Scanner ad = new Scanner(System.in);
        System.out.println("enter n: ");
        n = ad.nextInt();
    }
    void calc()
    {
        s = 0;
        int i, j, d=1;
        for(i = 2; i<=n; i+=2)
        {
            d = fact(i);
            s = s+d;
        }
    }
    public int fact(int x)
    {
        int i; int f = 1;
        for(i = 1; i<=x; i++)
            f = f*i;
        return(f);
    }
    void display()
    {
        System.out.println("The value of s = 2! + 4! + 6! + ... + " + n + "! = " + s);
    }

    public static void main(String[] args) {
        Factorial_CallingMethod ob = new Factorial_CallingMethod();
        Scanner ad = new Scanner(System.in);
        System.out.println("enter x: ");
        int x = ad.nextInt();
        ob.get();
        ob.calc();
        ob.display();
    }
}
