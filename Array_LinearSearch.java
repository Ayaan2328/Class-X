import java.util.Scanner;
public class Array_LinearSearch {
    public static void main(String[] args) {
        int[] a = new int[20];
        Scanner ad = new Scanner(System.in);
        int i,j, flag=0;
        System.out.println("Enter Array values : ");
        for(i = 0; i<20; i++)
        {
            a[i] = ad.nextInt();
        }
        System.out.print("Enter the value to be searched : ");
        int n = ad.nextInt();
        for(j = 0; j<20; j++)
        {
            if(a[j]==n)
            {
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
