import java.util.*;
public class Ques7 {
    public static void main(String[] args) {
        int s = 0, a, i, digit, n, f = 1;
        Scanner ad = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = ad.nextInt();
        digit = n;
        while (n != 0) {
            a = n % 10;
            f = f*a;
            s = s+a;
            n = n / 10;
        }
        if((s+f)==digit)
            System.out.println(digit+" is a Special 2-digit number");
        else
            System.out.println(digit+" is not a Special 2-digit number");
    }
}