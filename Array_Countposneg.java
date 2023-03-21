import java.util.Scanner;
public class Array_Countposneg {
    public static void main(String[] args) {
        int i, j, c=0, k=0;
        int a[] = new int[10];
        Scanner ad = new Scanner(System.in);
        System.out.println("Enter values : ");
        for(i = 0; i<10; i++)
        {
            a[i] = ad.nextInt();
        }
        for(j = 0; j<10; j++)
        {
            if(a[j]>0)
                k++;
            else
                if(a[j]<0)
                    c++;
        }
        System.out.println("Number of Positive (+) values : "+k);
        System.out.println("Number of Negative (-) values : "+c);
    }
}
