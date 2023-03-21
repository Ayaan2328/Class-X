import java.util.Scanner;

public class ArrayMerge {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        int i, j;
        System.out.println("Enter Array size of 2 arrays: ");
        int a = ad.nextInt();
        int b = ad.nextInt();
        int c = a+b;
        int d[] = new int[a];
        int e[] = new int[b];
        int f[] = new int[c];
        System.out.println("Enter array values:");
        for(j = 0; j<d.length; j++)
            d[j] = ad.nextInt();
        for(j = 0; j<e.length; j++)
            e[j] = ad.nextInt();
        for(i = 0; i<d.length; i++)
        {
            f[i] = d[i];
        }
        for(i = 0; i<e.length; i++)
        {
            f[a] = e[i];
            a++;
        }
        System.out.print("1st Array: ");
        for(j = 0; j<d.length; j++)
        {
            System.out.print(d[j]+" ");
        }
        System.out.println();
        System.out.print("2nd Array: ");
        for(j = 0; j<e.length; j++)
        {
            System.out.print(e[j]+" ");
        }
        System.out.println();
        System.out.print("Merged Array: ");
        for(j = 0; j<f.length; j++)
        {
            System.out.print(f[j]+" ");
        }
    }
}
