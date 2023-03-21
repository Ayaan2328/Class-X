import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        int a[] = {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010};
        int l = 0, u = 9;
        int i, mid, flag = 0;
        System.out.println("Enter your year of graduation: ");
        int c = ad.nextInt();
        for(i = 0; i<10; i++)
        {
            mid = (u+l)/2;
            if(a[mid]<c)
                l = mid+1;
            else if(a[mid]>c)
                u = mid-1;
            else if(a[mid]==c) {
                flag = 1;
                break;
            }
        }
        if(flag==1)
            System.out.println("RECORD EXISTS");
        else System.out.println("RECORD DOES NOT EXIST");
    }
}
