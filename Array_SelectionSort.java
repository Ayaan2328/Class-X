import java.util.*;
public class Array_SelectionSort {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        int i, j,k, min, t, b;
        int[] a = new int[10];
        for(i = 0; i<10; i++)
        {
            a[i] = ad.nextInt();
        }
        for(j = 0; j<9; j++)
        {
            min = j;
            for(k = j+1; k<10; k++)
            {
                if(a[k]<a[min])
                min=k;
            }
            t = a[j];
            a[j] = a[min];
            a[min] = t;
        }
        for(b = 0; b<10; b++)
        System.out.println(a[b]);
    }
}
