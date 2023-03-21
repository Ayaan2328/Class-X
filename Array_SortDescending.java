import java.util.Scanner;

public class Array_SortDescending {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        String a[] = new String[5];
        int b[] = new int[5];
        int i, j, t; String name;
        for(i = 0; i< 5; i++)
        {
            System.out.print("Name: ");
            a[i] = ad.next();
            System.out.println("Marks: ");
            b[i] = ad.nextInt();
        }
        for(i = 0; i<5; i++)
        {
            for(j = 0; j<4; j++)
            {
                if(b[j]<b[j+1])
                {
                    t = b[j];
                    b[j] = b[j+1];
                    b[j+1] = t;

                    name = a[j];
                    a[j] = a[j+1];
                    a[j+1] = name;
                }
            }
        }
        System.out.println("Names \t Marks");
        for(i = 0; i<5; i++)
        {
            System.out.println(a[i]+"\t "+b[i]);
        }
    }
}
