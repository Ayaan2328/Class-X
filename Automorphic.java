import java.util.*;
public class Automorphic
{
    public char auto()
    {
        Scanner ad = new Scanner(System.in);
        int n, b, sq, a = 0;
        System.out.print("Enter a number : ");
        n = ad.nextInt();
        sq = n*n;
        int copy = n;
        while(n!=0)
        {
            a = a+1;
            n = n/10;
        }
        b = (int) Math.pow(10,a);
        if(sq%b==copy)
            return('t');
        else
            return('f');
    }

    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        Automorphic ob = new Automorphic();
        char v = ob.auto();
        if(v=='t')
            System.out.println("Automorphic number");
        else
            System.out.println("Not");
    }
}
