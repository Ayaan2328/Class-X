import java.util.Scanner;

public class number_nature {
    void check(int num)
    {
        if(num>0)
            System.out.println("No. is positive");
        else if (num<0) {
            System.out.println("No. is negative");
        }
        else
            System.out.println("No. is 0");

    }

    public static void main(String[] args) {
        number_nature ob = new number_nature();
        System.out.print("Enter a no. : ");
        Scanner ad = new Scanner(System.in);
        int num = ad.nextInt();
        ob.check(num);
    }
}
