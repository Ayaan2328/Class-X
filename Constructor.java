import java.util.*;
public class Constructor {
    int a,b;
    Constructor()
    {
        a = 0;
        b = 0;
    }
    Constructor(int x, int y)
    {
        a = x;
        b = y;
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.println("Enter values : ");
        int a = ad.nextInt();
        int b = ad.nextInt();
        Constructor ob = new Constructor(a,b);
    }
}
