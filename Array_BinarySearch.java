import java.util.*;
public class Array_BinarySearch {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        int b[] = new int[10];
        int i;
        for(i = 0; i<10; i++)
        {
            b[i] = ad.nextInt();
        }
        System.out.println("Enter num to be searched");
        int c = ad.nextInt();
        int l = 0, u = b.length-1, flag = 0, mid;
        while(l<=u) {
            mid = (l + u) / 2;
            if (b[mid] > c)
                u = mid - 1;
            else if (b[mid] < c)
                l = mid + 1;
            else if (b[mid] == c) {
                flag = 1;
                break;
            }
        }
        if(flag==1)
            System.out.println("Value found");
        else
            System.out.println("Value not found in the Array");
    }
}