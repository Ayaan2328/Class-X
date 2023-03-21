import java.util.Scanner;
public class Array_copyvalues {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        int i,j;
        int a[] = new int[10];
        int b[] = new int[10];
        System.out.println("Enter values : ");
        for(i = 0; i<10; i++)
        {
            a[i] = ad.nextInt();
            b[i] = a[i];
        }
        for(j=0; j<10; j++)
        {
            System.out.println(b[j]);
        }
    }
}