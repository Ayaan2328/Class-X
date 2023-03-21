import java.util.Scanner;

public class Ques11 {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = ad.nextInt();
        int i, check=0,a=0,b=0;
        for(i = 1; i<=num; i++)
        {
            if((i*(i+1))==num)
            {
                a = i;
                b = (i+1);
                check = 1;
            }
        }
        if(check==1)
        {
            System.out.println("NUMBER IS PRONIC");
            System.out.println(num+" = "+a+" * "+b);
        }
        else
            System.out.println("NOT A PRONIC NUMBER");
    }
}
