import java.util.Scanner;

public class Sandhya_VST13_4 {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        int a[] = {2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015,2016,2017,2018,2019};
        System.out.println("Enter the year you want to search: ");
        int year = ad.nextInt();
        int i, flag=0;
        for(i = 0; i<a.length; i++)
        {
            if(a[i]==year)
                flag = 1;
        }
        if(flag==1)
            System.out.println("Board exam was done in the year "+year);
        else System.out.println("Board exam was not done in the year "+year);
    }
}
