import java.util.Scanner;

public class Pg240_Ques2 {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        double a[] = new double[20];
        int i;
        System.out.println("Enter temperature in F : ");
        for(i=0; i<20; i++)
        {
            a[i] = ad.nextDouble();
            a[i] = (a[i]-32)*5/9.0;
        }
        for(i=0; i<10; i++)
            System.out.println(a[i]+" C");
    }
}
