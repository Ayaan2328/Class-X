import java.util.Scanner;
public class Pg340_Ques23 {
    public double volume(double r)
    {
        double v;
        v = (4/3.0)*(22.0/7)*r*r*r;
        System.out.println("volume of sphere = " +v);
        return(v);
    }
    public double volume(double h, double r)
    {
        double v;
        v = (22/7.0)*r*r*h;
        System.out.println("volume of cylinder = " +v);
        return(v);
    }
    public double volume(double l, double b, double h)
    {
        double v;
        v = l*b*h;
        System.out.println("volume of cuboid = " +v);
        return(v);
    }

    public static void main(String[] args) {
        double a,b,c,d,e,f;
        Pg340_Ques23 wk = new Pg340_Ques23();
        Scanner ad = new Scanner(System.in);
        System.out.print("Enter radius of sphere : ");
        a = ad.nextDouble();
        System.out.println("Enter height and radius of cylinder : ");
        b = ad.nextDouble();
        c = ad.nextDouble();
        System.out.println("Enter length, breadth and height of cuboid : ");
        d = ad.nextDouble();
        e = ad.nextDouble();
        f = ad.nextDouble();
        wk.volume(a);
        wk.volume(b,c);
        wk.volume(d,e,f);
    }
}
