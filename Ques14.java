import java.util.*;
public class Ques14 {
    String name; int units; double bill;
    public void accept()
    {
        Scanner ad = new Scanner(System.in);
        System.out.print("Enter your name : ");
        name = ad.next();
        System.out.print("Enter the number of units consumed : ");
        units = ad.nextInt();
    }
    public void calculate() {
        if (units <= 100)
            bill = 2.0 * units;
        else if (units > 100 && units <= 300)
            bill = 3.0 * (units - 200) + (2.0 * 100);
        else if (units > 300)
            bill = 5.0 * (units - 300) + (3.0 * 200) + (2.0 * 100) + ((2.5 / 100) * units);

    }
    public void display()
    {
        System.out.println("NAME OF CUSTOMER\t NUMBER OF UNITS CONSUMED\t   BILL");
        System.out.println("    "+name+"\t                   "+units+"\t              "+bill); //4 NAME UNITS 19 BILL 14
    }

    public static void main(String[] args) {
        Ques14 ob = new Ques14();
        ob.accept();
        ob.calculate();
        ob.display();
    }
}