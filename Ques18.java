import java.util.Scanner;

public class Ques18 {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        String a[] = new String[5];
        long b[] = new long[5];
        int i, j, flag=0, x=0;
        System.out.println("Enter names : ");
        for(i = 0; i<5; i++)
            a[i] = ad.next();
        System.out.println("Enter respective telephone numbers : ");
        for(j = 0; j<5; j++)
            b[j] = ad.nextLong();
        System.out.print("Enter name to be searched : ");
        String c = ad.next();
        for(i = 0; i<5; i++)
        {
            if(a[i].equalsIgnoreCase(c)) {
                flag = 1;
                x = i;
            }
        }
        if(flag==1) {
            System.out.println("Search successful");
            System.out.println(a[x]+" - "+b[x]);
        }
        else
            System.out.println("Search unsuccessful. Name not enlisted.");
    }
}
