import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = ad.nextDouble();
        if(n<0)
            System.out.println("The natural logarithm and the square of "+n+" would be runtime error as "+n+" is negative");
        System.out.println("Natural Logarithm of "+n+" = "+Math.log(n));
        System.out.println("Absolute value of "+n+" = "+Math.abs(n));
        System.out.println("Square root of "+n+" = "+Math.sqrt(n));
        System.out.println("Random number between 0 and 1 = "+Math.random());
    }
}
