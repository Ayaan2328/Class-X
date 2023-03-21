import java.util.Scanner;

public class Primorial_CallingMethod {
    public int calc(int z)
    {
        int i, j, s, f=1;
        for(i = 1; i<=z; i++)
        {
            s = 0;
            for(j = 1; j<=i; j++)
            {
                if(i%j==0)
                    s++;
            }
            if(s==2)
                f = f*i;
        }
        return(f);
    }
    public int prime(int k)
    {
        int i, c=0;
        for(i = 1; i<=k; i++)
        {
            if(k%i==0)
                c++;
        }
        if(c==2)
            return 1;
        else
            return 0;
    }
    void primorial(int n)
    {
        int a = calc(n);
        System.out.println("Primorial of "+n+" = "+a);
    }

    public static void main(String[] args) {
        Primorial_CallingMethod ob = new Primorial_CallingMethod();
        System.out.println("Enter n: "); Scanner ad = new Scanner(System.in);
        int n = ad.nextInt();
        int a = ob.prime(n);
        if(a==1)
            System.out.println("Prime");
        else System.out.println("Composite");
        ob.prime(n);
        ob.calc(n);
        ob.primorial(n);
    }
}
