import java.util.Scanner;

public class FactorSum {
    void sumfactor(int num)
    {
        int i, s = 0;
        for(i = 1; i<=num; i++)
        {
            if(num%i==0)
                s = s+i;
        }
        System.out.println("Sum of Factors of "+num+" = "+s);
    }

    public static void main(String[] args) {
        FactorSum ob = new FactorSum();
        Scanner ad = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = ad.nextInt();
        ob.sumfactor(num);
    }
}