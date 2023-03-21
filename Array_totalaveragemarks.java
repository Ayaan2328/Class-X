import java.util.*;
public class Array_totalaveragemarks {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        int i, j, s=0; double avg;
        int mark[] = new int[5];
        for(i = 0; i<5; i++)
        {
            mark[i] = ad.nextInt();
        }
        for(j = 0; j<5; j++)
        {
            s = s + mark[j];
        }
        avg = s/5.0;
        System.out.println("TOTAL MARKS : "+s);
        System.out.println("AVERAGE : "+avg);
    }
}
