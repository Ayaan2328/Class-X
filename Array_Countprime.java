import java.util.*;
public class Array_Countprime {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        int a[] = new int[10];
        int i, j, c=0, d=0,k;
        System.out.println("Enter values : ");
        for(i = 0; i<10; i++)
        {
            a[i] = ad.nextInt();
        }
        for(j=0; j<10; j++)
        {
            for(k=1; k<=a[j]; k++)
            {
                if(a[j]%k==0)
                    c++;
            }
            if(c==2)
                d++;
        }
        System.out.println("Number of Prime values : "+d);
    }
}
