import java.util.Scanner;

public class Sandhya_VST3_8 {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        String a[] = new String[20];
        int i, j; String t;
        System.out.println("Enter array values : ");
        for(i = 0; i<20; i++)
            a[i] = ad.nextLine();
        for(j = 0; j<20; j++)
        {
            if(a[j].compareTo(a[j+1])<0)
            {
                t = a[j];
                a[j] = a[j+1];
                a[j+1] = t;
            }
        }
        for(i = 0; i<20; i++)
            System.out.println(a[i]);
    }
}
