import java.util.Scanner;

public class Employee {
    double basic, da, hra, pf, gross, net_pay;
    String employee_name;
    void input(double a, String b)
    {
        basic = a;
        employee_name = b;
    }
    void calculate()
    {
        da = (0.80)*basic;
        hra = (0.10)*basic;
        pf = (0.12)*basic;
        gross = basic + da + hra;
        net_pay = gross - pf;
    }
    void display()
    {
        System.out.println("Name : "+employee_name);
        System.out.println("D.A. : "+da);
        System.out.println("H.R.A. : "+hra);
        System.out.println("P.F. : "+pf);
        System.out.println("Gross : "+gross);
        System.out.println("Net Pay : "+net_pay);
    }

    public static void main(String[] args) {
        Employee ob = new Employee();
        Scanner ad = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String y = ad.next();
        System.out.print("Enter BASIC : ");
        double x = ad.nextDouble();
        ob.input(x,y);
        ob.calculate();
        ob.display();
    }
}
