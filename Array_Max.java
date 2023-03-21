import java.util.*;
public class Array_Max {
    public static void main(String[] args) {
        int max, i, j;
        int[] a = new int[10];
        int[] b = new int[10];
        Scanner ad = new Scanner(System.in);
        System.out.println("Enter values : ");
        for(i = 0; i<10; i++)
        {
            a[i] = ad.nextInt();
        }
        max = a[0];
        for(j = 0; j<10; j++)
        {
            if(a[j]>max)
                max = a[j];
        }
        System.out.println(max);
    }
}
