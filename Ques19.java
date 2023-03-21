import java.util.*;
public class Ques19 {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.println("Enter String : ");
        String a = ad.next();
        a = a.toUpperCase();
        int l = a.length();
        int i=0,j=0;
        char b = ' ', c=' ';
        for(c='A'; c<='Z';c++)
        {
            for(i=0; i<l; i++)
            {
                b = a.charAt(i);
                if(c==b)
                    j++;
            }
            if(j>0)
            {
                System.out.println(c+" = "+j);
                j=0;
            }
        }
    }
}