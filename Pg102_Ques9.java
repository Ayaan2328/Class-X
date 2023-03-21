import java.util.Scanner;

public class Pg102_Ques9 {
    void input()
    {
        Scanner ad = new Scanner(System.in);
        int num;
        double a;
        System.out.print("Enter a number : ");
        num = ad.nextInt();
        a = Math.sqrt(num);
        if(a==0)
            System.out.println(num+" is a perfect square!");
        else
        {
            System.out.println(num+" is not a perfect square.");
            int v = (int)(a);
        }
    }
}
