import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.print("Enter total cost : ");
        double cost = ad.nextDouble();
        double bill=0.0;
        if (cost < 2000)
            bill = (95 / 100.0) * cost;
        else if (cost >= 2001 && cost < 5000)
            bill = (75 / 100.0) * cost;
        else if (cost >= 5001 && cost < 10000)
            bill = (65 / 100.0) * cost;
        else if (cost > 10000)
            bill = (60 / 100.0) * cost;
        System.out.println("Total Bill after discount = "+bill);
        }
    }
