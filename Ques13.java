import java.util.Scanner;

public class Ques13 {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = ad.nextInt();
        int a, s=0, copy=n;
        while(n!=0)
        {
            a = n%10;
            s = s+a;
            n = n/10;
        }
        if(copy%s==0)
            System.out.println(copy+" is a niven number.");
        else
            System.out.println(copy+" is not a niven number.");
    }
}
