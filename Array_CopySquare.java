import java.util.Scanner;
public class Array_CopySquare {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        int i, j;
        int[] a = new int[10];
        int[] b = new int[10];
        System.out.println("Enter values : ");
        for(i = 0; i<10; i++)
            a[i] = ad.nextInt();
        for(j = 0; j<10; j++)
        {
            b[j] = a[j]*a[j];
        }
        System.out.println("Array 1\t Array 2");
        for(i=0; i<10; i++)
        System.out.println("  "+a[i]+"   \t   "+b[i]);
    }
}
