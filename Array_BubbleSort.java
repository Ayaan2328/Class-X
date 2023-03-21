import java.util.*;
public class Array_BubbleSort {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner ad = new Scanner(System.in);
        int i, j, t;
        for(i = 0; i<10; i++)
        {
            a[i] = ad.nextInt();
        }
        for(i = 0; i<(a.length); i++)
        {
            for(j = 0; j<a.length-1; j++)
            {
                if (a[j] > a[j + 1]) { //for ascending ( > ), for descending ( < )
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        for(j = 0; j<10; j++)
        System.out.println(a[j]);
    }
}
