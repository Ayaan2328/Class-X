import java.util.Scanner;

public class Sandhya_VST3_3 {
    String name;
    double msalary, tax;
    Sandhya_VST3_3(String n, double m)
    {
        name = n;
        msalary = m;
    }
    public void calcu()
    {
        if(msalary>=500000)
        {
            if(msalary<=1000000)
                tax = (0.05)*msalary;
            else tax = (0.1)*msalary;
        }
    }
    public void display()
    {
        System.out.println("Name \t Annual Salary \t tax");
        System.out.println(name+" \t "+msalary+"   \t "+tax);
    }

    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.print("Enter your name and annual salary: ");
        String n = ad.nextLine();
        double m = ad.nextDouble();
        Sandhya_VST3_3 ob = new Sandhya_VST3_3(n,m);
        ob.calcu();
        ob.display();
    }
}
